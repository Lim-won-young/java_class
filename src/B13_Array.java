import java.util.Arrays;

public class B13_Array {
	
	// �迭
	// - ���� Ÿ���� ������ �ѹ��� ������ �����ϴ� ���
	// - �ε����� Ȱ���� �ش� ��°�� ���� ������ �� �ִ�
	//	 (�ݺ����� �Բ� Ȱ���ϸ� �ſ� ���ϴ�)
	// - �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����
	// - �迭�� �ʱ�ȭ�� �ڵ����� �Ǿ��ִ�
	// - (���� : 0, �Ǽ� : 0.0, boolean : false, ������ : null)
	
	public static void main(String[] args) {
		
		// ���� 100���� ���� ����� ���
		int[] a = new int[100];
		
		a[0] = 10;
		a[1] = 55;
		a[99] = 999999;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		// # �迭�� �����ϴ� ���
		// 1. Ÿ��[] �迭�̸� = new Ÿ��[�迭ũ��];
		// 2. Ÿ��[] �迭�̸� = {��1, ��2, ��3, ...};
		// 3. Ÿ��[] �迭�̸� = new Ÿ��[] {��1, ��2, ��3, ...};
		// # �迭�� �䱸�ϴ� �Լ��� �� �ٷ� �迭�� �Է����ְ� ���� ��� 3�� ��� ���
		// Arrays.toString(arr) : ���޹��� �Լ��� �������� ���ڿ��� ��ȯ
		// String result = Arrays.toString(new String[] {"��","��","��"});;
		String[] colors = {"red","blue","green","yellow"};
		double[] scores = {9.9,8.8,7.7,6.6,5.5,4.4,99,'B',123.123f,3000000000L};
		boolean[] testResults = new boolean[] {true,false,true,true,true,false};
		
		
		String result = Arrays.toString(scores);
		
		System.out.println(result);
		
		// # �迭�� �ݺ��� Ȱ���ϱ�
		
		System.out.println("colors �迭�� ���� : " + colors.length);
		
		
		for (int index = 0; index < colors.length; index++)
			System.out.printf("%d��° �� : %s\n",index,colors[index]);
		 
		
		// # String�� char�� �迭�� ��ȯ�ϱ�
		
		String msg = "hello, world!";
		
		char[] msgArr = msg.toCharArray();
		
		for (int index=0; index < msgArr.length; index++)
			System.out.print(msgArr[index]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
