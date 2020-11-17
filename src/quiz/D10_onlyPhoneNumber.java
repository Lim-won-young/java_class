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
				System.out.print("��ȣ�� �Է��ϼ��� : ");
			try {
				phoneNumber = sc.next(PhoneNumber_regex);
				System.out.println("��ȣ �Է¿� �����Ͽ����ϴ�!!!!");
				break;
			} catch (InputMismatchException e) {
				System.err.println("�߸��� ��ȣ �Է��Դϴ� ��Ŀ� ���� �ٽ� �Է����ּ���");
				sc.nextLine();
			}
		}
		
		
		System.out.println("�Էµ� ��ȭ��ȣ : "+phoneNumber);
		
		
	}
}
