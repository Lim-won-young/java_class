package quiz;

import java.util.Scanner;

public class B09_strupcase {
	
	public static void main(String[] args) {
		
		// 입력받은 문자열의 모든 알파벳을 대문자로 변환
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 > ");	
		String original_text = sc.nextLine();
		int origin_len = original_text.length();
		StringBuilder conversion_L = new StringBuilder("");
		
		
		
		
		for (int i = 0; i < origin_len ; i++) {
			
			char ch = original_text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z' ) {
				// 소문자를 대문자로 변환하는 방법
				// ch -= Math.abs('a'-'A');
				// ch = (char)(ch - 'a' + 'A');
				ch -= 32;
			} 
			conversion_L.append(ch);		
		}
		
		String conversion_text = conversion_L.toString();
		
		System.out.println("처음 입력된 문자 : "+ original_text);
		System.out.println("변환된 문자열 : " + conversion_text);	
	}
}


// StringBuilder를 통해 문자열 만들기

// * 리버스라는 스트링 빌더를 만듬
// StringBuilder reverse = new StringBuilder("");

// * 어펜드로 문자열 추가
// reverse.append(user_text.charAt(i));

// * 리버스를 스트링으로 변환 
// String reverseS = reverse.toString();

// String에 +=로 추가하는 경우 새로 만들기 때문에 속도가 느림

