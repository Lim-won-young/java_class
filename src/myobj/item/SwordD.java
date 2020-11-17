package myobj.item;

public class SwordD extends Weapon {

int magazine_size;
	
	public SwordD() {
		super(30);
		magazine_size = 10;
	}
	
	@Override
	public int damage() {
		return attack * magazine_size;
	}

}
	








