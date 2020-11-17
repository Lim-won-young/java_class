import java.util.Arrays;

public class C01_function {
	
	// 함수 (function)
	//	- 기능을 미리 정의해두고 나중에 가져다 쓰는것
	//	- 함수 이름 뒤에 ()를 붙여서 함수를호출하면 함수의 실행 결과가 반환된다
	//	- 나중에 재사용 할 가능성이 있는 기능을 미리 만들어둠으로써 작업의 반복을 줄인다
	
	// ex : 사과의 개수와 바구니의 크기를 전달받으면 필요한 바구니 개수를 알려주는 기능
	
	public static int appleBasket(int appleNum, int basketSize) {
		int result;
		
		if (appleNum % basketSize == 0) {
			result = appleNum / basketSize;
		}
		else {
			result = appleNum / basketSize + 1;
		}
		 // 함수 타입이 int이므로 돌려주는 값의 타입이 int여야 한다
		return result;
	}
	
	public static int cheapPrice(int[] prices) {
		int min = 0;
		
		for (int i = 0; i < prices.length ; i++) {
			if (i == 0) {
				min = prices[i];
			}
			else {
				min = Math.min(min, prices[i]);
			}
		}
		
		return min;
	}
	
	public static double avgPrice(int[] prices) {
		double avg = 0;
		for (int i = 0; i < prices.length ; i++) {
			avg += prices[i];
		}
		
		return avg/prices.length;
	}
	
	// ex : 전달한 사과 가격들을 10000원씩 증가시키는 함수
	
	public static void raisePrice(int[] prices) {
		for (int i = 0; i< prices.length ; i++) {
			prices[i] += 10000;
		}
		
		// 리턴 타입이 void인 함수는 아무것도 리턴하지 않는다.
	}
	
	
	public static void main(String[] args) {
		int count = appleBasket(25,10);
		
		System.out.println("필요한 바구니 개수 : " + count);
		
		int[] apples = { 1000,2000,989,1100,990};

		System.out.println("제일 싼 사과 가격 : " + cheapPrice(apples));
		
		System.out.println("사과의 평균가 : " + avgPrice(apples));
		
		raisePrice(apples);
		
		System.out.println(Arrays.toString(apples));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
