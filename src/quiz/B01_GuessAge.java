package quiz;

import java.util.Scanner;

public class B01_GuessAge {

	
	public static void main(String[] args) {
		

		int repeat = 0;
	
		while(repeat != 999) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("���ϴ� �׸��� �����Ͻÿ�");
			System.out.print("1. ���� ���/ 2. �µ� ��ȯ / 3. �޷� ȯ�� > ");
			
			int num = sc.nextInt();
			
			
			switch(num) {
			case 1:
				System.out.print("������ �⵵�� �Է��Ͻÿ� > ");
				int thisYear = sc.nextInt();
			
				System.out.print("�¾ �⵵�� �Է��Ͻÿ� > ");
				int bornYear = sc.nextInt();
				
				System.out.printf("����� ���̴� %d�� �Դϴ�\n", thisYear-bornYear+1);
				repeat = 999;
				break;
			case 2:
				System.out.print("�µ��� �Է��Ͻÿ�(��) > ");
				int celcius = sc.nextInt();
				
				System.out.printf("ȭ���� ��ȯ�մϴ� -> %d��\n", (celcius * 9/5) + 32);
				repeat = 999;
				break;
			case 3: 
				System.out.print("ȯ���� �ݾ��� �Է��Ͻÿ�/����(��) > ");
				int won = sc.nextInt();
				double exchange = 1140.24;
				System.out.printf("%.2f$�� ���޵˴ϴ�", (won*0.9825)/exchange);
				repeat = 999;
				break;
				
			default :
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���\n");
				
				
			
			}
		}
		

	}
}




