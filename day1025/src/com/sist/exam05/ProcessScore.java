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
				throw new IllegalScore("������ �Ұ����մϴ�.");
				
			}
		}
		return avg;
			
		}
		
		

 
	public static void main(String[] args)  {
		try {
		int[]data= {90,80,70,60,50,40,30,-60};
		
		System.out.println("�������"+AvgCal(data));
		}catch(IllegalScore e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
		
		
	

}

