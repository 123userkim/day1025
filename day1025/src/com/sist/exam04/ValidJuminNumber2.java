package com.sist.exam04;
import java.util.Scanner;

public class ValidJuminNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��Ͻÿ�");
		jumin = sc.next();
		
		int []n = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//990120-2001910 ; �ε����� 6��°�� ��꿡 ��������
		//���ڿ��� ���̴� 14��
		//�ݺ������ؾ��ϴ� �ε����� 12��°  == i<jumin.length()-1
		
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
		//charAt()�� ����� char
		//char�� ���ڿ� String���� ����� ���Ͽ� ���� ""���� ������
		
		if(sum==check) {
			System.out.println("�ùٸ� �ֹι�ȣ�Դϴ�.");
		}else {
			try {
			throw new InValidJuminNumberException("�ùٸ� �ֹι�ȣ ������ �ƴմϴ�");
			//InVal�� Run�� �ļ��� �ƴϱ� ������ ����ó���� �ؾ���
			}catch(InValidJuminNumberException e) {
				System.out.println("���ܹ߻�:"+e.getMessage());
				
			}
		}

}
}
