package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_count_random_fruit {
	
	public static void main(String[] args) {
		
		
		
		// ũ�� 100�� �迭�� 
		
		
		String[] frult = {"apple","banana","orange","peach","kiwi"};
		String[] basket = new String[100];
		int[] frultC = new int[5];
		
		Random ran = new Random();
		
		
		// �ٱ��Ͽ� ������ ������ �ִ´�
		for (int i = 0; i < basket.length ; i++) {
			int num = ran.nextInt(frult.length);
			basket[i] = frult[num];
		}
		
		
		// �ٱ��Ͽ� �ִ� ������ �Ǻ��Ͽ� ī��Ʈ�Ѵ�
		for (int i = 0; i < basket.length ; i++) {
			for (int j = 0; j<frult.length; j++) {
				if (basket[i].equals(frult[j])) {
					frultC[j] += 1;
					break;
				}
			}
		}
		// ����Ѵ�
		String result1 = Arrays.toString(basket);
		
		System.out.println(result1);
		
		for (int i = 0; i < frultC.length; i++)
			System.out.printf("%s�� %d�� �������ϴ�.\n",frult[i],frultC[i]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
