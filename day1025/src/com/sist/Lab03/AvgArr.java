package com.sist.Lab03;
import java.util.Scanner;
import com.sist.exam05.IllegalScore;
import com.sist.homework03.NegativeBalanceException;

public class AvgArr{
	public static void main(String[] args) {
		int []list;
		int sum = 0 ,cnt;
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수의 개수 : ");
			cnt =sc.nextInt();
			list = new int[cnt];
			
			for(int i=0; i<cnt;i++) {
				System.out.println("정수를 입력하시오");
				list[i]=sc.nextInt();
			}
			for(int i=0;i<cnt;i++) {
				sum += list[i];
				
			}
			System.out.println("평균은 " +sum/cnt);
		}catch(ArithmeticException e) {
			System.out.println("예외발생:"+e.getMessage());
		}catch(NegativeArraySizeException e) {
			System.out.println("예외발생:"+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생:"+e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
