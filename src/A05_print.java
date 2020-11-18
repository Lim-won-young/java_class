import java.util.Scanner;

public class A05_print {

	
	public static void main(String[] args) {
		
		
		// # �ֿܼ� ����ϱ� ���� �������� �Լ���
		
		// 1. print()
		// -  ���� �ڵ����� �ٲ��� ������ ����ϴ� �Լ�
		System.out.print("Hello, world!");
		System.out.print("Hello, world!");
		System.out.print("Hello, world!");
		System.out.println();
		
		// 2. println()
		// -  ���� �ڵ����� �ٲٸ� ����ϴ� �Լ�
		// -  ()�� ������ ������ �� �ڿ� '\n'�� �߰��Ͽ� ����Ѵ�
		// -  ()�� �ƹ��͵� �������� ������ '\n'�� ����Ѵ�
		System.out.println("Hello, world!");
		System.out.println("Hello, world!");
		System.out.println("Hello, world!");
		
		
		
		
		
		
		
		
		// 3. printf()
		// -  ���� ���ڸ� �̿��� ����� �� �ִ� �Լ�
		// -  ������ �̿��ϴ°� ���� ��찡 ����
		// -  ���� �ڵ����� �ٲ����� �ʴ´�
		
		
		
		// ex: 2020�� 10�� 20�� ���� 9:20
		int year = 2020;
		int month = 10;
		int day = 20;
		
		System.out.println(year+"�� "+month+"�� " + day +"�� ���� 9:20"); 
		
		System.out.printf("%d�� %d�� %d�� ���� 9:20\n",year,month,day);
		
		
		// # printf�� ����ϴ� ���� ���ڵ�
		//		%d	 : 10���� ���� 	(decimal)
		//		%x,X : 16���� ����	 	(hexa decimal)
		//		%o,O : 8���� ����  	(octal)
		//		%s	 : ���ڿ�			(String)
		//		%c	 : ����			(Character)
		//		%f	 : �Ǽ�			(Float)
		
		
		System.out.printf("����� �ſ� ����� '%s' �Դϴ�.\n","1���");
		System.out.printf("%d[%c], %x(16), %o(8)\n", 65,65,65,65);
		
		// # ���Ĺ��� �ɼ�
		//  �� d�� �־�� �ϴ� ���� �ƴ�
		
		
		// %����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ������ �����Ͽ� ����Ѵ�		
		System.out.printf("�̸� : %15s\n", "Hong gildong");
		System.out.printf("���� : %15d\n", 15);
		
		// �ʹ� ��� ��ģ��
		System.out.printf("�̸� : %15s\n", "Hooooooooooooooooong gildong");
		
		// %-����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ���� �����Ͽ� ����Ѵ�
		System.out.printf("%-10s : Hong Gildong\n", "Fullname");
		System.out.printf("%-10s : 15\n", "Age");
		
		
		// %0����d :���ڸ�ŭ ĭ�� Ȯ���� �� ��ĭ�� 0�� ä�� ���
		
		System.out.printf("%010d\n",123);
		System.out.printf("%020f\n",123.123);
		
		// %+����d : ��� �տ��� ��ȣ�� ���̰� �ȴ�
		System.out.printf("������ �µ��� ���� '%+d��'�Դϴ�.\n", 5);
		System.out.printf("������ �µ��� ���� '%+d��'�Դϴ�.\n", -20); 
		// %.����f : �Ҽ� �ڸ����� �����Ѵ�
		
		System.out.printf(".3\t: %.3f\n", 123.123);
		System.out.printf("default\t: %f\n",123.123);
		System.out.printf(".10\t: %.10f\n",123.123);
		System.out.printf(".20\t: %.20f\n",123.123);
		System.out.printf(".255\t: %.255f\n",123.123);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ƹ� ���̳� �Է��غ��ÿ� > ");
		int num = sc.nextInt();
		System.out.println("�Է¹��� �� : " + num );
		
		int num2 = sc.nextInt();
		System.out.println("�Է¹��� �ι�° �� : " + num2 );
	}
}



























