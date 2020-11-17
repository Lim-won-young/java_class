package quiz;

import java.util.Random;

public class B12_tempPassword {
	
	public static void main(String[] args) {
		
		
		// 랜덤 4자리의 임시 비밀번호 문자열을 생성하는 프로그램을 만들어보시오
		// (비밀번호를 구성하는 문자 - 알파벳 대문자, 숫자)
		
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
