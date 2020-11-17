package myobj.monster;

import myobj.item.Sword;
import myobj.item.SwordD;
import myobj.item.Weapon;

public class Monster {
	public String name;
	public int hp;
	
	
	public Monster() {
		name = "연습용 허수아비";
		hp = 99999;
	}
	
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	
	public void attacked(Weapon weapon) {
		int dmg = weapon.damage();
		hp -= weapon.damage();
		System.out.printf("%s에게 %d의 데미지!\n",name,dmg);
		System.out.printf("%s의 남은 체력 : %d\n", name, hp);
		
	}
	

}
