package leapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yrStatus = "";		
		//capture the input in an integer
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter an Year :: ");
		int year = scan.nextInt();
        scan.close();
        boolean status = checkLeapYear(year);
		if(status == true) {
			yrStatus = "Specified year is a leap year";
		} else {
			yrStatus = "Specified year is not a leap year";
		}
		System.out.println(yrStatus);  

	}
	public static Boolean checkLeapYear(int year) { 
		// TODO Auto-generated method stub
		 if (((year % 4 == 0) && (year % 100 != 0)) || (year% 400 == 0))
	         return true;		 
	      else 
	         return false;
	  }
} 