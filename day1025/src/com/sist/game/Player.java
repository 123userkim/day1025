package com.sist.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Player {
	//ī���� ���ڸ� map�� key�� �Ұſ���.
	String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
					
	//map�� �����
	HashMap<String, Integer> map= new HashMap<String, Integer>();
			
	
	//public ArrayList<Integer> pairList = new ArrayList<Integer>();
	public TreeSet<Integer> pairList = new TreeSet<Integer>();
	//���� �̷�� ī������ ��� ���� ���� ������ �����մϴ�.  //2
	
	
	//������ �ϴ� ����ڰ� CardDeck�� ���� ī�带 �ϳ��� �����ͼ� ���� ����Ʈ�� ������.
	private ArrayList<Card> list = new ArrayList<Card>();
	
	public Player() {
		//"2"�� ���� value�� ���� 2�� �Ұſ���. �׸��� 1�� �������Ѱ��ſ���.
		int value = 2;
						
		for(int i=0; i<number.length; i++) { //ī���� ���� �迭��ŭ �ݺ������ؿ�.
			map.put(number[i], value++); //map�� key�� ī���� ���ڷ� �ϰ� value�� 2���� 1�� ������ ������ �ؿ�.
		}
	}
	
	
	//ī�带 �Ű������� �޾Ƽ� ���� list�� ��ƿ�.
	public void getCard(Card card) {
		list.add(card);
	}
	
	public int pairProcess(String player) {
		int n  = 0;
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {				
				//i��° ī���� ���ڿ� j��° ī���� ���ڰ� �������� �Ǻ��մϴ�.
				if(list.get(i).getNumber().equals( list.get(j).getNumber() )) { 
					
					//������ ī���� ����(���ڿ��Դϴ�.)�� �ش��ϴ� ������ map���� ���� �̾ƿɴϴ�.
					n  = map.get(list.get(i).getNumber());
					
					//���� �̷�� ���ڸ� pairList�� ��ƿ�
					pairList.add(n);
				}
			}
		}
		
		Iterator<Integer> iter =  pairList.iterator();
		
		//pairList�� 3�� �϶�
		//ū�� �ΰ��� �̾ƿ����� �սô�.
		if(pairList.size() ==3) {    	//�����̷�� ī�尡 3���̸�
			System.out.println(player + "�� ������Դϴ�.");
			iter.next();				//���ڰ� �������� ī��� ������
			n = iter.next() + iter.next();  //������ �ΰ��� ���� �ΰ��� ���ϱ� �ؿ�.
		}else if(pairList.size()  == 2){    //�����̷�� ī�尡 2���̸�
			System.out.println(player + "�� ������Դϴ�.");
			n = iter.next() + iter.next();	//�ΰ��� ���߸� ���ϱ� �ؿ�.
		}else if(pairList.size() == 1) {	//���� �̷�� ī�尡 �Ѱ���
			System.out.println(player + "�� ������Դϴ�.");
			n = iter.next();                //�� ���ڸ� n�� ��ƿ�!
		}
		
		return n;
	}
	
	//����ī�带 ��� ����մϴ�.
	public void showCards() {
		System.out.println(list);
	}
}