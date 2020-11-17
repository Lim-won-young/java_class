package quiz;

import java.util.ArrayList;
import java.util.Collections;


public class D02_FiveDice extends D02_Dicemethod {
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 100; i++) {
			ArrayList<Integer> my_dice = dice_list();
			System.out.println(my_dice + " : " + dice_game(my_dice));
		}
	}

}
