package com.sist.exam01;

import java.util.ArrayList;
import java.util.Iterator;


public class Exercise07 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(new Double(3.4));
		list.add(3.4);
		list.add(2.7); //auto Boxing= �ڵ����� ��ü�� �������
		list.add(5.5);
		
		
		Class.forName("InsertBoard").newInstance();
		
			
		
		//�ε��� ������ ����ϴ� ������ for ����
		for(int i = 0 ;i<list.size();i++) {
			double n = list.get(i); //auto UnBoxing
			//Double data = list.get(i);
			System.out.print(n+"\t");
		}
		System.out.println();
	
		//for - each
		for(double n :  list) {
			System.out.print(n+"\t");
		}
		
		
		
		//Interator(�ݺ���): �� ����� ��ҿ� ���� �ݺ��ڸ� ������ ������ ��ȯ
		//�����Ͱ� �ִ� ��ŭ �ݺ� �����ϱ� ���� Ŭ����
		
		 Iterator<Double> iter=list.iterator();
		 while(iter.hasNext()) {
			 double n = iter.next();
			 System.out.print(n);
		}

	}

}
