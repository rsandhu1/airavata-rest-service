package org.airavata.client.rest;

import java.util.Properties;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.airavata.client.utils.PropertyUtils;
import org.apache.airavata.api.Airavata;
import org.apache.log4j.Logger;

public abstract class AbstractService {
	   
	protected Properties properties;
	protected static Logger log;
	protected Airavata.Client airavata;

	public AbstractService() throws Exception{
	    log = Logger.getLogger(getClass());
		properties = PropertyUtils.getProps();
		log.debug("Loaded properties from file.");
		if(properties == null){
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
//		AiravataUtils.setExecutionAsClient();
//			airavata = AiravataClientFactory.createAiravataClient(THRIFT_SERVER_HOST, THRIFT_SERVER_PORT);
	}
}
