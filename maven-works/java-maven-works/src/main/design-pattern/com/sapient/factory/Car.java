package com.sapient.factory;

import lombok.extern.slf4j.Slf4j;

enum Cars {
	BMWX1, MARUTIBREEZA, HYUNDAICRETA
}

public abstract class Car {
	public static  Car getCar (Cars carName) {
		if(carName.equals(Cars.BMWX1)) {
			return new BMWX1(); 
		}else if(carName.equals(Cars.MARUTIBREEZA)) {
			return new MarutiBreeza(); 
		}else if(carName.equals(Cars.HYUNDAICRETA)) {
			return new HyundaiCreta();
		}
		return null; 
	}
	
	public abstract void drive(); 
	
}

@Slf4j
class BMWX1  extends Car{
	public BMWX1() {
		log.info("BMW Created.");
	}
	
	public  void drive() {
		log.info("Driving BMW X1");
	}
}

@Slf4j
class MarutiBreeza extends Car {
	public MarutiBreeza() {
		log.info("Maruti Breeza Created..");
	}
	public  void drive() {
		log.info("Driving Maruti Breeza");
	}
}
@Slf4j
class HyundaiCreta extends Car {
	public HyundaiCreta() {
		log.info("Hyundai Creata Created...");
	}
	
	public  void drive() {
		log.info("Driving Hyundai Creta");
	}
}