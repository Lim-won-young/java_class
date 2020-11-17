package quiz;

import java.util.Scanner;

public class B05_CheckWord {
	
	
	public static void main(String[] args) {
		
		// 사용자로부터 단어를 하나 입력받고
		// 첫번째와 마지막이 같아면 "OK" 아니면 "NOT OK"
		
		String hteq = "OK";
		String hteqN = "NOT OK";
		

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("단어를 하나 입력하시오 > ");
		String word = sc.nextLine();
		if (word.length() <= 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		char headW = word.charAt(0);
		char tailW = word.charAt(word.length()-1);
		
		if (headW == tailW)
			System.out.println(hteq);
		
		else 
			System.out.println(hteqN);
		
		
	}
}
