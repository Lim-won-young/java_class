package quiz;

import java.util.Scanner;

public class B05_CheckWord {
	
	
	public static void main(String[] args) {
		
		// ����ڷκ��� �ܾ �ϳ� �Է¹ް�
		// ù��°�� �������� ���Ƹ� "OK" �ƴϸ� "NOT OK"
		
		String hteq = "OK";
		String hteqN = "NOT OK";
		

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�ܾ �ϳ� �Է��Ͻÿ� > ");
		String word = sc.nextLine();
		if (word.length() <= 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
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
