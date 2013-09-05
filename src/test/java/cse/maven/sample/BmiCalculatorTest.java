package cse.maven.sample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import cse.maven.sample.exception.InvalidBmiPropException;
import static org.testng.Assert.assertEquals;

@Test
public class BmiCalculatorTest {

	BmiCalculator bmiCalculator;
		
	@BeforeClass
	public void setUp() {
		bmiCalculator = new BmiCalculator();
	}
	
	@Test
	public void createBmiTest1() throws InvalidBmiPropException {
		BmiProp bmiProp = bmiCalculator.createBmiProp("1.7", "64");
	    assertEquals(bmiProp.getHeight(), 1.7f);
	}
	
	@Test(expectedExceptions = InvalidBmiPropException.class)
	public void createBmiTest2() throws InvalidBmiPropException {
		BmiProp bmiProp = bmiCalculator.createBmiProp("isuru", "64");	 
	}
	
	@Test
	public void testCalculate1() throws InvalidBmiPropException {
		BmiProp bmiProp = new BmiProp(1.7f, 64f);
		float bmi = bmiCalculator.calculate(bmiProp);
		assertEquals(bmi, 22.145329f);		
	}
	
	@Test(expectedExceptions = InvalidBmiPropException.class)
	public void testCalculate2() throws InvalidBmiPropException {
		BmiProp bmiProp = new BmiProp(0.0f, 64f);
		bmiCalculator.calculate(bmiProp);		
	}
	
}
