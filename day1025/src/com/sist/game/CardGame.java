package com.sist.game;
public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CardDeck ��ü�� �����մϴ�.
		// �����ڿ� ���ؼ� 52���� ī�尡 �����˴ϴ�.
		CardDeck deck = new CardDeck();
		
		//ī�带 ���� �����ݴϴ�.
		deck.shuffle();
	
		//ī������� �� ����ڸ� �θ� �����Ѵ�.
		Player p1 = new Player();
		Player p2 = new Player();
		
		//ù��° ����� ī�带 �ϳ� �̾ƿɴϴ�.
		p1.getCard(deck.deal());
		
		//�ι�° ����� ī�带 �ϳ� �̾ƿɴϴ�.
		p2.getCard(deck.deal());
		
		//ù��° ����� �ڽ��� ��� ī�带 ����մϴ�.
		p1.showCards();
		
		//�ι�° ����� �ڽ��� ���ī�带 ����մϴ�.
		p2.showCards();
	}

}
