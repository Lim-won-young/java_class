package quiz;

import java.util.Scanner;

public class B04_appleQuiz {

	
	public static void main(String[] args) {
		
		// ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�
		// ����ڰ� ����� ������ �Է��ϸ� �ʿ��� �ٱ����� ������ ���
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ������ �Է��Ͻÿ� > ");
		int apple = sc.nextInt();
		int basket = 0;
		
		if (apple <= 0) 		
			basket = 0;
		
		else if (apple % 10 == 0)
			basket = apple / 10;
		
		else 
			basket = (apple /10) + 1;
	
		
		System.out.println("�ʿ��� �ٱ����� ���� : "+basket +"��");
		
		
	}
}
