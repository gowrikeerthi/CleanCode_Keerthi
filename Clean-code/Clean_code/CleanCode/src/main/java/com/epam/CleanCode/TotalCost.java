package com.epam.CleanCode;

public class TotalCost {
	float costPerSquareFeet, area;
	public TotalCost(float costPerSquareFeet, float area) {
		super();
		this.costPerSquareFeet = costPerSquareFeet;
		this.area = area;
	}
	float costCalculation() {
		return costPerSquareFeet * area;
	}
}
