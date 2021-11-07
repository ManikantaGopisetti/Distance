package com.functionalprograms;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter x coordinate : ");
		int x = scan.nextInt();
		System.out.print("Enter y coordinate : ");
		int y = scan.nextInt();

		double distance = Math.pow(x * x + y * y, 0.5); // distance from point (x,y) to origin (0,0)
		System.out.println("Euclidean distance= " + distance);
	}

}
