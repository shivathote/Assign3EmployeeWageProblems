package com.Assign3.EmplyeeWage.BridgeLabz;

public class UC6_WageForTotalWorkingHour {
	public static final int FULL_TIME_IS = 1;
    public static final int PART_TIME_IS = 2;
    public static final int EMPLOYEE_WAGE_PER_HOUR = 20;
    public static final int NUMBER_OF_WORKING_DAY = 20;
    public static final int MAXIMUM_MONTH_WORKING_HOUR = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int EmployeeHour = 0;
        int TotalWorkingDays = 0;
        int TotalEmployeeHour = 0;
        while ( TotalEmployeeHour <= MAXIMUM_MONTH_WORKING_HOUR && TotalWorkingDays < NUMBER_OF_WORKING_DAY) {
            TotalWorkingDays++;
            int EmployeeCase = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("empCheck : " + EmployeeCase);
            System.out.println("Day : " +TotalWorkingDays);
            switch (EmployeeCase) {
                case FULL_TIME_IS:
                    System.out.println("Employee is Full Time present");
                    EmployeeHour = 8;
                    break;
                case PART_TIME_IS:
                    System.out.println("Employee is Part Time Present");
                    EmployeeHour = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    EmployeeHour = 0;
            }
            TotalEmployeeHour += EmployeeHour;
            System.out.println("totalWorkday" + " Emp Hrs :" + TotalEmployeeHour);
        }
            int totalEmpWage = EMPLOYEE_WAGE_PER_HOUR * TotalEmployeeHour;
            System.out.println("total Emp Wage: " + totalEmpWage);
        
    }

	}
