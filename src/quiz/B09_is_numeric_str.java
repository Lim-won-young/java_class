package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {

	
	public static void main(String[] args) {
		
		// 입력받은 문자열에 숫자만 포함되어 있으면 결과에 1을 저장
		// 다른 문자가 포함되어 있다면 0을 저장하여 출력
		
		int result = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 > ");	
		String user_text = sc.nextLine();
		int ut_len = user_text.length();
		
		if (ut_len <= 0 || user_text ==null) {
			result = 2;
			System.out.println(result);
			return;
		}
		
		for (int i = 0; i <= ut_len-1; i++) {
			
			char ch = user_text.charAt(i);
		
			if (!(ch >= '0' && ch <= '9')) {
				result = 0;
				break;
			}
		}
		System.out.println(result);
		
		

	}
}

