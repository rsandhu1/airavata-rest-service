package org.airavata.client.rest;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.airavata.client.message.MessageResponse;
import org.airavata.client.utils.PropertyUtils;
import org.airavata.client.utils.ServiceConstants;
import org.apache.airavata.model.workspace.experiment.JobState;
import org.apache.airavata.model.workspace.experiment.JobStatus;


public class CancelExperiment  extends AbstractService{

	public CancelExperiment() throws Exception {
		super();
	}

	private static Properties properties;

	@GET
	@Path("{experimentid}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public MessageResponse cancelRunningJob(@PathParam("experimentid") String experimentID) {
		MessageResponse messageResponse = new MessageResponse();
		try {
			Map<String, JobStatus> jobStatuses  = getJobData(experimentID);
			Set<String> strings = jobStatuses.keySet();
            for (String key : strings) {
                JobStatus jobStatus = jobStatuses.get(key);
             if(jobStatus == null){
            	 throw new Exception("Experiment " + experimentID + " not found");
             } else if(JobState.COMPLETE.equals(jobStatus.getJobState())){
            	 throw new Exception("Experiment " + experimentID + " COMPLETED");
             }else{
                 messageResponse.setStatus("CANCELED");
                 log.info("Cancelled Job " + experimentID);
     		
             }
            }
           } catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			messageResponse.setStatus(ServiceConstants.ERROR);
			messageResponse.setMessage(e.getLocalizedMessage());
		}
		return messageResponse;
	}

	private Map<String, JobStatus> getJobData(String experimentID) throws Exception {
		try {
			Map<String, JobStatus> jobStatuses = airavata.getJobStatuses(experimentID);
			return jobStatuses;
		} catch (Exception e) {
			throw e;
		}
	}

	public static Properties getProperties() throws Exception {
		if (null == properties) {
			properties = PropertyUtils.loadProperty(ServiceConstants.PROPERTYFILE_NAME);
		}
		return properties;
	}
}
