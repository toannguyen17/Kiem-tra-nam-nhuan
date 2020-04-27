package app;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter year:");
		Scanner scanner    = new Scanner(System.in);
		int year           = scanner.nextInt();
		boolean isLeapYear = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				}
			} else {
				isLeapYear = true;
			}
		}
		if (isLeapYear) {
			System.out.printf("%d is a leap year", year);
		} else {
			System.out.printf("%d is NOT a leap year", year);
		}
	}
}
