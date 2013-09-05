package cse.maven.sample;

import cse.maven.sample.exception.InvalidBmiPropException;

// given height and weight, should calculate BMI in metrics
/*
 * Metric BMI Formula
BMI = ( Weight in Kilograms / ( Height in Meters x Height in Meters ) )
 */

public class BmiCalculator {

	
	public BmiProp createBmiProp(String height, String weight) throws InvalidBmiPropException {
		try {
			return new BmiProp(Float.valueOf(height), Float.valueOf(weight));
		} catch(Exception ex) {
			throw new InvalidBmiPropException();
		}
	}
	
	public float calculate(BmiProp prop) throws InvalidBmiPropException {
		
		if(!validate(prop)) {
			throw new InvalidBmiPropException();
		}
		
		return prop.getWeight()/(float)(Math.pow(prop.getHeight(), 2));
	}
	
	public boolean validate(BmiProp bmiProp) {
		 return bmiProp.getHeight() > 0 && bmiProp.getWeight() > 0 ? true : false;		
	}
	
	
}
