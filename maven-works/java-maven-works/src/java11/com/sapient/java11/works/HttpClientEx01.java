package com.sapient.java11.works;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;



public class HttpClientEx01 {
	public static void main(String[] args) throws IOException, InterruptedException {
//		httpGet();
		
//		httpPost();
		
		System.out.println(Files.readString(Path.of("./sample.txt"))); 
		
		String myWord = "hello          "; 
		var othWord = "    "; 
		
		System.out.println(othWord.isBlank());
		System.out.println(othWord.isEmpty());
		
		
		
		System.out.println(myWord.length());
		System.out.println(myWord.strip().length());
		System.out.println(myWord.stripTrailing().length());
		
		
		
		List<String> list = new ArrayList<String>(); 
		List<Object> list1 = List.of();
				
		
	}

	private static void httpPost() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newBuilder().version(Version.HTTP_1_1).build();
		
		String data = "{\n"
				+ "  \"userId\": 2,\n"
				+ "  \"title\": \"some custom title \",\n"
				+ "  \"completed\": true\n"
				+ "}"; 
		
		
		
		  HttpRequest httpRequest = HttpRequest.newBuilder(URI.create("https://jsonplaceholder.typicode.com/todos"))
			.POST(BodyPublishers.ofString(data)).build(); 
		
		
		HttpResponse<String> response = client.send(httpRequest, BodyHandlers.ofString()); 
		
		String body = response.body(); 
		int statusCode = response.statusCode(); 
		
		System.out.println("Body : " + body);
		System.out.println("Status Code : " + statusCode);
	}

	private static void httpGet() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		
		
		Builder builder = HttpRequest.newBuilder().version(Version.HTTP_1_1)
			.uri(URI.create("https://jsonplaceholder.typicode.com/todos/1")); 
		
		HttpRequest request = builder.build();
		
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		
		String responseBody = response.body();
		int responseStatus = response.statusCode(); 
		
		
		System.out.println("Response Body : " + responseBody);
		System.out.println("Response Status : " + responseStatus);
	}
}
