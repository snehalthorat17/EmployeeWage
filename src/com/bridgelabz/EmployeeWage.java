package com.bridgelabz;

public class EmployeeWage {
    final static int IS_FULL_TIME = 1;
    final static int IS_PART_TIME = 2;
    static int EMP_RATE_PER_HOUR = 20;
    static int NUM_OF_WORKING_DAYS = 20;
    static int MAX_HRS_IN_MONTH = 100;
    public  static void  main(String args[])
    {
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
        {
            int empHrs =0;
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck){
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            int empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("EMP wage is: "+empWage);
        }
        System.out.println("Total Emp wage: " +totalEmpWage);
    }


}
