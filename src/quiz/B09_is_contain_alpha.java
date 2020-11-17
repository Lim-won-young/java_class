package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 > ");
		
		String user_text = sc.nextLine();
		int ut_len = user_text.length();
		
		boolean in_alpa = false;
		
		
		for (int i = 0; i <= ut_len-1; i++) {
			
			if (user_text.charAt(i) >= 'a' && user_text.charAt(i) <= 'z' ||
					user_text.charAt(i) >= 'A' && user_text.charAt(i) <= 'Z') {
				
				in_alpa = true;
				break;
			}
			
			
		}
		
		System.out.println(in_alpa);
		
		
	}

}
