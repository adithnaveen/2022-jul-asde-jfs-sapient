package com.naveen.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.naveen.beans.Trainer;
import com.naveen.controller.TrainerController;
import com.naveen.util.Util;

public class App {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TrainerController controller = new TrainerController();

		while (true) {
			System.out.println("Enter your choice 1. Register 2. Get Trainer 3.  Exit");
			int choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:
				System.out.println("Enter Name: ");
				String name = br.readLine();

				System.out.println("Enter Email (userId)");
				String email = br.readLine();

				System.out.println("Enter password");
				String password = br.readLine();

				Trainer trainer = controller.saveTrainer(Util.createTrainerBean(name, email, password));

				Util.showTrainer(trainer);

				break;

			case 2:

				System.out.println("Enter Trainer Id");
				int trainerId = Integer.parseInt(br.readLine());

				Util.showTrainer(controller.getTrainer(trainerId));

				break;
			case 3:
				System.out.println("Thank you ...");
				System.exit(0);
			default:
				System.out.println("Wrong choice try again... ");
				break;
			}

		}

	}
}
