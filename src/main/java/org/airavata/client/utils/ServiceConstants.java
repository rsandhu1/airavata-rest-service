package org.airavata.client.utils;

public class ServiceConstants {

	
	public static final String USERDN = "userdn";
	
	public static final String INPUTLOCATION = "inputLocation";

	public static final String OUTPUTLOCATION = "outputLocation";

	public static final String FILE_HOSTNAME = "fileHostName";

	public static final String NODE_CONFIGURATION = "hostNodeCountConfiguration";
	
	public static final String SUBMITTED = "SUBMITTED";

	public static final String FAILED = "FAILED";

	public static final String ERROR = "ERROR";
	
	public static final String SUCCESS = "SUCCESS";

	public static final String COMPLETED = "COMPLETED";
	
	public static enum ExperimentStatus {INITIALIZED, ACTIVE, COMPLETED, FINISHED, FAILED,PENDING,DONE,SUSPENDED, UNSUBMITTED, SUBMITTED,CANCELED};

	public static final String PROPERTYFILE_NAME = "airavata-server.properties";

}
