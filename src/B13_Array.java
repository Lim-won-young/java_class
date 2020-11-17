import java.util.Arrays;

public class B13_Array {
	
	// 배열
	// - 같은 타입의 변수를 한번에 여러개 선언하는 방법
	// - 인덱스를 활용해 해당 번째의 값에 접근할 수 있다
	//	 (반복문과 함께 활용하면 매우 편하다)
	// - 배열은 한번 크기가 정해지면 크기를 변경할 수 없다
	// - 배열은 초기화가 자동으로 되어있다
	// - (정수 : 0, 실수 : 0.0, boolean : false, 참조형 : null)
	
	public static void main(String[] args) {
		
		// 변수 100개를 쉽게 만드는 방법
		int[] a = new int[100];
		
		a[0] = 10;
		a[1] = 55;
		a[99] = 999999;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		// # 배열을 선언하는 방법
		// 1. 타입[] 배열이름 = new 타입[배열크기];
		// 2. 타입[] 배열이름 = {값1, 값2, 값3, ...};
		// 3. 타입[] 배열이름 = new 타입[] {값1, 값2, 값3, ...};
		// # 배열을 요구하는 함수들 중 바로 배열을 입력해주고 싶을 경우 3번 방법 사용
		// Arrays.toString(arr) : 전달받은 함수를 보기좋은 문자열로 반환
		// String result = Arrays.toString(new String[] {"가","나","다"});;
		String[] colors = {"red","blue","green","yellow"};
		double[] scores = {9.9,8.8,7.7,6.6,5.5,4.4,99,'B',123.123f,3000000000L};
		boolean[] testResults = new boolean[] {true,false,true,true,true,false};
		
		
		String result = Arrays.toString(scores);
		
		System.out.println(result);
		
		// # 배열가 반복문 활용하기
		
		System.out.println("colors 배열의 길이 : " + colors.length);
		
		
		for (int index = 0; index < colors.length; index++)
			System.out.printf("%d번째 색 : %s\n",index,colors[index]);
		 
		
		// # String을 char형 배열로 변환하기
		
		String msg = "hello, world!";
		
		char[] msgArr = msg.toCharArray();
		
		for (int index=0; index < msgArr.length; index++)
			System.out.print(msgArr[index]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
