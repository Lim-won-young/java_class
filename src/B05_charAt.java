import java.util.Scanner;

public class B05_charAt {
	
	
	public static void main(String[] args) {
		
		
		// # "���ڿ�".charAt(index)
		// -  ���ڿ����� ���ϴ� ��°�� ���ڸ� ������ �Լ�
		// -  �� �Լ��� ���� ����� char Ÿ���̴� (��ȯ Ÿ���� charŸ���̴�)
		// -  ù ��° ���ڰ� 0��
		
		// # "���ڿ�".length()
		// -  ���ڿ��� �� ���ڷ� �̷�����ִ����� �˷��ش�
		// -  ��ȯ Ÿ�� int
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�ƹ��ų� �Է��غ��ÿ� > ");
		String word = sc.next();
		
		
		System.out.println("�Էµ� word���ڿ� = " + word);
		System.out.println("word.length() = " +word.length());
		
		char a = word.charAt(0);
		System.out.println(a);
		
		System.out.print(word.charAt(0));
		System.out.print(word.charAt(1));
		System.out.print(word.charAt(2));
		System.out.print(word.charAt(3) + "\n");
		
		if (word.length() >= 5)
			System.out.println(word.charAt(4));
		else
			System.out.println("�ش� �ܾ��� ���̰� 5���� ª���ϴ�.");
	
	
	}
}
