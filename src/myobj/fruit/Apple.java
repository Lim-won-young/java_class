package myobj.fruit;

// �� Ŭ���� �ϳ��� ���� �ϳ��� �ٶ����ϴ�


public class Apple {
	int calorie;
	String color;
	
	public Apple(String color) {
		calorie = 300;
		
		if (!color.equals("red")) {
			throw new InvalidColorException();
		}
	}
	
	public Apple() {
		
	}

	public Apple eat() throws NoMoreCalorieException {
		
		
		if (this.calorie <= 0){
			throw new NoMoreCalorieException();
		}
		
		
		System.out.println("���ְ� �� �Ծ����ϴ�.");
		this.calorie -= 100;
		return this;
	}
	
	
	
	public static void main(String[] args) {
		
		try {
			new Apple("red").eat().eat().eat().eat();
		}
		catch (NoMoreCalorieException e) {
			System.out.println(e.getMessage());
		}
	}
	
}

