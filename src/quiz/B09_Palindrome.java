package quiz;

import java.util.Scanner;

public class B09_Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܾ �Է��Ͻÿ� > ");
		
		String user_text = sc.next();
		int ut_len = user_text.length();
		String result = "PALINDROME";
		
		for (int i = 0; i < ut_len/2 ; i++) {
			
			char ch1 = user_text.charAt(i);
			char ch2 = user_text.charAt(ut_len-1-i);
			
			if (ch1 != ch2) 
				result = "NOT PALINDROME";
				break;
		}
	
		System.out.println(user_text);
		System.out.println(result);
		
		
		
		// # StringBuilder.reverse() : ���ڿ��� �Ųٷ� �����´�
		// 
	}
}