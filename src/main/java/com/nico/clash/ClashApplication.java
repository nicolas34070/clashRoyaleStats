package com.nico.clash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootApplication
public class ClashApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ClashApplication.class, args);

		URL url = new URL("https://api.clashroyale.com/v1/players/%23RRPG8LYL");
		URL url2 = new URL("https://api.clashroyale.com/v1/players/%23RRPG8LYL/upcomingchests");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		conn.setRequestProperty("Authorization","Bearer "+" eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6ImFhMTY2OWJjLWZlZDYtNGUwZC1hN2I3LWM3MDc1MWIzOTMyMCIsImlhdCI6MTYwNzAyOTkxNCwic3ViIjoiZGV2ZWxvcGVyLzBlZTY4MmJlLWU4YzAtZjczMC04ZjFkLTQ3NzIxMDkyOGY4ZCIsInNjb3BlcyI6WyJyb3lhbGUiXSwibGltaXRzIjpbeyJ0aWVyIjoiZGV2ZWxvcGVyL3NpbHZlciIsInR5cGUiOiJ0aHJvdHRsaW5nIn0seyJjaWRycyI6WyI5MS4xNjUuMjEzLjE3MCJdLCJ0eXBlIjoiY2xpZW50In1dfQ.RR6rOQqc6vG1C67ttHREOOS-973AcbEGHioN2Uk8N7kymDRYybif-BO9C0BJOFMaRJ3nQu0C2kQgTuBCmBM7Pg");

		conn.setRequestProperty("Content-Type","application/json");
		conn.setRequestMethod("GET");


		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String output;

		StringBuffer response = new StringBuffer();
		while ((output = in.readLine()) != null) {
			response.append(output);
		}

		in.close();
		// printing result from response
		System.out.println("Response:-" + response.toString());
	}

}
