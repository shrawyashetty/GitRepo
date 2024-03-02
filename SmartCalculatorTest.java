package assignment;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SmartCalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{

		System.out.println("After Class");
	}

	@Test
	public void testSimpleInterest()
	{
		SmartCalculator sc = new SmartCalculator();
		sc.setP(500);
		sc.setT(5);
		sc.setR(3);
		System.out.println("Simple interest");
		double res = SmartCalculator.simpleInterest();
		assertEquals(75,res,0.001);

	}

	@Test
	public void testCompoundInterest() 
	{
		System.out.println("Compound interest");
		double res1=SmartCalculator.compoundInterest(10,4,2);
		assertEquals(10,res1,0.001);
	}

	@Test
	public void testMean() 
	{
		System.out.println("Mean of the given number ");
		int [] num={1,2,3,4,5};
		int res2=SmartCalculator.mean(num);
		assertEquals(3,res2);
	}

	@Test
	public void testFactorial() 
	{
		System.out.println("Factorial of a number");
		int res3=SmartCalculator.factorial(5);
		assertEquals(120,res3);
	}

	@Test
	public void testPercent() 
	{
		SmartCalculator sc = new SmartCalculator();
		System.out.println("Percentage");
		sc.setTotal(500);
		sc.setObtained(400);
		double res4=SmartCalculator.percent();
		assertEquals(80, res4,0.001);
		
		
	}

}
