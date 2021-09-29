//UC2: Calculate Daily Employee Wage

package com.Assign3.EmplyeeWage.BridgeLabz;

public class UC2_DailyEmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int Is_Full_Time = 1;
		int EmployeeWage_Per_Hour = 20;
		int EmployeeHour = 8; //Write Working Hour Here
		int EmployeeWage = 0;
		double EmployeeCheck = Math.floor(Math.random()*10) % 2;
		if (EmployeeCheck==Is_Full_Time) {
	}else {
		EmployeeWage = EmployeeWage_Per_Hour * EmployeeHour;
		System.out.println("Employee Wage Is:" + EmployeeWage);
		
	}
	}
	
	
}