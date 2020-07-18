package com.epam.CleanCode;
import java.util.*;

public class MaterialSelection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose material standard to build your house");
		System.out.println("1. Standard materials(Cost 1200 INR per square feet)");
		System.out.println("2. Above standard materials(Cost 1500 INR per square feet)");
		System.out.println("3. High Standard material(Cost 1800 INR per square feet)");
		System.out.print("Enter your choice in integer: ");
		int choice = sc.nextInt();
		float costPerSquareFeet = 0;
		if(choice >= 1 && choice <= 3) {
			if(choice == 1) 
				costPerSquareFeet = 1200;
			else if(choice == 2)
				costPerSquareFeet = 1500;
			else if(choice == 3) {
				System.out.println("Do you need fully automated house(Cost 2500 INR per square feet");
				System.out.println("Enter true or false : ");
				boolean automatedHouse = sc.nextBoolean();
				if(automatedHouse)
					costPerSquareFeet = 2500;
				else
					costPerSquareFeet = 1800;
			}
			System.out.println("Enter area of house in square feet : ");
			float area = sc.nextFloat();
			TotalCost tc = new TotalCost(costPerSquareFeet, area);
			System.out.println("Total cost is : " + tc.costCalculation());
		}
		else {
			System.out.println("Your choice is invalid!!!");
		}
		sc.close();
	}

}
