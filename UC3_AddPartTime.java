package com.Assign3.EmplyeeWage.BridgeLabz;

public class UC3_AddPartTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int FULL_TIME_IS = 1;
        int PART_TIME_IS = 2;
        int EMP_WAGE_PER_HOUR = 20;
        int EmployeeWorkingHour;
        double EmployeePresence = Math.floor(Math.random() * 10) % 3;
        System.out.println("EmployeeCase:"+ EmployeePresence);
        if (EmployeePresence == FULL_TIME_IS){
            System.out.println("Employee is Full Time Working");
            EmployeeWorkingHour = 8;
        }
        else if(PART_TIME_IS == EmployeePresence) {
            System.out.println("Employee is Part Time Working");
            EmployeeWorkingHour = 4;
        }
        else {
            System.out.println("Employee is Absent");
            EmployeeWorkingHour = 0;
        }
        int TotalEmployeeWage = EMP_WAGE_PER_HOUR * EmployeeWorkingHour;
        System.out.println("TotalWageForDay: "+ TotalEmployeeWage);

	}

}
