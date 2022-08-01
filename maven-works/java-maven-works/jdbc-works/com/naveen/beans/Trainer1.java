package com.naveen.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Trainer1 {
	private int trainerId; 
	private String trainerName; 
	private String trainerEmail; 
	private double trainerIncome;
	
}
