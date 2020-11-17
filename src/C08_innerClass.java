
public class C08_innerClass {
	
	// 클래스 내부에 클래스 사용하기
	
	public static void main(String[] args) {
		AppleBox box = new AppleBox(20,false);
		
		System.out.println(box.box[0].color);
		
		
		// 외부에서 다른 클래스의 내부 클래스 사용하기
		
		AppleBox.Apple apple01 = new AppleBox(10,true).new Apple();
		
		System.out.println(apple01.color);
		System.out.println(apple01.size);
		
	}

}


// # outer class
//	- 접근 제어자에 default와 public만 사용할 수 있다
class AppleBox {
	
	Apple[] box;
	private boolean mutation;
	
	public AppleBox(int size, boolean mutation) {
		box = new Apple[size];
		this.mutation = mutation;
		
		for (int i = 0; i < box.length; i++) {
			// 같은 클래스 내부의 자원이기 때문에 this를 생략하고 사용할 수 있다
			box[i] = this.new Apple();
		}
	}
	
	
	// # inner class
	//	- 접근 제어자를 자유롭게 사용할 수 있다
	// AppleBox의 인스턴스가 생기기전에는 inner class Apple이 존재하지 않는다
	public class Apple {
		String color;
		int size;
		
		public Apple() {
			if (mutation) {
				color = "보라색";
			}
			else {
				color = "빨간색";
			}
		}
		
	}
	
}






