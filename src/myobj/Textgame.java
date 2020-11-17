package myobj;

import myobj.item.Gun;
import myobj.item.SwordD;
import myobj.monster.*;

public class Textgame {
	
	public static void main(String[] args) {
		
		Monster mon = new Monster();
		Zombie z1 = new Zombie();
		Dragon d1 = new Dragon();
		Goblin g1 = new Goblin();
		SwordD steel_sword = new SwordD();
		Gun gun = new Gun();
		
		
		z1.attacked(gun);
		d1.attacked(steel_sword);
		g1.attacked(steel_sword);
		mon.attacked(steel_sword);
	}

}
