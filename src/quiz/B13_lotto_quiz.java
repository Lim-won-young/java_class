package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {
	
	
	public static void main(String[] args) {
		
		int[] lottoN = new int[6];
		Random ran = new Random();
		
		for (int i = 0; i < 6; i++) {
			lottoN[i] = ran.nextInt(45)+1;
			
			for (int j=0; j < i; j++) {
				if (lottoN[i]==lottoN[j])
					i--;
					break;
			}	
		}
		
		String result = Arrays.toString(lottoN);
		System.out.println("    �̹� �� �ζ� ��ȣ\n" + result);
		
	}
}
