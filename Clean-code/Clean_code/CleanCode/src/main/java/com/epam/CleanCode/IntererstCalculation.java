package com.epam.CleanCode;
import java.util.*;
public class IntererstCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<---------SIMPLE AND COMPOUND INTEREST CALCULATION----------->");
		System.out.print("Enter principle amount : ");
		float principleAmount = sc.nextFloat();
		System.out.print("Enter rate of interest : ");
		float rateOfInterest = sc.nextFloat();
		System.out.print("Enter period of time : ");
		int time = sc.nextInt();
		SimpleAndCompoundInterest sac = new SimpleAndCompoundInterest(principleAmount, rateOfInterest, time);
		float simpleInterest = sac.simpleInterest();
		float compoundInterest = sac.compoundInterest();
		System.out.println("Simple interest : " + simpleInterest);
		System.out.println("Compound interest : " + compoundInterest);
		sc.close();
	}

}
