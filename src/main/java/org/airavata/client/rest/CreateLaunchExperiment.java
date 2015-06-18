package org.airavata.client.rest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.airavata.client.message.Message;
import org.airavata.client.message.MessageResponse;
import org.airavata.client.message.Parameters;
import org.airavata.client.utils.MessageUtil;
import org.airavata.client.utils.ServiceConstants;


@Path("/job/runjob")
public class CreateLaunchExperiment extends AbstractService{

	public CreateLaunchExperiment() throws Exception {
		super();
	}
	
	@Path("/sync")
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public MessageResponse submitJobSync(Message message) {
	
		String expName = message.getHeader().getExperimentName();
		MessageResponse response = new MessageResponse();
		String messageXML = MessageUtil.readRequestMessage(message);
		log.info("Sync Resuest recived from client at :" + new Date() + " : and assigned experiment name :" + expName
				+ "with message" + messageXML);
		try {
			submitSyncRequest(message);
		} catch (Exception e) {
			try {
				response.setMessage("Failed to submit job to gfac");
			} catch (Exception e1) {
//				response.setStatus(ServiceConstants.ERROR);
				response.setMessage(e1.getLocalizedMessage());
			}
//			response.setStatus(ServiceConstants.ERROR);
			response.setMessage(e.getLocalizedMessage());
		}
//		response.setExperimentid(expID);
		return response;
	}

	@Path("/async")
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public MessageResponse submitJobAsync(Message message) {
		
		String expID = message.getHeader().getExperimentName();
		MessageResponse response = new MessageResponse();
		String messageXML = MessageUtil.readRequestMessage(message);

		log.info("Async Resuest recived from client at :" + new Date() + " : and assigned experiment id :" + expID
				+ "with message" + messageXML);
		try {
			submitAsyncRequest(message);
		} catch (Exception e) {
			try {
				response.setMessage("Failed to submit job to gfac" + e.getLocalizedMessage());
			} catch (Exception e1) {
//				response.setStatus(ServiceConstants.ERROR);
				response.setMessage(e1.getLocalizedMessage());
			}
//			response.setStatus(ServiceConstants.ERROR);
			response.setMessage(e.getLocalizedMessage());
		}
		response.setExperimentid(expID);
		return response;
	}

	@Path("/resubmitasync")
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public MessageResponse submitRecoverJobAsync(Message message) {
		MessageResponse response = new MessageResponse();
		String messageXML = MessageUtil.readRequestMessage(message);
		String expID = message.getHeader().getExperimentid();
		log.info("Async Resuest recived from client at :" + new Date() + " : and assigned experiment id :" + expID
				+ "with message " + messageXML);
		try {
			submitAsyncRequest(message);
		} catch (Exception e) {
			try {
				response.setMessage("Failed to submit job to gfac");
			} catch (Exception e1) {
//				response.setStatus(ServiceConstants.ERROR);
				response.setMessage(e1.getLocalizedMessage());
			}
//			response.setStatus(ServiceConstants.ERROR);
			response.setMessage(e.getLocalizedMessage());
		}
		response.setExperimentid(message.getHeader().getExperimentid());
		return response;
	}

	
	private void submitSyncRequest(Message message) throws Exception {
//		UltrascanRun client = new UltrascanRun();
		try {
//			client.runWorkflow(message);
		} catch (Exception e) {
			throw e;
		}
	}

	private void submitAsyncRequest(final Message message) throws Exception {
		log.info("Async call to run job");
		JobRunner jobRunner = new JobRunner(message);
		ExecutorService pool = Executors.newFixedThreadPool(1);
		try {
			Future<String> future = pool.submit(jobRunner);
			future.get();
		} catch (Exception e) {
			throw e;
		} finally {
			pool.shutdown();
		}
	}

	private void writeJobXML(String experimentID, Message message) throws Exception {
		try {
			String inputLocation = properties.getProperty(ServiceConstants.INPUTLOCATION);
			if (inputLocation == null) {
				inputLocation = ".";
			}
			File file = new File(inputLocation + File.separatorChar + experimentID);
			log.info("Input Location " + file.getAbsolutePath());
			if (file != null && !file.exists()) {
				file.mkdir();
			}
			File jobFile = new File(file.getAbsolutePath() + File.separator + "jobxmlfile.xml");
			String filePath = "file://" + jobFile.getAbsolutePath();
			Parameters parameters = new Parameters();
			parameters.setName("jobxml");
			parameters.setValue(filePath);
			message.getBody().getInput().getParameters().add(parameters);

			log.info("Job File Location " + jobFile.getAbsolutePath());
			BufferedWriter out = new BufferedWriter(new FileWriter(jobFile));
			out.write(MessageUtil.readRequestMessage(message));
			out.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	class JobRunner implements Callable<String> {
		Message message;

		protected JobRunner(Message message) {
			this.message = message;
		}

		public String call() throws Exception {
//			UltrascanRun client = new UltrascanRun();
			try {
//				client.runWorkflow(message);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			return "OK";
		}

	}

}
