package com.sist.homework03;

import javax.swing.text.BadLocationException;

public class BankAccount {
	private static int balance=0;//�ܾ�
	
	public void deposit(int amount) { //�Ա�
		balance += amount;
		System.out.println(amount+"�Ա� �Ǿ����ϴ�.");	  
	}
	
	public static void withdraw(int amount) throws NegativeBalanceException { //���
	 
		if(balance < amount) {
			throw new NegativeBalanceException("�ܾ� �ʰ�");
		}else {
			System.out.println(amount+"���� ��ݵǾ����ϴ�.");
		}
	}
}
