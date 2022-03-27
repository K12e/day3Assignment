package day3Problems;

public class employeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isFullTime=1;
		int empRatePerHr = 20;
		int empHrs = 0;
		int  empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10)% 2;
		
	    if(empCheck == isFullTime)
	    {
	    	empHrs=8;
	    empWage = empHrs * empRatePerHr;
	    System.out.println("emp wage "+empWage);
	    }
		
	}

}
