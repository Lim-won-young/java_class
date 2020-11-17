import java.util.Arrays;

public class C01_function {
	
	// �Լ� (function)
	//	- ����� �̸� �����صΰ� ���߿� ������ ���°�
	//	- �Լ� �̸� �ڿ� ()�� �ٿ��� �Լ���ȣ���ϸ� �Լ��� ���� ����� ��ȯ�ȴ�
	//	- ���߿� ���� �� ���ɼ��� �ִ� ����� �̸� ���������ν� �۾��� �ݺ��� ���δ�
	
	// ex : ����� ������ �ٱ����� ũ�⸦ ���޹����� �ʿ��� �ٱ��� ������ �˷��ִ� ���
	
	public static int appleBasket(int appleNum, int basketSize) {
		int result;
		
		if (appleNum % basketSize == 0) {
			result = appleNum / basketSize;
		}
		else {
			result = appleNum / basketSize + 1;
		}
		 // �Լ� Ÿ���� int�̹Ƿ� �����ִ� ���� Ÿ���� int���� �Ѵ�
		return result;
	}
	
	public static int cheapPrice(int[] prices) {
		int min = 0;
		
		for (int i = 0; i < prices.length ; i++) {
			if (i == 0) {
				min = prices[i];
			}
			else {
				min = Math.min(min, prices[i]);
			}
		}
		
		return min;
	}
	
	public static double avgPrice(int[] prices) {
		double avg = 0;
		for (int i = 0; i < prices.length ; i++) {
			avg += prices[i];
		}
		
		return avg/prices.length;
	}
	
	// ex : ������ ��� ���ݵ��� 10000���� ������Ű�� �Լ�
	
	public static void raisePrice(int[] prices) {
		for (int i = 0; i< prices.length ; i++) {
			prices[i] += 10000;
		}
		
		// ���� Ÿ���� void�� �Լ��� �ƹ��͵� �������� �ʴ´�.
	}
	
	
	public static void main(String[] args) {
		int count = appleBasket(25,10);
		
		System.out.println("�ʿ��� �ٱ��� ���� : " + count);
		
		int[] apples = { 1000,2000,989,1100,990};

		System.out.println("���� �� ��� ���� : " + cheapPrice(apples));
		
		System.out.println("����� ��հ� : " + avgPrice(apples));
		
		raisePrice(apples);
		
		System.out.println(Arrays.toString(apples));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}