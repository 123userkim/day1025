package com.sist.homework03;

import javax.swing.text.BadLocationException;

public class BankAccount {
	private static int balance=0;//잔액
	
	public void deposit(int amount) { //입금
		balance += amount;
		System.out.println(amount+"입금 되었습니다.");	  
	}
	
	public static void withdraw(int amount) throws NegativeBalanceException { //출금
	 
		if(balance < amount) {
			throw new NegativeBalanceException("잔액 초과");
		}else {
			System.out.println(amount+"원이 출금되었습니다.");
		}
	}
}
