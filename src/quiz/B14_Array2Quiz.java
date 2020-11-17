package quiz;

import java.util.Arrays;

public class B14_Array2Quiz {
	public static void main(String[] args) {
		
		
		
		int[][] numArr = {
				{10, 10, 10, 10},
				{90, 50, 30, 70},
				{800, 500},
				{300, 300, 300}
				
		};
		
		int [][] matrix_S = new int[2][4];
		
		int raw = 0;
		int col = 1;
		
		int sum = 0;
		float cnt = 0;
		
	
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++){
				matrix_S[raw][i] += numArr[i][j];
				matrix_S[col][j] += numArr[i][j];
				sum += numArr[i][j];
				cnt++;
			}
		}
		

		System.out.printf("ÃÑÇÕ : %d\nÆò±Õ : %.2f\n",sum, sum/cnt);
		System.out.println("¿­ÀÇ ÇÕ : " + Arrays.toString(matrix_S[raw]));
		System.out.println("ÇàÀÇ ÇÕ : " + Arrays.toString(matrix_S[col]));

		
	}
}
