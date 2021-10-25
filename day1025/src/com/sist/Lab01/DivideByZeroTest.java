package com.sist.Lab01;
import java.util.Scanner;
public class DivideByZeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2, result;
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수 : ");
		number1 =sc.nextInt();
		System.out.println("두 번째 정수 : ");
		number2 =sc.nextInt();
		result = number1/number2;
		System.out.println(result);
		}catch (Exception e) {
			 System.out.println(e.getMessage());
			 e.printStackTrace(); //코드를 보여주기
			 
		}finally {
			System.out.println("완료되었습니다.");
		}
		
		//20 abc => java.util.InputMismatchException
		//20과 0=> java.lang.ArithmeticException: / by zero
	}

}
