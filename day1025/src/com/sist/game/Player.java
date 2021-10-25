package com.sist.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Player {
	//카드의 숫자를 map로 key로 할거에요.
	String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
					
	//map을 만들고
	HashMap<String, Integer> map= new HashMap<String, Integer>();
			
	
	//public ArrayList<Integer> pairList = new ArrayList<Integer>();
	public TreeSet<Integer> pairList = new TreeSet<Integer>();
	//쌍을 이루는 카드목록을 담아 놓기 위한 리스를 생성합니다.  //2
	
	
	//게임을 하는 경기자가 CardDeck로 부터 카드를 하나씩 가져와서 담을 리스트를 만들어요.
	private ArrayList<Card> list = new ArrayList<Card>();
	
	public Player() {
		//"2"에 대한 value를 숫자 2로 할거에요. 그리고 1씩 증가시켜갈거에요.
		int value = 2;
						
		for(int i=0; i<number.length; i++) { //카드의 숫자 배열만큼 반복실행해요.
			map.put(number[i], value++); //map에 key는 카드의 숫자로 하고 value는 2부터 1씩 증가한 값으로 해요.
		}
	}
	
	
	//카드를 매개변수로 받아서 나의 list에 담아요.
	public void getCard(Card card) {
		list.add(card);
	}
	
	public int pairProcess(String player) {
		int n  = 0;
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {				
				//i번째 카드의 숫자와 j번째 카드의 숫자가 동일한지 판별합니다.
				if(list.get(i).getNumber().equals( list.get(j).getNumber() )) { 
					
					//동일한 카드의 숫자(문자열입니다.)에 해당하는 정수를 map으로 부터 뽑아옵니다.
					n  = map.get(list.get(i).getNumber());
					
					//쌍을 이루는 숫자를 pairList에 담아요
					pairList.add(n);
				}
			}
		}
		
		Iterator<Integer> iter =  pairList.iterator();
		
		//pairList가 3개 일때
		//큰값 두개만 뽑아오도록 합시다.
		if(pairList.size() ==3) {    	//쌍을이루는 카드가 3장이면
			System.out.println(player + "는 투페어입니다.");
			iter.next();				//숫자가 가장작은 카드는 버려요
			n = iter.next() + iter.next();  //나머지 두개의 숫자 두개를 더하기 해요.
		}else if(pairList.size()  == 2){    //쌍을이루는 카드가 2장이면
			System.out.println(player + "는 투페어입니다.");
			n = iter.next() + iter.next();	//두개의 숫잘르 더하기 해요.
		}else if(pairList.size() == 1) {	//쌍을 이루는 카드가 한개면
			System.out.println(player + "는 원페어입니다.");
			n = iter.next();                //그 숫자를 n에 담아요!
		}
		
		return n;
	}
	
	//나의카드를 모두 출력합니다.
	public void showCards() {
		System.out.println(list);
	}
}