package com.dunzo.chaipoint;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ChaipointApplication implements CommandLineRunner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ChaipointApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ChaipointApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String link = "https://www.npoint.io/docs/e8cd5a9bbd1331de326a";
		//URL url = new URL(link);
		/*URLConnection  u = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(u.getInputStream()));
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();
		if (responsecode != 200)
			throw new RuntimeException("HttpResponseCode: " + responsecode);

		else {*/
			 BufferedReader reader = null;
			 try {
				  URL url = new URL(link);
			        reader = new BufferedReader(new InputStreamReader(url.openStream()));
			        StringBuffer buffer = new StringBuffer();
			        int read;
			        char[] chars = new char[1024];
			        while ((read = reader.read(chars)) != -1)
			            buffer.append(chars, 0, read); 

			        LOGGER.info(buffer.toString());
			 }catch (Exception e) {

			}
			
			
		}

	}


