package com.sist.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class CardGame02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// CardDeck 객체를 생성합니다.
		// 생성자에 의해서 52개의 카드가 생성됩니다.
		CardDeck deck = new CardDeck();
		
		//카드를 골고루 섞어줍니다.
		deck.shuffle();
	
		//카드게임을 할 경기자를 두명 생성한다.
		Player p1 = new Player();
		Player p2 = new Player();
		
		//원페어인지 판별하기 위한 메소드는 어느 클래스에 만들어야 할까요?
		//isOnepair();
		
		for(int i=1; i<=7; i++) {
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}
		
		//첫번째 사람이 자신의 모든 카드를 출력합니다.
		p1.showCards();
		
		//두번째 사람도 자신의 모든카드를 출력합니다.
		p2.showCards();
		
		int n1 = p1.pairProcess("플레이어1");
		int n2 = p2.pairProcess("플레이어2");
		
		if(n1 == n2) {
			System.out.println("비겼습니다.");
		}else if(n1 > n2) {
			System.out.println("플레이어1이 이겼습니다.");
		}else {
			System.out.println("플레이어2가 이겼습니다.");
		}
		
	}

}