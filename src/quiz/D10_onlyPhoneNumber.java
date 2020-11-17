package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_onlyPhoneNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pattern PhoneNumber_regex = Pattern.compile("01[01679]-[\\d]{3,4}-[\\d]{4}");
		String phoneNumber = null;
		
		
		while(true) {
				System.out.print("번호를 입력하세요 : ");
			try {
				phoneNumber = sc.next(PhoneNumber_regex);
				System.out.println("번호 입력에 성공하였습니다!!!!");
				break;
			} catch (InputMismatchException e) {
				System.err.println("잘못된 번호 입력입니다 양식에 맞춰 다시 입력해주세요");
				sc.nextLine();
			}
		}
		
		
		System.out.println("입력된 전화번호 : "+phoneNumber);
		
		
	}
}
