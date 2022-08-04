package com.sapient.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileWorks02 {
	public static void main(String[] args) throws IOException{
		// old style code 
		BufferedReader br = new BufferedReader(new FileReader("sample.txt")); 
		
		String data = null;
		while(( data = br.readLine()) != null) {
			System.out.println(data);
		}
		
		System.out.println("----------------------");
		
		// try with 
		try(
				BufferedReader br1 = new BufferedReader(new FileReader("sample.txt")); 
				){
			
			br1.lines().forEach(System.out :: println);
		}
		
		// without using try-with only with streams 
		
		try ( Stream<String> st =  Files.lines(Paths.get("sample.txt"))) {
			st.forEach(System.out :: println);
		}
	}
	
}
