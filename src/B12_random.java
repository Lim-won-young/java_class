import java.util.Random;

public class B12_random {
	
	public static void main(String[] args) {
		
		
		// # JAVA���� ������ ���� �����ϱ�
		
		// 1. Math.random() 
		//	- doubleŸ���� 0 <= x < 1�� ���� �Ҽ��� �����Ѵ�
		//	- �� �Ҽ��� �̿��Ͽ� ���ϴ� ���ڸ� ���� ����� �� �ִ�
	
		
		// # ���ϴ� ���ڸ� ����� ����	 	(ex : 80 ~ 100)
		//	- (1) ���ϴ� ������ ������ ���Ѵ�
		//	- (2) ���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ�
		// 	- (3) �Ҽ��� �Ʒ��� �����Ѵ�
//		for (int i = 0; i<10; i++) {
//			System.out.println((int)(Math.random()*21 +80));
//		}
//		
		
		// ���� : 3000�̻� 5000������ ���� ���� 100�� �̰�
		// 		 �׵��� ���Դ� ���� ū���� ���� �� ���
		
		
//		int min = 5000;
//		int max = 3000;
//		
//		for (int i = 0; i<100; i++) {
//			int rand = (int)(Math.random()*2001 +3000);
//			
//			// min = Math.min(min,rand);
//			min = min > rand ? rand : min;
//
//			// max = Math.max(max,rand);
//			max = max < rand ? rand : max;
//	
//		}
//		System.out.println("���� ū �� : " + max +"\n���� ���� �� : " + min);
		
		
		// 2. Random Ŭ������ �̿�
		//	- ������ �� ���ϴ� �õ��ȣ�� ������ �� �ִ�
		//	- ���� �õ� ��ȣ�� �����ϸ� ���� ���� ���´�
		//	- �õ��ȣ�� �������� ������ �������� �õ尡 ���õȴ�
		
		// # ���ο� ���� �õ� ����
		Random ran = new Random();
		
		// # Random.nextInt(bound) : ���ϴ� ������ ������ ��ȯ�Ѵ�
		//	- 0 ~ bound�̸��� ������ ��ȯ�Ѵ�
		//	- bound�� �������� ������ int���� ��ü���� ���� ������ ���õȴ�
		System.out.println("ran.nextInt(30) : " + ran.nextInt(30)); // 0 ~ 29
		System.out.println("ran : " + ran.nextInt()); // int ��ü ���� �� ����
		System.out.println(ran.nextInt(21) + 80); // 80 ~ 100
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
