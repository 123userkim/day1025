package com.sist.homework04;

import java.util.StringTokenizer;

public class MyDate {
	public static void StringTo(String str) {
		StringTokenizer st = new StringTokenizer(str,"/"); 
		String year = st.nextToken();
		String month = st.nextToken();
		String date = st.nextToken();	
		System.out.println(year+month+date);
	}
	 
	
	
	public static void ToString(String str)throws IllegalArgumentException {
	if(str==null){
		throw new IllegalArgumentException(null);
	}else {
		System.out.println(str);
	}
}
}

