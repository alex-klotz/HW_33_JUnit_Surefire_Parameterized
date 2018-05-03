package core;

import static org.junit.Assert.*;
import org.junit.*;

import core.Calculator;

public class CalculatorTestDefault {

	@Test(timeout=1000) // @Ignore //wait for 1 sec max(time is optional) if test runs can be less than <1 sec.
	public void test_01_Divide_2() {
		System.out.println("Test #01: Divide 2 params");
		assertEquals("Not correct", Calculator.divide(90.0, 30.0), 3.0, 0.09); // 0.09 it is precise, rounding
	}

	@Test(timeout=1000) // @Ignore
	public void test_02_Divide_3() {
		System.out.println("Test #02: Divide 3 params");
	    assertEquals("Not correct", Calculator.divide(200.0, 20.0, 2.0), 5.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_03_Divide_4() {
		System.out.println("Test #3: Divide 4 params");
		assertEquals("Not correct", Calculator.divide(400.0, 2.0, 2.0, 5.0), 20.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_04_Divide_5() {
		System.out.println("Test #4: Divide 5 params");
		assertEquals("Not correct", Calculator.divide(400.0, 2.0, 2.0, 5.0, 4.0), 5.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_05_Divide_6() {
		System.out.println("Test #5: Divide 6 params");
		assertEquals("Not correct", Calculator.divide(400.0, 2.0, 2.0, 5.0, 5.0, 2.0), 2.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_06_Add_2() {
		System.out.println("Test #6: Add 2 params");
		assertEquals("Not correct", Calculator.add(2.0, 2.0), 4.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_07_Add_3() {
		System.out.println("Test #7: Add 3 params");
		assertEquals("Not correct", Calculator.add(31.0, 22.0, 12.0), 65.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_08_Add_4() {
		System.out.println("Test #8: Add 4 params");
		assertEquals("Not correct", Calculator.add(8.0, 34.0, 5.0, 65.0), 112.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_09_Add_5() {  
		System.out.println("Test #09: Add 5 params");
		assertEquals("Not correct", Calculator.add(1.0, 1.0, 10.0, 11.0, 111.0), 134.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_10_Add_6() {
		System.out.println("Test #10: Add 6 params");
		assertEquals("Not correct", Calculator.add(2.0, 23.0, 54.0, 1.0, 66.0, 84.0), 230.0, 0.09);
		
	}

	@Test(timeout=1000) // @Ignore
	public void test_11_Subtract_2() {
		System.out.println("Test #11: Subtract 2 params");
		assertEquals("Subtractions is wrong", Calculator.subtract(6.0, 2.5), 3.5, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_12_Subtract_3() {
		System.out.println("Test #12: Subtract 3 params");
		assertEquals("Subtraction is wrong", Calculator.subtract(16.0, 4.0, 11.0, 0.0), 1.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_13_Subtract_4() {
		System.out.println("Test #13: Subtract 4 params");
		assertEquals("Subtraction is wrong", Calculator.subtract(44.0, 11.0, 3.0, 10.0), 20.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_14_Subtract_5() {
		System.out.println("Test #14: Subtract 5 params");
		assertEquals("Subtraction is wrong", Calculator.subtract(100.0, 50.0, 20.0, 10.0, 3.0), 17.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_15_Subtract_6() {
		System.out.println("Test #15: Subtract 6 params");
		assertEquals("Subtraction is wrong", Calculator.subtract(127.0, 17.0, 20.0, 15.0, 10.0, 52.0), 13.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_16_Multiply_2() {
		System.out.println("Test #16: Multiply 2 params");
		assertEquals("Multiply is incorrect", Calculator.multiply(2.0, 2.0), 4.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_17_Multiply_3() {
		System.out.println("Test #17: Multiply 3 params");
		assertEquals("Multiply is incorrect", Calculator.multiply(3.0, 3.0, 3.0), 27.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_18_Multiply_4() {
		System.out.println("Test #18: Multiply 4 params");
		assertEquals("Multiply is incorrect", Calculator.multiply(2.0, 3.0, 2.0, 4.0), 48.0, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_19_Multiply_5() {
		System.out.println("Test #19: Multiply 5 params");
		assertEquals("Multiply is incorrect", Calculator.miltiply(22.0, 3.0, 5.0, 2.0, 1.5), 990, 0.09);
	}

	@Test(timeout=1000) // @Ignore
	public void test_20_Multiply_6() {
		System.out.println("Test #20: Multiply 6 params");
		assertEquals("Multiply is incorrect", Calculator.multiply(22.0, 3.0, 5.0, 2.0, 1.5, 2.0), 1980.0, 0.09);
	}
	
	/* 
	@Test(timeout=1000) // @Ignore
	public void test_21_Multiply_6() {
		System.out.println("Test #20: Multiply 6 params");
		assertEquals("Multiply is incorrect", Calculator.multiply(22.0, 3.0, 5.0, 2.0, 2.0, 2.0), 1980.0, 0.09);
	} // Use this test method to see if it ruins the order(default order) of tests in the report
	*/

}
