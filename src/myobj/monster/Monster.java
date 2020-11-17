package myobj.monster;

import myobj.item.Sword;
import myobj.item.SwordD;
import myobj.item.Weapon;

public class Monster {
	public String name;
	public int hp;
	
	
	public Monster() {
		name = "������ ����ƺ�";
		hp = 99999;
	}
	
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	
	public void attacked(Weapon weapon) {
		int dmg = weapon.damage();
		hp -= weapon.damage();
		System.out.printf("%s���� %d�� ������!\n",name,dmg);
		System.out.printf("%s�� ���� ü�� : %d\n", name, hp);
		
	}
	

}
