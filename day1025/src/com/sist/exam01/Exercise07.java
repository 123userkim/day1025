package com.sist.exam01;

import java.util.ArrayList;
import java.util.Iterator;


public class Exercise07 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(new Double(3.4));
		list.add(3.4);
		list.add(2.7); //auto Boxing= 자동으로 객체가 만들어짐
		list.add(5.5);
		
		
		Class.forName("InsertBoard").newInstance();
		
			
		
		//인덱스 변수를 사용하는 보통의 for 루프
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
		
		
		
		//Interator(반복자): 이 목록의 요소에 대한 반복자를 적절한 순서로 반환
		//데이터가 있는 만큼 반복 수행하기 위한 클래스
		
		 Iterator<Double> iter=list.iterator();
		 while(iter.hasNext()) {
			 double n = iter.next();
			 System.out.print(n);
		}

	}

}
