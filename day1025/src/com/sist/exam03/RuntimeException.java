package com.sist.exam03;

public class RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {10,20,30};
		System.out.println(a[3]);
		//배열의 인덱스 범위를 넘는 예외가 발생
		//이 예외는 runTime의 후손이라서 -> 사용자의 예외처리가 없어도됨 or 해도됨

}
}
