package myCalculator;


import static org.junit.Assert.*;

import myCalculator.MyCalculator;

import org.junit.Test;

public class MyCalculatorTest {

	@Test
	public void testAdd() {//UNIT TEST FOR THE ADDITION
			MyCalculator jk = new MyCalculator();
			float actual = jk.add(19,22);
			assertEquals("19+22=41",41,actual,0.0);//("MESSAGE",EXPECTED VALUE, ACTUAL VALUE[FROM THE CODE], 0.0)
	}
	@Test
	public void testSubtract() {
			MyCalculator jk = new MyCalculator();//UNIT TEST FOR SUBTRACTION
			float actual = jk.subtract(10,2);
			assertEquals("10-2=8",8,actual,0.0);//("MESSAGE",EXPECTED VALUE, ACTUAL VALUE[FROM THE CODE], 0.0)
	}

	@Test
	public void testMultiply() {
		MyCalculator jk = new MyCalculator();//UNIT TEST FOR MULTIPLICATION
		float actual = jk.multiply(19,2);
		assertEquals("19*2=38",38,actual,0.0);//("MESSAGE",EXPECTED VALUE, ACTUAL VALUE[FROM THE CODE], 0.0)
	}

	@Test
	public void testDivide() {
		MyCalculator jk = new MyCalculator();//UNIT TEST FOR DIVISION
		float actual = jk.multiply(19,2);
		assertEquals("19*2=38",38,actual,0.0);//("MESSAGE",EXPECTED VALUE, ACTUAL VALUE[FROM THE CODE], 0.0)
	}

	@Test
	public void testSquare() {
		MyCalculator jk = new MyCalculator();//UNIT TEST FOR SQUARE OF A NUMBER
		float actual = jk.square(2);
		assertEquals("2^2=4",4,actual,0.0);//("MESSAGE",EXPECTED VALUE, ACTUAL VALUE[FROM THE CODE], 0.0)
	}

	@Test
	public void testCube() {
		MyCalculator jk = new MyCalculator();//UNIT TEST FOR CUBE OF A NUMBER
		float actual = jk.cube(5);
		assertEquals("5^3=125",125,actual,0.0);//("MESSAGE",EXPECTED VALUE, ACTUAL VALUE[FROM THE CODE], 0.0)
	}

	//UNIT TEST FOR FACTORIAL
	//INPUT CASES BASED FROM WHAT I HAVE WRITTEN IN MY PAPER
	@Test
	public void test0factorial() {	//FOR O
		MyCalculator jk = new MyCalculator();
		float actual = jk.nfactorial(0);
		assertEquals("0!=1",1,actual,0.0);//("MESSAGE",EXPECTED VALUE[FROM WHAT I HAVE WRITTEN], ACTUAL VALUE[FROM THE CODE], 0.0)
	}
	
	@Test
	public void test1factorial() {	//FOR 1
		MyCalculator jk = new MyCalculator();
		float actual = jk.nfactorial(1);
		assertEquals("1!=1",1,actual,0.0);//("MESSAGE",EXPECTED VALUE[FROM WHAT I HAVE WRITTEN], ACTUAL VALUE[FROM THE CODE], 0.0)
	}
	
	@Test
	public void test3factorial() {	//FOR 3
		MyCalculator jk = new MyCalculator();
		float actual = jk.nfactorial(3);
		assertEquals("3!=6",6,actual,0.0);//("MESSAGE",EXPECTED VALUE[FROM WHAT I HAVE WRITTEN], ACTUAL VALUE[FROM THE CODE], 0.0)
	}

	@Test
	public void test6factorial() {	//FOR 6
		MyCalculator jk = new MyCalculator();
		float actual = jk.nfactorial(6);
		assertEquals("6!=720",720,actual,0.0);//("MESSAGE",EXPECTED VALUE[FROM WHAT I HAVE WRITTEN], ACTUAL VALUE[FROM THE CODE], 0.0)
	}
	
	@Test
	public void test9factorial() {	//FOR 9
		MyCalculator jk = new MyCalculator();
		float actual = jk.nfactorial(9);
		assertEquals("9!=362880",362880,actual,0.0);//("MESSAGE",EXPECTED VALUE[FROM WHAT I HAVE WRITTEN], ACTUAL VALUE[FROM THE CODE], 0.0)
	}

	//UNIT TEST FOR BINARY SEARCH
	@Test
	public void testBinarySearch5() {	//SEARCH 5 CASE WHEREIN NUM TO BE SEARCHED IS NOT FOUND
		MyCalculator jk = new MyCalculator();
		 int[] a = {1,2,3,4,6,7,8};	//ARRAY THAT I HAVE MADE
		float actual = jk.binarySearch(a,5);
		assertEquals("NO",-1,actual,0.0);		//("MESSAGE",EXPECTED VALUE[FROM WHAT I HAVE WRITTEN], ACTUAL VALUE[FROM THE CODE], 0.0)
	}
	
	@Test
	public void testBinarySearch1() {	//SEARCH 1 WHEREIN 1 IS THE FIRST ELEMENT AND IT IS FOUND IN THE ARRAY
		MyCalculator jk = new MyCalculator();
		 int[] a = {1,2,3,4,6,7,8};	//ARRAY THAT I HAVE MADE
		float actual = jk.binarySearch(a,1);
		assertEquals("YES",1,actual,0.0);	//("MESSAGE",EXPECTED VALUE[FROM WHAT I HAVE WRITTEN], ACTUAL VALUE[FROM THE CODE], 0.0)	
	}

	@Test
	public void testBinarySearch4() {	//SEARCH 4 WHEREIN 4 IS THE MIDDLE ELEMENT AND IT IS FOUND IN THE ARRAY 
		MyCalculator jk = new MyCalculator();
		 int[] a = {1,2,3,4,6,7,8};	//ARRAY THAT I HAVE MADE
		float actual = jk.binarySearch(a,4);
		assertEquals("YES",4,actual,0.0);		//("MESSAGE",EXPECTED VALUE[FROM WHAT I HAVE WRITTEN], ACTUAL VALUE[FROM THE CODE], 0.0)
	}
	
	@Test
	public void testBinarySearch8() {	//SEARCH 8 WHEREIN 8 IS THE LAST ELEMENT AND IT IS FOUND IN THE ARRAY
		MyCalculator jk = new MyCalculator();
		 int[] a = {1,2,3,4,6,7,8};	//ARRAY THAT I HAVE MADE
		float actual = jk.binarySearch(a,8);
		assertEquals("YES",8,actual,0.0);		//("MESSAGE",EXPECTED VALUE[FROM WHAT I HAVE WRITTEN], ACTUAL VALUE[FROM THE CODE], 0.0)
	}

	@Test
	public void testBinarySearch9() {	//SEARCH 9 WHEREIN NUM TO BE SEARCHED IS NOT FOUND
		MyCalculator jk = new MyCalculator();
		 int[] a = {1,2,3,4,6,7,8};	//ARRAY THAT I HAVE MADE
		float actual = jk.binarySearch(a,9);
		assertEquals("NO",-1,actual,0.0);		//("MESSAGE",EXPECTED VALUE[FROM WHAT I HAVE WRITTEN], ACTUAL VALUE[FROM THE CODE], 0.0)
	}

}
