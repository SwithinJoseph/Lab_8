package co.grandcircus;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int userInput;
		String choice1;
		String cont;
		String[] studentName = { "Taryn Pace", "Domas Hibbert", "Rosemarie Hamer", "Jett Melia", "Ewen Draper",
				"Tyreese Koch", "Jensen Pollard", "Christine Raymond", "Gregor Lister", "Mikayla Bate" };
		String[] hometown = { "Elkins", "Fort Collins", "Tahlequah", "Peru", "Point Roberts", "Quincy", "Cullman",
				"Wyandotte", "Oregon", "Rock Island" };
		String[] favFood = { "tiramisu", "strawberries", "walnuts", "watermelon", "pizza", "pasta", "salmon", "steak",
				"salad", "sushi" };

		System.out.println("Welcome to our Java class.");

		do {
			userInput = Validator.getIntBetween(scnr,
					"Which student would you like to learn more about? (enter a number 1-10):", 1, 10);
			System.out.println("Student " + userInput + " is " + studentName[userInput]);

			do {
				System.out.println("What would you like to know about " + studentName[userInput] + "?");
				choice1 = Validator.getString(scnr, "(enter 'hometown' or 'favorite food')");

				if (choice1.equalsIgnoreCase("hometown")) {
					System.out.println(studentName[userInput] + " is from " + hometown[userInput] + ".");
				} else if (choice1.equalsIgnoreCase("favorite food")) {
					System.out.println(studentName[userInput] + " loves to eat " + favFood[userInput] + ".");
				} else {
					System.out.println();
				}
				System.out.println("Would you like to learn more about " + studentName[userInput] + "? (y/n)");
				cont = scnr.next();
			} while (cont.contentEquals("yes") || cont.contentEquals("y"));

			System.out.println("Would you like to learn about another student? (y/n)");
			cont = scnr.next();
		} while (cont.contentEquals("yes") || cont.contentEquals("y"));

		System.out.println("Goodbye!");

	}

}
