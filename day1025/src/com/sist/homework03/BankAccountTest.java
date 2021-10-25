package com.sist.homework03;

public class BankAccountTest extends BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount();
		account.deposit(100);
		try {
			account.withdraw(200);
		}catch(NegativeBalanceException e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		
		

	}

}
