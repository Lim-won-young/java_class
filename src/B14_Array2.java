
public class B14_Array2 {
	
	// �迭 �ȿ��� �迭�� ���� �� �ִ�
	
	public static void main(String[] args) {
		
		
		// ������ ���� Ÿ�Կ��� null�� �� �� �ִ�
		// �迭 ������ ���� �����ϴ� ���� �ƴ϶� �迭�� ���� �ּҸ� �����Ѵ�
		// ��, �迭�� ������ ���� Ÿ���̴�
		int[] scores = { 99, 103, 456, 789};
		
		int[][] arr2 = {new int[5] // ����ִ� 5��¥�� int[] �迭
				,null // ���� �迭�� ����
				,{1,2,3,4,5}
		,new int[] {1,2,3}};
		
		
		
		// ���
		
		int[][] scores2 = {
				{80,90,100},
				{50,60,70},
				{90,90,90},
				{70,70,70},
		
		};
		
		// 1 : ���׶��
		// 2 : �׸�
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
					System.out.print(" �� ");
					break;
				case 3:
					System.out.print("   ");
					break;
				case 4:
					System.out.print(" �� ");
					break;
				default:
					System.out.print(" X ");
					break;
				}
			System.out.println();
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
