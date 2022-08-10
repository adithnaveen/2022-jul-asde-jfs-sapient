package com.naveen.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trainer {
	private int trainerId;
	private String trainerName;
	private String trainerEmail;
	private double trainerIncome;
}
