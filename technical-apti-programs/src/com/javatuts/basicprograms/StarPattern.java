package com.javatuts.basicprograms;

public class StarPattern {
	public static void main(String[] args) {

		int row = 6, i, j;
		for (i = 0; i < row; i++) {

			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
		for (int m = 0; m <= 6; m++) {
			for (int n = 0; n < m; n++) {
				System.out.print(" ");
			}
			for (int n = 6; n >= m; n--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
