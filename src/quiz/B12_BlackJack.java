package quiz;

import java.util.Random;

public class B12_BlackJack {
	
	public static void main(String[] args) {
		
		
		Random ran = new Random();
		StringBuilder cardM = new StringBuilder("");
		
		
		// ������ ���� ���ڿ��� ���� ��, ���ڿ��� ���� ������ ���� �� ����غ�����
		
		String deck = "123456789ABCD"
				+"123456789ABCD"
				+"123456789ABCD"
				+"123456789ABCD";
		
		
		for (int i = 1; i < 5 ; i++) {
			
			int draw = ran.nextInt(deck.length());
			
			cardM.append(deck.charAt(draw));
		}
		
		
		System.out.println(cardM);
		
		
		
	}

}
