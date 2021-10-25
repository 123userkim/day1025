package com.sist.Lab02;

import java.util.Scanner;

import com.sist.exam03.DivTestException;
public class DivideByZeroTest {
		
	public static double quotient(int numerator, int denominator)throws DivideByZeroException {
		if(denominator ==0)
	    throw new DivideByZeroException();
		return numerator/denominator;
	}


	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
			int number1, number2, result;
			Scanner sc = new Scanner(System.in);
			System.out.println("첫 번째 정수 : ");
			number1 =sc.nextInt();
			System.out.println("두 번째 정수 : ");
			number2 =sc.nextInt();
			try {
			result = (int) quotient(number1, number2);
		}catch(DivideByZeroException e) {
			System.out.println("예외발생:"+e.toString());
		}
		
	}
	
	

}
