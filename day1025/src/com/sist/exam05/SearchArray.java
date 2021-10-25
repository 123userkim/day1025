package com.sist.exam05;

public class SearchArray {
	//search메소드 body안에 예외객체가 생성될 수 있음
	//이와 같이 메소드안에서 예외가 발생할 때,
	//메소드안에서 직접 try~catch로 예외처리할 수가 있고
	//메소드 호출하는 쪽에서 예외처리를 해야함
	public static int search( int []arr, int value) throws NotFoundException {
		int index = -1;  
		//왜 -1이라고 설정? : index가 아닌 값을 -1로 설정
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==value) {
				index =i;
			}
		}
		//value를 배열에서 찾았는지 못찾았는지 어캐 알 수 있나?
			
		if(index == -1) {
				throw new NotFoundException("배열에 찾는 값"+value+"(이)가 없습니다~");	
			}
			return index;
		}
		
	public static void main(String[] args) {
		try {
		int []data = {2,4,10,9,6};
		int n = search(data, 9);
		System.out.println(n);
		}catch(NotFoundException e) {
			System.out.println("예외발생:"+e.getMessage());			
	    }
	}
}
