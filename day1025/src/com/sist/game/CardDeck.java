package com.sist.game;

import java.util.ArrayList;
import java.util.Collections;

import javax.sound.midi.Soundbank;


//ī������� ���� 52���� ī�带 �׾Ƶΰ� ����ڰ� ī�带 �ϳ��� ���� �� �ִ� �޼ҵ带 ���� Ŭ������ ������.
public class CardDeck {
	
	//Card�� ���� ���ִ� ArrayList�� ������.
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	//�����ڿ���
	//CardDeck�� �ɹ������� deck�� 52���� ī�带 ����� �㵵�� �մϴ�.
	public CardDeck() {
		
		String []suit = {"Clubs", "Diamonds", "Hearts", "Spades"}; //ī���� 4������ �迭�� ��ƿ� 
		
		//ī���� ���� 13������ �迭�� ��ƿ�
		String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		//��ø�ݺ����� �̿��Ͽ� 52���� ī�带 �����Ͽ� deck�� ��ƿ�
		for(int i=0; i<suit.length; i++) {  //ī���縸ŭ �ݺ��� ���ƿ�
			for(int j=0; j<number.length; j++){// ī����ڸ�ŭ �ݺ��� ���ƿ�
				deck.add(new Card(suit[i],number[j]));
			}
		}
		
	}
	
	//52���� ī�尡 ������� �־��!
	//������ ���ؼ� ī�带 �������� �����ִ� �޼ҵ带 ������
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	//52���� ī�尡 �ִ� deck�κ��� ī�带 �ϳ��� �̾ƿ��� �޼ҵ带 ������
	//�̾ƿ��� deck���� ������� �ؿ�.
	//�׻� deck ��ù��° ��Ҹ� �̾ƿ����� �ؿ�. deck�� 0��° �ε����� ��Ҹ� �̾Ƽ� ����� ��ȯ�ϵ��� �մϴ�.
	public Card deal() {
		return deck.remove(0);//			��ó���� ȣ���ϸ� 52���� ī���߿� 0��°�� ��ȯ,
							  //			�ι�° ȣ���ϸ� 51���� ī���߿� 0��°�� ��ȯ
		
		//ArrayList�� remove�޼ҵ�� 
		//�ε����� ��ġ�� �����͸� �����ϰ� 
		//������ �����͸� ��ȯ�ϴ� �޼ҵ��Դϴ�.
	}
	
}
