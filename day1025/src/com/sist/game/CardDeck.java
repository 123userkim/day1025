package com.sist.game;

import java.util.ArrayList;
import java.util.Collections;

import javax.sound.midi.Soundbank;


//카드게임을 위한 52장의 카드를 쌓아두고 경기자가 카드를 하나씩 뽑을 수 있는 메소드를 갖는 클래스를 만들어요.
public class CardDeck {
	
	//Card를 담을 수있는 ArrayList를 만들어요.
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	//생성자에서
	//CardDeck의 맴버변수인 deck에 52장의 카드를 만들어 담도록 합니다.
	public CardDeck() {
		
		String []suit = {"Clubs", "Diamonds", "Hearts", "Spades"}; //카드모양 4가지를 배열에 담아요 
		
		//카드의 숫자 13가지를 배열에 담아요
		String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		//중첩반복문을 이용하여 52개의 카드를 생성하여 deck에 담아요
		for(int i=0; i<suit.length; i++) {  //카드모양만큼 반복문 돌아요
			for(int j=0; j<number.length; j++){// 카드숫자만큼 반복문 돌아요
				deck.add(new Card(suit[i],number[j]));
			}
		}
		
	}
	
	//52개의 카드가 순서대로 있어요!
	//게임을 위해서 카드를 무작위로 섞어주는 메소드를 만들어요
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	//52장의 카드가 있는 deck로부터 카드를 하나씩 뽑아오는 메소드를 만들어요
	//뽑아오고 deck에는 지워줘야 해요.
	//항상 deck 맨첫번째 요소를 뽑아오도록 해요. deck의 0번째 인덱스의 요소를 뽑아서 지우고 반환하도록 합니다.
	public Card deal() {
		return deck.remove(0);//			맨처음에 호출하면 52장의 카드중에 0번째를 반환,
							  //			두번째 호출하면 51장의 카드중에 0번째를 반환
		
		//ArrayList의 remove메소드는 
		//인덱스에 위치한 데이터를 제거하고 
		//제거한 데이터를 반환하는 메소드입니다.
	}
	
}
