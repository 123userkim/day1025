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
			System.out.println("������ ���� : ");
			cnt =sc.nextInt();
			list = new int[cnt];
			
			for(int i=0; i<cnt;i++) {
				System.out.println("������ �Է��Ͻÿ�");
				list[i]=sc.nextInt();
			}
			for(int i=0;i<cnt;i++) {
				sum += list[i];
				
			}
			System.out.println("����� " +sum/cnt);
		}catch(ArithmeticException e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}catch(NegativeArraySizeException e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
