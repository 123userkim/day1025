package com.sist.exam04;
import java.util.Scanner;

public class ValidJuminNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin;
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하시오");
		jumin = sc.next();
		
		int []n = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//990120-2001910 ; 인덱스가 6번째는 계산에 참여안함
		//문자열의 길이는 14자
		//반복실행해야하는 인덱스는 12번째  == i<jumin.length()-1
		
		int sum=0;
		
		for(int i=0; i<jumin.length()-1 ; i++) {
			if(i!=6) {
			sum=sum+Integer.parseInt(jumin.charAt(i)+"") * n[i];
			}
		}
		sum = sum%11;
		sum = 11-sum;
		
		if(sum==10) {
			sum=0;
		}if(sum==11) {
			sum=1;			
		}
		
		int check =Integer.parseInt(jumin.charAt(13)+"");
		//charAt()의 결과는 char
		//char를 문자열 String으로 만들기 위하여 빈문자 ""으로 더해줌
		
		if(sum==check) {
			System.out.println("올바른 주민번호입니다.");
		}else {
			try {
			throw new InValidJuminNumberException("올바른 주민번호 형식이 아닙니다");
			//InVal는 Run의 후손이 아니기 때문에 예외처리를 해야함
			}catch(InValidJuminNumberException e) {
				System.out.println("예외발생:"+e.getMessage());
				
			}
		}

}
}
