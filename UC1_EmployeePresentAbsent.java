// UC1: Check Employee Is Present Or Absent

package com.Assign3.EmplyeeWage.BridgeLabz;
public class UC1_EmployeePresentAbsent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_FULL_TIME = 1; 
		double employeeCheck = Math.floor(Math.random()*10) % 2;
		if (employeeCheck == IS_FULL_TIME)
		System.out.println("Employee Is Present");
		else
			System.out.println("Employee Is Absent");
	}
}
