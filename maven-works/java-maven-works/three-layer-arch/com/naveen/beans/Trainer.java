package com.naveen.beans;

// bean class 
// private variables, public getters/setters
public class Trainer {
	private int trainerId; 
	private String trainerName; 
	private String trainerEmail; 
	private String password;
	 

	public Trainer() {
		// TODO Auto-generated constructor stub
	}

	public Trainer(String trainerName, String trainerEmail, String password) {
		
		this.trainerName = trainerName; 
		this.trainerEmail = trainerEmail; 
		this.password = password; 
	}
	
	public int getTrainerId() {
		return trainerId;
	}
	

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerEmail() {
		return trainerEmail;
	}
	public void setTrainerEmail(String trainerEmail) {
		this.trainerEmail = trainerEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerEmail=" + trainerEmail
				+ ", password=" + password + "]";
	} 
	
	
}
