package com.sapient.streams;

import java.util.function.BiFunction;
import java.util.function.Function;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@FunctionalInterface
interface TriFunction<T, U, V, R> {
	R apply(T t, U u, V v);
}

public class BiFunctionEx01 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunc = (num1, num2) -> num1 + num2;

		Integer result = biFunc.apply(10, 20);
		System.out.println(result);

		Function<Integer, Integer> func = (num1) -> num1 * num1;
		Integer result1 = func.apply(10);
		System.out.println(result1);

		TriFunction<Integer, Integer, Integer, Double> triFunction = (num1, num2, num3) -> {
			return new Double(num1 + num2 + num3);
		};

		Double result2 = triFunction.apply(10, 20, 30);
		System.out.println(result2);

		// workaround

		BiFunction<MyNumber, Integer, Integer> biFunc1 = (num1, num2) ->    num1.getNum1() + num1.getNum2() + num2;
		
		System.out.println(biFunc1.apply(new MyNumber(10, 20), 30)); 
		
	}
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class MyNumber {
	private int num1; 
	private int num2; 
}



