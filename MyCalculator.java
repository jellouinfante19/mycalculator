package myCalculator;
/**
 * Author: Kristine Elaine P. Bautista
 * Program Description: Calculator of Simple Mathematical Functions
**/
/**
 *Modified by: Jellou Mae S. Infante
 *2012-12757
 */

public class MyCalculator {
	// add two numbers
	public float add(float a,float b){
		return a+b;
	}
	
	// subtract two numbers
	public float subtract(float a,float b){
		return a-b;
	}
	
	// multiply two numbers
	public float multiply(float a,float b){
		return a*b;
	}
	
	// divide two numbers
	public float divide(float a,float b){
		return a/b;
	}
	
	// x^2 of two numbers
	public float square(int x){
		return x*x;
	}
	
	// x^3 of three numbers
	public float cube(int x){
		return x*x*x;
	}
	
	// n! of an integer
	public int nfactorial(int n){
		int factorial = 1;
		
		for(int i=1;i<=n;++i)//MAKE IT <=n, AND ++i ADD 1 TO i, RETURNS THE NEW VALUE.
			factorial *= i;
		
		return factorial;
	}
	
	// binary search in an array
	public int binarySearch(int[] a,int x){
		int n = a.length; // get number of elements in the array
		int lower, upper, middle; // variables for positions in the array
		lower = 0; upper = n-1; // initialize values of lower and upper points
		
		while(lower<=upper){
			middle = (lower+upper)/2;
			if(x>a[middle]){	//ADDED {} AND PROPER INDENTATION
				lower = middle + 1;
			}
			else if(x<a[middle]){
				upper = middle - 1;
			}
			else{
				return a[middle];	//MADE IT A[MIDDLE] SO THAT IT WILL RETURN THE MIDDLE ELEMENT IF THE FIRST TWO CONDITION FAILS
			}
		}
		
		return -1;	//IF NOT FOUND, -1 TO SIGNIFY ERROR BECAUSE RETURN 0 IS THE NO ERROR
	}
	
}