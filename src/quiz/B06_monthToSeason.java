package quiz;

import java.util.Scanner;

public class B06_monthToSeason {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���� �Է��Ͻÿ� > ");
		int month = sc.nextInt();
		if (month <= 0 || month > 12) {
			System.out.println("���� 1���� 12�������ۿ� �����ϴ�.");
			return;
		}
		

		
		switch (month) {
		
		case 3: case 4: case 5:
			System.out.printf("%d���� ���Դϴ�",month);
			break;
		case 6: case 7: case 8:
			System.out.printf("%d���� �����Դϴ�",month);
			break;
		case 9: case 10: case 11:
			System.out.printf("%d���� �����Դϴ�",month);
			break;
		
		default:
			System.out.printf("%d���� �ܿ��Դϴ�",month);
			break;
			
		}
	}

}
