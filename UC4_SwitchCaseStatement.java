package com.Assign3.EmplyeeWage.BridgeLabz;

public class UC4_SwitchCaseStatement {
	public static final int FULL_TIME_IS = 1;
    public static final int PART_TIME_IS = 2;
    public static final int EMP_WAGE_PER_HOUR = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int EmployeeWorkingHour;
	        int EmployeePresence = (int) Math.floor(Math.random() * 10) % 3;
	        System.out.println("EmployeeCase : " + EmployeePresence);
	        switch (EmployeePresence) {
	            case FULL_TIME_IS:
	                System.out.println("Employee is Full Time present");
	                EmployeeWorkingHour = 8;
	                break;
	            case PART_TIME_IS:
	                System.out.println("Employee is Part Time Present");
	                EmployeeWorkingHour = 4;
	                break;
	            default:
	                System.out.println("Employee is Absent");
	                EmployeeWorkingHour = 0;
	        }

	                int EmployeeWage = EMP_WAGE_PER_HOUR * EmployeeWorkingHour;
	                System.out.println("TotalEmployeeWage : " + EmployeeWage);

	}

}
