package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {
	
	public static void main(String[] args) {
		
		// 1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����Ѵ� (1,2,3)
		// 2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�
		// 3. �������� 31�� �θ��� ��� Ȥ�� ��ǻ�Ͱ� �й��Ѵ�
		
		
		int count = 0;
		String name;
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		// ó�� ���ڸ� �θ��� ��ü�� �������� ����
		// ���Ƿ� true�϶� ���(�÷��̾�), flase�϶� ��ǻ�Ͷ�� ����
		boolean player = ran.nextBoolean();
		name = player ? "����" : "��ǻ��";
		System.out.printf("������ %s �Դϴ�.\n",name);
		
		while(true) {
			int num;
			if (player == false) {
				num = ran.nextInt(3)+1;
				System.out.println("��ǻ�� > " + num);
			}
			else {
				System.out.print("��� > ");
				num = sc.nextInt();
				if (num > 3 || num < 1) {
					System.out.println("�߸��� �Է�");
					continue;
				}
			}
			count += num;
			if (count >= 31)
				break;
			System.out.println("���� ���� : "+count);
			player = !(player);
		}
		
		name = player ? "����" : "��ǻ��";
		System.out.printf("%s��(��) %d�� �ҷ����ϴ�. %s �й�",name,count,name);
		
	
		
		
		
		
		
		
		
		
		
	}
}
