package myobj.fruit;

public class Banana {
	
	
	public int size;
	public int sweet;
	public int calorie;
	public int damage;
	public String color;
	public String birthday;
	
	public Banana() {
	}
	
	public Banana(int calorie) {
		
		this.calorie = calorie;
		System.out.println(this.calorie +"Į�θ��� �ٳ����� �����Ǿ����ϴ�.");
	}
	
	public Banana(int calorie, String color) {
		this(calorie);
		
		this.color = color;
		System.out.println("�ٳ����� �� : " + color);		
		
	}
	
	
	
	public void eat() {
		System.out.println("�ٳ����� �Ծ����ϴ�.");
		System.out.println(this.sweet + "��ŭ ����� ���������ϴ�.");
		this.size -= 1;
		this.calorie -= 10;
		System.out.printf("ũ�� : %d, ���� Į�θ� : %d\n",this.size,this.calorie);
	}
	
	public void attack() {
		System.out.println("�ٳ����� �������ϴ�.");
		System.out.println(this.damage + " ��ŭ �������� �������ϴ�.");
		System.out.println("�ٳ����� ����� " + (this.size -1)+ "�� �Ǿ����ϴ�." );
	}

}
