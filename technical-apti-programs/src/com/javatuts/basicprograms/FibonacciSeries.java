/*print fibonacci series number without using recursion*/
package com.javatuts.basicprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		System.out.println("Fibonacci Series Numbers");
		System.out.println("\n" + a + "\n\n" + b);
		for (int d = 2; d <= 10; d++) {
			c = a + b;
			System.out.println("\n" + c + "\n");
			a = b;
			b = c;
		}
	}

}
