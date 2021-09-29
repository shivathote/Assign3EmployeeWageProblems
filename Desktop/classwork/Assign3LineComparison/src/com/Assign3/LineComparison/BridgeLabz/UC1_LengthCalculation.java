package com.Assign3.LineComparison.BridgeLabz;
import java.util.Scanner;
public class UC1_LengthCalculation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner line = new Scanner(System.in);
		System.out.println("Enter the value of X coordinate at first point:");
		int x1 = line.nextInt();
		System.out.println("Enter the value of Y coordinate at first point:");
		int y1 = line.nextInt();
		System.out.println("Enter the value of X coordinate at second point:");
		int x2 = line.nextInt();
		System.out.println("Enter the value of Y coordinate at second point:");
		int y2 = line.nextInt();
		System.out.println("Enter the value of X coordinate at third point:");
		int x3 = line.nextInt();
		System.out.println("Enter the value of Y coordinate at third point:");
		int y3 = line.nextInt();
		System.out.println("Enter the value of X coordinate at fourth point:");
		int x4 = line.nextInt();
		System.out.println("Enter the value of Y coordinate at fourth point:");

		Double Length_of_line1 = Math.sqrt((x2-x1)^2+(y2-y1)^2);
		System.out.println("The Length Of Line Is:"+ Length_of_line1);
	
	}
}
