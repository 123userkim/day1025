package com.sist.game;


//ī������� ���Ͽ� "ī��"�� ǥ���ϱ� ���� Ŭ������ ������!
public class Card {
	private String suit;	//ī������ ���� �ɹ������Դϴ�.
	private String number;	//ī����ڸ� ���� �ɹ������Դϴ�.
	
	public Card(String suit, String number) {  //�����ÿ� ī����� ī����ڸ� �Ű������� �޾� �ʱ�ȭ �մϴ�.
		super();
		this.suit = suit;
		this.number = number;
	}
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {						//ī���� ���� ���ڸ� ���ڿ��� ��ȯ�մϴ�.
		return "[" + suit + "," + number + "]";
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}