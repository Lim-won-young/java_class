package quiz;

import java.util.Scanner;

public class B09_strupcase {
	
	public static void main(String[] args) {
		
		// �Է¹��� ���ڿ��� ��� ���ĺ��� �빮�ڷ� ��ȯ
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ� > ");	
		String original_text = sc.nextLine();
		int origin_len = original_text.length();
		StringBuilder conversion_L = new StringBuilder("");
		
		
		
		
		for (int i = 0; i < origin_len ; i++) {
			
			char ch = original_text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z' ) {
				// �ҹ��ڸ� �빮�ڷ� ��ȯ�ϴ� ���
				// ch -= Math.abs('a'-'A');
				// ch = (char)(ch - 'a' + 'A');
				ch -= 32;
			} 
			conversion_L.append(ch);		
		}
		
		String conversion_text = conversion_L.toString();
		
		System.out.println("ó�� �Էµ� ���� : "+ original_text);
		System.out.println("��ȯ�� ���ڿ� : " + conversion_text);	
	}
}


// StringBuilder�� ���� ���ڿ� �����

// * ��������� ��Ʈ�� ������ ����
// StringBuilder reverse = new StringBuilder("");

// * ������ ���ڿ� �߰�
// reverse.append(user_text.charAt(i));

// * �������� ��Ʈ������ ��ȯ 
// String reverseS = reverse.toString();

// String�� +=�� �߰��ϴ� ��� ���� ����� ������ �ӵ��� ����

