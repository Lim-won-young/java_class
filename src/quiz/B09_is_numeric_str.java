package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {

	
	public static void main(String[] args) {
		
		// �Է¹��� ���ڿ��� ���ڸ� ���ԵǾ� ������ ����� 1�� ����
		// �ٸ� ���ڰ� ���ԵǾ� �ִٸ� 0�� �����Ͽ� ���
		
		int result = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ� > ");	
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

