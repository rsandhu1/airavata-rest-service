//package org.ogce.gram.job;
//
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.ProtocolException;
//import java.net.URL;
//import java.util.concurrent.Callable;
//
//import javax.ws.rs.core.MediaType;
//
//import org.junit.Assert;
//import org.junit.Ignore;
//import org.junit.Test;
//
//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;
//import com.sun.jersey.multipart.BodyPart;
//import com.sun.jersey.multipart.MultiPart;
//
//public class GFacXSULClientTest {
//
//	@Ignore
//	public void testSubmitJobSync() {
//		try {
//			String message = generateMessage();
//			URL postUrl = new URL("http://localhost:9095/job/runjob/sync");
//			HttpURLConnection connection = (HttpURLConnection) postUrl.openConnection();
//			connection.setDoOutput(true);
//			connection.setInstanceFollowRedirects(false);
//			connection.setRequestMethod("POST");
//			connection.setRequestProperty("Content-Type", "application/xml");
//			OutputStream os = connection.getOutputStream();
//			os.write(message.getBytes());
//			os.flush();
//			System.out.println(connection.getResponseMessage());
//			Assert.assertEquals(HttpURLConnection.HTTP_CREATED, connection.getResponseCode());
//			String headerField = connection.getHeaderField("Location");
//			System.out.println("Location: " + headerField);
//
//			connection.disconnect();
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ProtocolException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//	@Ignore
//	public void testSubmitJobAsync() {
//		try {
//			String message = generateMessage();
//			URL postUrl = new URL("http://localhost:9095/job/runjob/async");
//			HttpURLConnection connection = (HttpURLConnection) postUrl.openConnection();
//			connection.setDoOutput(true);
//			connection.setInstanceFollowRedirects(false);
//			connection.setRequestMethod("POST");
//			connection.setRequestProperty("Content-Type", "application/xml");
//			OutputStream os = connection.getOutputStream();
//			os.write(message.getBytes());
//			os.flush();
//			System.out.println("Content-Type: " + connection.getContentType());
//			BufferedReader reader = new BufferedReader(new
//			InputStreamReader(connection.getInputStream()));
//			String line = reader.readLine();
//			while (line != null)
//			  {
//			     System.out.println(line);
//			     line = reader.readLine();
//			  }
//			Assert.assertEquals(HttpURLConnection.HTTP_OK, connection.getResponseCode());
//
//			connection.disconnect();
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ProtocolException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//	@Test
//	public void testSubmitJobASyncMultipart() {
//		try {
//			String message = generateMessage();
//			final String BASE_URI = "http://localhost:9095/job/";
//			 
//		    Client c = Client.create();
//		    FileInputStream inputStream = new FileInputStream("/Users/raminder/hpcinput.tar");
//		    WebResource service = c.resource(BASE_URI);
//			MultiPart multiPart = new MultiPart().bodyPart(new BodyPart(message, MediaType.APPLICATION_XML_TYPE)).
//		      bodyPart(new BodyPart(inputStream, MediaType.APPLICATION_OCTET_STREAM_TYPE));
//		 
//		    // POST the request
//		    ClientResponse response = service.path("/runjob/async").
//		      type("multipart/mixed").post(ClientResponse.class, multiPart);
//		    System.out.println("Response Status : " + response.getEntity(String.class));
//
//			} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	private String generateMessage() {
//		String message = "<Message>"
//				+ "<Header>"
//				+ "<hostname>queenbee.loni-lsu.teragrid.org</hostname>"
//				+ "<processercount>16</processercount>"
//				+ "<hostcount>2</hostcount>"
//				+ "<queuename>workq</queuename>"
//				+ "<walltime>60</walltime>"
//				+ "<userdn>/C=US/O=National Center for Supercomputing Applications/CN=Ultrascan3 Community User</userdn>"
//				+ "</Header>" + "<Body>" + "<Method>US3_Run</Method>" + "<input>" + "<parameters>"
//				+ "<name>inputData</name><value>/home/us3/test/hpcinput.tar</value>" + "</parameters>" + "</input>"
//				+ "</Body>" + "</Message>";
//		return message;
//	}
//	
//}
