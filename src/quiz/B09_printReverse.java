package quiz;

import java.util.Scanner;

public class B09_printReverse {
	
	public static void main(String[] args) {
		
		
		//����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ���
		
//		String reverse = "";
		
		StringBuilder reverse = new StringBuilder("");
	
				
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� > ");
		
		String user_text = sc.nextLine();
		int ut_len = user_text.length();
		
		System.out.println("�ٸ��� ��� : " + user_text);
		
		System.out.print("�ݴ�� ��� : ");
		
		for (int i = (ut_len -1); i >= 0; i--) {
			
			reverse.append(user_text.charAt(i));
			
		}
		
		String reverseS = reverse.toString();
		
		System.out.print(reverseS);
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




