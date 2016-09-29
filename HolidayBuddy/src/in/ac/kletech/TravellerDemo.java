package in.ac.kletech;

import java.util.Scanner;
public class TravellerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the package type   1.TravelOnly 2.HolidayPackage 3.Bed&Breakfast");
		int choice = sc.nextInt();
		String name;int id;
		double bill;
		int gender;
		String date;
		int destination;
		double final_bill,total_bill;
		switch (choice){
		case 1 :TravelOnly travel_type_1 = new TravelOnly();

		System.out.println("Enter the travel date (dd/mm/yy)");
		date = sc.next();
		System.out.println("Enter the destination 1 : hubli <-> banglore, hubli <-> chennai. 2 : hubli <-> mumbai, hubli<-> gujrat 3: hubli <-> delhi, hubli <-> Srinagar");
		destination = sc.nextInt();
		bill = travel_type_1.calc_bill(destination);
		System.out.println("plz enter your good name");
		name  = sc.next();
		System.out.println("enter the id proof number");
		id = sc.nextInt();
		System.out.println("if your gender is female enter 1");
		gender = sc.nextInt();
		final_bill = travel_type_1.discount(2,bill);
		System.out.println("wait while we check ua details for further discount");
		total_bill = travel_type_1.isFemale(gender, final_bill);
		System.out.println("total package amount is :"+total_bill);
		System.out.println("status");
		
		travel_type_1.status(name, id, gender, total_bill,date);
		
		
		break;

		case 2 : HolidayPackage travel_type_2 = new HolidayPackage();
		System.out.println("Enter the travel date (dd/mm/yy)");
		date = sc.next();
		System.out.println("Enter the destination 1 : east india holiday package 2 : west india holiday package 3: north india holiday package");
		destination = sc.nextInt();
		bill = travel_type_2.calc_bill(destination);
		System.out.println("plz enter your good name");
		name  = sc.next();
		System.out.println("enter the id proof number");
		id = sc.nextInt();
		System.out.println("if your gender is female enter 1");
		gender = sc.nextInt();
		final_bill = travel_type_2.discount(2,bill);
		System.out.println("wait while we check ua details for further discount");
		total_bill = travel_type_2.isFemale(gender, final_bill);
		System.out.println("total package amount is :"+total_bill);
		System.out.println("status");
		travel_type_2.status(name, id, gender, total_bill,date);
		break;
		
		
		
		
		case 3 : BedBreakfast travel_type_3 = new  BedBreakfast();
		System.out.println("enter check-in date");
		date = sc.next();
		System.out.println("enter the number of days 1,2 or 3");
		destination = sc.nextInt();
		bill = travel_type_3.calc_bill(destination);
		System.out.println("plz enter your good name");
		name  = sc.next();
		System.out.println("enter the id proof number");
		id = sc.nextInt();
		System.out.println("if your gender is female enter 1 ");
		gender = sc.nextInt();
		final_bill = travel_type_3.discount(2,bill);
		System.out.println("wait while we check ua details for further discount");
		total_bill = travel_type_3.isFemale(gender, final_bill);
		System.out.println("total package amount is :"+total_bill);
		
		System.out.println("status");
		travel_type_3.status(name, id, gender, total_bill,date);
		break;

		default : System.out.println("thank you");
		break;










		}
	}

}