package com.epam.CleanCode;

public class SimpleAndCompoundInterest {
	float principleAmount, rateOfInterest;
	int time;
	public SimpleAndCompoundInterest(float principleAmount, float rateOfInterest, int time) {
		super();
		this.principleAmount = principleAmount;
		this.rateOfInterest = rateOfInterest;
		this.time = time;
	}
	float simpleInterest() {
		return ((principleAmount * rateOfInterest * time) / 100);
	}
	float compoundInterest() {
		float q = 1 + (rateOfInterest / 100);
		return principleAmount * (float)Math.pow(q, time);
	}
}
