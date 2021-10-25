package com.sist.exam05;

public class SearchArray {
	//search�޼ҵ� body�ȿ� ���ܰ�ü�� ������ �� ����
	//�̿� ���� �޼ҵ�ȿ��� ���ܰ� �߻��� ��,
	//�޼ҵ�ȿ��� ���� try~catch�� ����ó���� ���� �ְ�
	//�޼ҵ� ȣ���ϴ� �ʿ��� ����ó���� �ؾ���
	public static int search( int []arr, int value) throws NotFoundException {
		int index = -1;  
		//�� -1�̶�� ����? : index�� �ƴ� ���� -1�� ����
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==value) {
				index =i;
			}
		}
		//value�� �迭���� ã�Ҵ��� ��ã�Ҵ��� ��ĳ �� �� �ֳ�?
			
		if(index == -1) {
				throw new NotFoundException("�迭�� ã�� ��"+value+"(��)�� �����ϴ�~");	
			}
			return index;
		}
		
	public static void main(String[] args) {
		try {
		int []data = {2,4,10,9,6};
		int n = search(data, 9);
		System.out.println(n);
		}catch(NotFoundException e) {
			System.out.println("���ܹ߻�:"+e.getMessage());			
	    }
	}
}
