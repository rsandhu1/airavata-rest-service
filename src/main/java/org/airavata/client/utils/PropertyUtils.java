package org.airavata.client.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;



public class PropertyUtils implements ServletContextListener{
	
	private static Properties props;
	/**
	 * Load a properties file from the classpath
	 * 
	 * @param propsName
	 * @return Properties
	 * @throws Exception
	 */
	public static Properties load(String propsName) throws IOException,Exception {
		if (props == null) {
			props = new Properties();
		}
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream propertyStream = classLoader.getResourceAsStream(propsName);
		props.load(propertyStream);
		return props;
	}

	/*
	* Load a properties file from the classpath
    * @param propsName
    * @return Properties
    * @throws Exception
    */
   public static Properties loadProperty(String propsName) throws Exception {
       try {
    	if (props == null) {
   			props = new Properties();
   		}
    	ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream propertyStream = classLoader.getResourceAsStream(propsName);
	
//		URL url = ClassLoader.getSystemResource(propsName);
		   props.load(propertyStream);
		   return props;
	} catch (IOException e) {
		throw new Exception("Error loading file"+ e.getLocalizedMessage(),e);
	}
   }
	/**
	 * Load a Properties File
	 * 
	 * @param propsFile
	 * @return Properties
	 * @throws IOException
	 */
	public static Properties load(File propsFile) throws IOException {
		if (props == null) {
   			props = new Properties();
   		}
    	FileInputStream fis = new FileInputStream(propsFile);
		props.load(fis);
		fis.close();
		return props;
	}

	public static void setProps(Properties props) {
		PropertyUtils.props = props;
	}

	public static Properties getProps() {
		return props;
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		props = null;
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		 ServletContext servletContext = servletContextEvent.getServletContext();
	        String propertyFile = servletContext.getInitParameter("configFile");
	        String fileURL = servletContext.getRealPath(propertyFile);
	        try {
				PropertyUtils.load(new File(fileURL));
				if(props == null){
					throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
				}
		} catch (IOException e) {
				throw new WebApplicationException(e);
			}catch (Exception e) {
				e.printStackTrace();
				throw new WebApplicationException(e);
			}
	}
}
