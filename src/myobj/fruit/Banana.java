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
		System.out.println(this.calorie +"칼로리의 바나나가 생성되었습니다.");
	}
	
	public Banana(int calorie, String color) {
		this(calorie);
		
		this.color = color;
		System.out.println("바나나의 색 : " + color);		
		
	}
	
	
	
	public void eat() {
		System.out.println("바나나를 먹었습니다.");
		System.out.println(this.sweet + "만큼 기분이 좋아졌습니다.");
		this.size -= 1;
		this.calorie -= 10;
		System.out.printf("크기 : %d, 보유 칼로리 : %d\n",this.size,this.calorie);
	}
	
	public void attack() {
		System.out.println("바나나를 던졌습니다.");
		System.out.println(this.damage + " 만큼 데미지를 입혔습니다.");
		System.out.println("바나나의 사이즈가 " + (this.size -1)+ "이 되었습니다." );
	}

}
