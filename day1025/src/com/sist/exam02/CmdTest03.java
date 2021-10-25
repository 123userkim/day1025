package com.sist.exam02;
import java.util.HashMap;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;
import java.util.Iterator;

class CmdTest03 
{
	public static void main(String[] args) throws Exception
	{
		//����ڰ� ��û�ϴ� ���񽺸��� key���ϰ�  ��ó����� ��ü�� value�� ��� ���� map�� ����
		HashMap<String,SistAction > map = new HashMap<String, SistAction>();
		
		//���񽺸�� ��ó�����Ŭ�������� �ִ� ���ϰ�ü�� ������.
		FileReader fr = new FileReader("sist.properties");

		//������ ������ key�� value�� �����ϱ� ���� ��ü�� ������.
		Properties prop = new Properties();

		
		
		//������ ������ �о� ����.
		prop.load(fr);

		//������Ƽ ���Ϸ� ���� key���(���񽺸�)�� �ݺ��� ��ü�� ������.
		Iterator iter = prop.keySet().iterator();

		//key�� �ִ� ��ŭ �ݺ� ������.
		while(iter.hasNext()){
			
			//key�� �ϳ��� ������ �����.(���񽺸�)			
			String cmd =(String) iter.next();

			//key�� �ش��ϴ� value�� ������ ���� ��(��ó�� ����ϴ� Ŭ�����̸�)
			String clsName =(String) prop.get(cmd);

			//���ڿ��� �Ǿ� �ִ� Ŭ�����̸��� �ش��ϴ� ��ü�� ������.
			SistAction obj = (SistAction) Class.forName(clsName).newInstance();

			//����ڰ� ��û�� ���񽺸�� ��ó�� ����� �ϴ� ��ü�� key�� value�� �Ͽ� 
			//map�� �����.
			map.put(cmd,obj);
		}

	
		//���α׷� ����ÿ� ���޵Ǵ� �Ű������� url������ ������.
		String url = args[0] ;

		//url�� ���� ���񽺸��� �߶� ������ ������.
		String cmd = url.substring(  url.lastIndexOf("/") +1  );
		// java CmdTest http://www.sist.co.kr/udate.do
		// update.do
		
		//map���� ���� ���񽺸� �ش��ϴ� ��ó�� ��簴ü�� �̾ƿ�.
		SistAction action  = map.get(cmd);

		//��ó���� ���� �޼ҵ带 ȣ����.
		action.pro();
	}
}