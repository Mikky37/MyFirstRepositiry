package org.amalitech.classcode12122019;

import java.util.Scanner;

public class ClassCode_12122019 {
	
	public static void main(String [] args) {
		
		//Find the sum of all numbers between 1 and 200
		
		//Display a user guide or inform customers on what to do
		String app_instruction_str = "Welcome, this is a simple calculator "
				+ "\nto find the sum of numbers."
				+ "\nPlease enter your first number";
		
		System.out.println(app_instruction_str);
		
		//Initializing a Scanner Class
		Scanner kybd = new Scanner(System.in);
		int kybd_x_i = kybd.nextInt();
	/*	String tell_user_smth = "You entered %s";
		tell_user_smth = String.format(tell_user_smth, Integer.toString(kybd_x_i));*/
		System.out.println(telltUserWhatWasEntered(kybd_x_i));
		
		System.out.println("Please enter your second number");
		
		int kybd_y_i = kybd.nextInt();
		kybd.close();
/*		String tell_user_num = "You entered %s";
		tell_user_num = String.format(tell_user_num, Integer.toString(kybd_y_i));*/
		System.out.println(telltUserWhatWasEntered(kybd_y_i));
		
		//Initial Equation (Pre Abstraction)
		
		//Declaration of variables
		int x,y;
		x = kybd_x_i;
		y = kybd_y_i;
		//z = 2;
		
		//Pre Abstraction : (x + y) * (y / z)
		int result;
		
		//result = (x + y) * (y / z);
		//we want to use methods instead
		result = calculateTheSum(x, y);
		
		String output_stmnt = "The sum of all numbers between %s and %s is ";
		
		//String formatting
		output_stmnt = String.format(output_stmnt, x, y);
		
		System.out.println(output_stmnt + result);
		
		}
		
//SECOND HALF:
	//Creating of methods or functions
	
	public static int calculateTheSum(int x, int y) {
		int z = 2;
		int rslt = (x + y) * (y / z);
		return rslt;
	}
	
	public static String telltUserWhatWasEntered(int kybd){
		
		String tell_user_smth = "You entered %s";
		tell_user_smth = String.format(tell_user_smth, Integer.toString(kybd));
		return tell_user_smth;
	}
}