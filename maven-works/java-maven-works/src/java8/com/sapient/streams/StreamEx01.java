package com.sapient.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StreamEx01 {
	public static void main(String[] args) throws IOException {
		  Files.list(Paths.get((".")))
					.map(Path :: getFileName)
					.map(Path :: toString)
					.filter(name  -> name.endsWith("txt"))
					.limit(3)
					.sorted()
					.map(name -> name.toUpperCase() )
					.forEach(System.out :: println);
	}
}