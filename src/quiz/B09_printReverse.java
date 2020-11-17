package quiz;

import java.util.Scanner;

public class B09_printReverse {
	
	public static void main(String[] args) {
		
		
		//사용자가 문장을 입력하면 그 문장을 거꾸로 출력
		
//		String reverse = "";
		
		StringBuilder reverse = new StringBuilder("");
	
				
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하시오 > ");
		
		String user_text = sc.nextLine();
		int ut_len = user_text.length();
		
		System.out.println("바르게 출력 : " + user_text);
		
		System.out.print("반대로 출력 : ");
		
		for (int i = (ut_len -1); i >= 0; i--) {
			
			reverse.append(user_text.charAt(i));
			
		}
		
		String reverseS = reverse.toString();
		
		System.out.print(reverseS);
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




