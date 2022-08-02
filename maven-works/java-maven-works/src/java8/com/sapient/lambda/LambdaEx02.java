package com.sapient.lambda;

@FunctionalInterface
interface Executable {
	int execute(int a, int b);
}

@FunctionalInterface
interface StringExecucte {
	String execute(String a, String b);
}

@FunctionalInterface
interface Maths {
	int operation(int a, int b); 
}


class Runner {
	public void run(Executable ex) {
		int a = 100;
		int b = 200;
		int retVal = ex.execute(a, b);
		System.out.println("Ret Val " + retVal);
	}

	public void run(Executable ex, int a, int b) {
		int retVal = ex.execute(a, b);
		System.out.println("Ret Val " + retVal);
	}
	
	
	public void run(StringExecucte ex, String name1, String name2) {
		System.out.println(ex.execute(name1, name2));
	}
}

public class LambdaEx02 {
	public static void main(String[] args) {
		Runner runner = new Runner();
		// old style
		runner.run(new Executable() {

			@Override
			public int execute(int a, int b) {
				return a + b;
			}
		});
		System.out.println("----------------------------");
		runner.run((  a,  b)  ->   a + b);

		System.out.println("----------------------------");
		runner.run( (name1, name2) -> name1.concat(name2),
					"Rohan", "Agarwal" );
		
		System.out.println("----------------------------");
		Executable ex = (a, b) -> a +b; 
		int retVal = ex.execute(100, 200);
		System.out.println("Ret Val in Main with Ex :" + retVal);
		
		
		// math works 
		Maths addition = (num1, num2) -> num1 + num2;
		Maths substraction = (num1, num2) -> num1 - num2;
		Maths multiplication = (num1, num2) -> num1 * num2;
		Maths division = (num1, num2) -> num1 / num2;

		System.out.println(operate(10, 20, addition));
		System.out.println(operate(10, 20, substraction));
		System.out.println(operate(10, 20, multiplication));
		System.out.println(operate(10, 20, division));
		
		
	}
	 private static int operate(int num1, int num2, Maths math) {
		 return math.operation(num1, num2); 
	 }
	
} 