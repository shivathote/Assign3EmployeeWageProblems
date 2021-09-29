package com.Assign3.EmplyeeWage.BridgeLabz;

public class UC5_WageForMonth {
	public static final int FULL_TIME_IS = 1;
    public static final int PART_TIME_IS = 2;
    public static final int EMPlOYEE_WAGE_PER_HOUR = 20;
    public static final int NO_OF_WORK_DAY = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int EmployeeWorkingHour = 0;
        int Day = 0;
        int TotalEmployeeWage = 0;
        for (Day = 1; Day <= 20; Day++) {
        	int EmployeeCase = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("EmployeeCase: " + EmployeeCase);
            System.out.println("Day "+ Day);
            switch (EmployeeCase) {
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
            int EmployeeWage = EMPlOYEE_WAGE_PER_HOUR * EmployeeWorkingHour;
            System.out.println("TotalEmployeeWage: " + TotalEmployeeWage);
        }
    

	}

}
