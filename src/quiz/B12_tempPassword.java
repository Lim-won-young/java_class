package quiz;

import java.util.Random;

public class B12_tempPassword {
	
	public static void main(String[] args) {
		
		
		// ���� 4�ڸ��� �ӽ� ��й�ȣ ���ڿ��� �����ϴ� ���α׷��� �����ÿ�
		// (��й�ȣ�� �����ϴ� ���� - ���ĺ� �빮��, ����)
		
		Random ran = new Random();
		StringBuilder passWd = new StringBuilder("");
			
		for (int i = 0; i<4; i++) {
			int pass = ran.nextInt(36)+65;
			pass = pass >= 91 ? pass-43 : pass;
			passWd.append((char)pass);
		}
		String passWdS = passWd.toString();
		
		System.out.println(passWdS);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
