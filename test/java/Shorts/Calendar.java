package Shorts;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter year:");
		String year = a.nextLine();
		System.out.println("Enter a month:");
		String month = a.nextLine();
		System.out.println("Enter days:");
		String day = a.nextLine();

		switch (year) {
		case "2023":
			switch (month) {
			case "jan":
				switch (day) {
				case "1":
				case "8":
				case "15":
				case "22":
				case "29":
					System.out.println("sunday");
					break;
				case "2":
				case "9":
				case "16":
				case "23":
				case "30":
					System.out.println("Monday");
					break;
				case "3":
				case "10":
				case "17":
				case "24":
				case "31":
					System.out.println("Tuesday");
					break;
				case "4":
				case "11":
				case "18":
				case "25":
					System.out.println("Wendesday");
					break;
				case "5":
				case "12":
				case "19":
				case "26":
					System.out.println("Thursday");
					break;
				case "6":
				case "13":
				case "20":
				case "27":
					System.out.println("Friday");
					break;
				case "7":
				case "14":
				case "21":
				case "28":
					System.out.println("satday");
					break;
				}
			case "feb":
				switch (day) {
				case "5":
				case "12":
				case "19":
				case "26":
					System.out.println("Sunday");
					break;
				case "6":
				case "13":
				case "20":
				case "27":
					System.out.println("Monday");
					break;
				case "7":
				case "14":
				case "21":
				case "28":
					System.out.println("Tuesday");
					break;
				case "1":
				case "8":
				case "15":
				case "22":
					System.out.println("Wendesday");
					break;
				case "2":
				case "9":
				case "16":
				case "23":
					System.out.println("Thursday");
					break;
				case "3":
				case "10":
				case "17":
				case "24":
					System.out.println("Friday");
					break;
				case "4":
				case "11":
				case "18":
				case "25":
					System.out.println("Saturday");
					break;
				}

			}

		}

	}

}