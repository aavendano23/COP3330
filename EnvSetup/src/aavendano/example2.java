package aavendano;
import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		/*
	     * (Arithmetic) Write an application that asks the user to enter two integers, 
	     * obtains them from the user and prints their sum, product, difference and quotient 
	     * (division).
	     */
		
		Scanner scnr = new Scanner(System.in);
		int num1;
		int num2;
		
		num1 = scnr.nextInt();
		num2 = scnr.nextInt();
		
		System.out.println("sum: " + (num1 + num2));
		System.out.println("product: " + (num1 * num2));
		System.out.println("difference: " + (num1 - num2));
		System.out.println("quotient: " + (num1 / num2));

	}

}
