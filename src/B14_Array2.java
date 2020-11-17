
public class B14_Array2 {
	
	// 배열 안에도 배열을 넣을 수 있다
	
	public static void main(String[] args) {
		
		
		// 참조형 변수 타입에는 null이 들어갈 수 있다
		// 배열 변수도 값을 저장하는 것이 아니라 배열의 시작 주소를 저장한다
		// 즉, 배열도 참조형 변수 타입이다
		int[] scores = { 99, 103, 456, 789};
		
		int[][] arr2 = {new int[5] // 비어있는 5개짜리 int[] 배열
				,null // 아직 배열이 없음
				,{1,2,3,4,5}
		,new int[] {1,2,3}};
		
		
		
		// 용례
		
		int[][] scores2 = {
				{80,90,100},
				{50,60,70},
				{90,90,90},
				{70,70,70},
		
		};
		
		// 1 : 동그라미
		// 2 : 네모
		// 3 : X
		int[][] map = {
				{ 2, 2, 3, 3, 3},
				{ 2, 2, 3, 3, 3},
				{ 2, 2, 3, 3, 3},
				{ 2, 2, 3, 3, 3, 4},
				{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
				{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
				
		};
		
		for (int i =0; i < map.length; i++) {
			for (int j = 0; j<map[i].length; j++)
				switch (map[i][j]) {
				case 1:
					System.out.print(" O ");
					break;
				case 2:
					System.out.print(" □ ");
					break;
				case 3:
					System.out.print("   ");
					break;
				case 4:
					System.out.print(" ★ ");
					break;
				default:
					System.out.print(" X ");
					break;
				}
			System.out.println();
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
