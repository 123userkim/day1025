package com.sist.homework04;

import com.sist.homework03.BankAccount;
import com.sist.homework03.NegativeBalanceException;

public class MyDateTest extends MyDate{

	public static void main(String[] args) {
		MyDate date= new MyDate();
		try{
		String str ="2021/10/25";
		date.ToString(str); 	
		}catch(IllegalArgumentException e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
	}
}
