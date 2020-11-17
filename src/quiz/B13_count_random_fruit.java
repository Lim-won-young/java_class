package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_count_random_fruit {
	
	public static void main(String[] args) {
		
		
		
		// 크기 100의 배열에 
		
		
		String[] frult = {"apple","banana","orange","peach","kiwi"};
		String[] basket = new String[100];
		int[] frultC = new int[5];
		
		Random ran = new Random();
		
		
		// 바구니에 랜덤한 과일을 넣는다
		for (int i = 0; i < basket.length ; i++) {
			int num = ran.nextInt(frult.length);
			basket[i] = frult[num];
		}
		
		
		// 바구니에 있는 과일을 판별하여 카운트한다
		for (int i = 0; i < basket.length ; i++) {
			for (int j = 0; j<frult.length; j++) {
				if (basket[i].equals(frult[j])) {
					frultC[j] += 1;
					break;
				}
			}
		}
		// 출력한다
		String result1 = Arrays.toString(basket);
		
		System.out.println(result1);
		
		for (int i = 0; i < frultC.length; i++)
			System.out.printf("%s는 %d번 뽑혔습니다.\n",frult[i],frultC[i]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
