package com.cg.upskillling;

public class LocalVariable {
		
		public static void main(String[] args) {
			int x = 10; // x is a local variable
			String message = "Hello, world!"; 
			
			System.out.println("x = " + x);
			System.out.println("message = " + message);
			
			if (x > 5) {
				String result = "x is greater than 5"; 
				System.out.println(result);
			}
			
			
			for (int i = 0; i < 3; i++) {
				String loopMessage = "Iteration " + i; 
				System.out.println(loopMessage);
			}
			

		}
	}



