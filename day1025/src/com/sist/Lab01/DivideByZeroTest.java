package com.sist.Lab01;
import java.util.Scanner;
public class DivideByZeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2, result;
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� : ");
		number1 =sc.nextInt();
		System.out.println("�� ��° ���� : ");
		number2 =sc.nextInt();
		result = number1/number2;
		System.out.println(result);
		}catch (Exception e) {
			 System.out.println(e.getMessage());
			 e.printStackTrace(); //�ڵ带 �����ֱ�
			 
		}finally {
			System.out.println("�Ϸ�Ǿ����ϴ�.");
		}
		
		//20 abc => java.util.InputMismatchException
		//20�� 0=> java.lang.ArithmeticException: / by zero
	}

}
