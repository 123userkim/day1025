package com.sist.exam03;

public class DivTestException {
	//run ->run con~ -> main class �̸� �ٲٰ�->args 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a  = Integer.parseInt(args[0]);
			int b  = Integer.parseInt(args[1]);
			int div =a/b;
			System.out.println("��� : "+div);
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����!");		 			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �� ���� ���� �����ϼ���!");	
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �����ؾ��մϴ�!");
			
		}
		
		
		
		
		

	}

	

}
