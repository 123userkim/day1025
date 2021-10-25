package com.sist.exam03;

public class DivTestException02 {
	//run ->run con~ -> main class 이름 바꾸고->args 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a  = Integer.parseInt(args[0]);
			int b  = Integer.parseInt(args[1]);
			int div =a/b;
			System.out.println("결과 : "+div);
		}catch(ArithmeticException e) {
			System.out.println("분모가 0이 될 수 없어요!");		 			
		} 
		catch(Exception e) {
			System.out.println("나누기할 정수 두 개를 전달해야 합니다!");		 			
		}finally {
			System.out.println("작업완료");
		}
		
		
		
		

	}

}
