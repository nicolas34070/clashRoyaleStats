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
		
	}

}
