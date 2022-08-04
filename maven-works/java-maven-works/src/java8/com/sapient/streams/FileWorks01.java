package com.sapient.streams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWorks01 {
	public static void main(String[] args) throws IOException {
		// old style
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try {
			fileWriter = new FileWriter(new File("sample.txt"));
			bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write("Hello All");
			bufferedWriter.newLine();

			bufferedWriter.write("How are you doing ");
			bufferedWriter.newLine();

			bufferedWriter.write("Weather in blr is cloudy... ");
			bufferedWriter.newLine();

			System.out.println("Data written... ");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
				fileWriter.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// newer version of code
		// try-with
		try (
				FileWriter fileWriter1 = new FileWriter(new File("sample1.txt"));
				BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);) {
			bufferedWriter1.write("How are you doing ");
			bufferedWriter1.newLine();

			bufferedWriter1.write("Weather in blr is cloudy... ");
			bufferedWriter1.newLine();
		}

	}
}
