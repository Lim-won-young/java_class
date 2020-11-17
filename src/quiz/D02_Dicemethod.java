package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class D02_Dicemethod {
	
	
	public static ArrayList<Integer> dice_list() {
		Random ran = new Random();
		ArrayList<Integer> dice_list = new ArrayList();
		
		for (int i = 0; i < 5; i++) {
			dice_list.add(ran.nextInt(6)+1);
		}
		
		return dice_list;
	}
	
	
	
	public static String dice_game(ArrayList<Integer> my_dice) {
		ArrayList<Integer> count_list = new ArrayList<Integer>();
		ArrayList<Integer> full_house = new ArrayList<Integer>();
		ArrayList<Integer> str_l = new ArrayList<Integer>();
		Collections.addAll(full_house,2,3);
		Collections.addAll(str_l,2,3,4,5);

		

		for (int i = 0; i < 6; i++) {
			count_list.add(0);
		}
		
		for (int i = 1; i <= 6; i++) {
			int count = Collections.frequency(my_dice, i);
			count_list.remove(i-1);
			count_list.add(i-1,count);
			
		}

		
		
		
		if (count_list.contains(5))
			return "5다이스";
		if (count_list.contains(4))
			return "4다이스";
		if (count_list.containsAll(full_house))
			return "풀하우스";
		
		if (Collections.frequency(count_list, 1) == 5) {
			if (count_list.get(0)+count_list.get(5) == 1)
				return "라지 스트레이트";
			else if (count_list.get(2) + count_list.get(3) == 2)
				return "스몰 스트레이트";
		}
		
		if (Collections.frequency(count_list, 0) == 2) {
			if (count_list.get(0) + count_list.get(1) == 0)
				return "스몰 스트레이트";
			else if (count_list.get(4) + count_list.get(5) == 0)
				return "스몰 스트레이트";
			
		}
		
		
	
		
		
		return "아무것도 아닙니다";
	}
	
}
