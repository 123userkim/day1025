package com.sist.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class CardGame02 {

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
		
		//��������� �Ǻ��ϱ� ���� �޼ҵ�� ��� Ŭ������ ������ �ұ��?
		//isOnepair();
		
		for(int i=1; i<=7; i++) {
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}
		
		//ù��° ����� �ڽ��� ��� ī�带 ����մϴ�.
		p1.showCards();
		
		//�ι�° ����� �ڽ��� ���ī�带 ����մϴ�.
		p2.showCards();
		
		int n1 = p1.pairProcess("�÷��̾�1");
		int n2 = p2.pairProcess("�÷��̾�2");
		
		if(n1 == n2) {
			System.out.println("�����ϴ�.");
		}else if(n1 > n2) {
			System.out.println("�÷��̾�1�� �̰���ϴ�.");
		}else {
			System.out.println("�÷��̾�2�� �̰���ϴ�.");
		}
		
	}

}