package org.amalitech.classcode12122019;

public class FoodUSSD_App {
	
	//We are building a very simple console app
	//for users to select their meals for the
	//day before
	
	//1. Enter your name
	
	//2. if the name entered is ok and it is a human being
		//if the name is more than 2 characters, then proceed
		//else tell the user to enter a proper name
		//if the number of trials to get a proper name exceeds
		//3, give the user an option to restart the program
		//or end the program
	
	//3. If the name is now fully ok, then
		//show the menu available
	
	//4. Tell the user on level of success of selection of
		//meal
	
	static String name_of_person_str = "Kofi";
	
	String list_of_menu = "1. Fried Rice and Chicken"
			+ "\n2. Banku and Okro"
			+ "\n3. Chips and Chicken";
	
	static String success_message_str = "Hello "+name_of_person_str+ ", the meal you selected is ...";
	
	public static void main(String [] args) {
		System.out.println(success_message_str);
	}
	

}
