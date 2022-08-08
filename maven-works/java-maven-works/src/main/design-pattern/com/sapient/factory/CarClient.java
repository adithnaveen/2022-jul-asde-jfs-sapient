package com.sapient.factory;

public class CarClient {
	public static void main(String[] args) {
		Car car = Car.getCar(Cars.MARUTIBREEZA);
		
		
		car = Car.getCar(Cars.HYUNDAICRETA);
		
		
		car = Car.getCar(Cars.BMWX1);
	}
}
