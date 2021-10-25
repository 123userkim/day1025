package com.sist.exam05;


public class ProcessScore{ 
	
	public static double AvgCal(int[] arr) throws IllegalScore {
		int avg =0;
		int sum=0;
		
		for(int i:arr) {
			sum += i;
		}avg = sum/arr.length;
		
		for(int i = 0 ;i<arr.length;i++) {
			if(arr[i]<0) {
				throw new IllegalScore("음수는 불가능합니다.");
				
			}
		}
		return avg;
			
		}
		
		

 
	public static void main(String[] args)  {
		try {
		int[]data= {90,80,70,60,50,40,30,-60};
		
		System.out.println("평균점수"+AvgCal(data));
		}catch(IllegalScore e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
		
		
	

}

