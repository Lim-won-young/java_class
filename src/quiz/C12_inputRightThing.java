package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C12_inputRightThing {
	
	public static int input(String msg) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print(msg);
			try {
				return sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.err.println("���ڸ� �Է����ּ���!");
				sc.nextLine();
			}
		}
	}
	
	
	public static void main(String[] args) {
		// ����ڷκ��� int Ÿ���� �����͸� �Է¹ް� ����غ�����
		// �߸��� Ÿ���� �����Ͱ� �������� ���α׷��� ������� �ʾƾ� �մϴ�
		// (�ùٸ��� int�� �Էµ� ��� ���α׷��� ����˴ϴ�)
		
		int value = input("�ݵ�� ���ڸ� �Է��� �ּ��� > ");

		System.out.printf("�Է¹��� ���ڴ� %d�Դϴ�.",value);
	}
}


