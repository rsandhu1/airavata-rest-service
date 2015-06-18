///**
// * 
// */
//package org.ogce.gram.job;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.ProtocolException;
//import java.net.URL;
//
//import org.junit.Assert;
//import org.junit.Test;
//
///**
// * @author raminder
// *
// */
//public class GramJobStatusTest {
//
//	@Test
//	public void testGramJobStatus() {
//		  try {
//			  URL getUrl = new URL("http://localhost:9095/job/jobstatus/Experiment-2oj3dLHzh3idF");
//			  HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
//			  connection.setRequestMethod("GET");
//			  System.out.println("Content-Type: " + connection.getContentType());
//
//			  BufferedReader reader = new BufferedReader(new
//			          InputStreamReader(connection.getInputStream()));
//
//			  String line = reader.readLine();
//			  while (line != null)
//			  {
//			     System.out.println(line);
//			     line = reader.readLine();
//			  }
//			  Assert.assertEquals(HttpURLConnection.HTTP_OK, connection.getResponseCode());
//			  connection.disconnect();
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
//	}
//
//}
