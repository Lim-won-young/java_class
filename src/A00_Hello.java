
// # �ּ� (Comment)
// - ���α׷��Ӱ� �ϰ� ���� ���� �޸��صδ� ��
// - �ּ��� ���α׷� ���࿡ ������ ��ġ�� �ʴ´�

// ���ٸ� �ּ�ó�� �ȴ�

/*
 
 ������
 �ּ�ó��
 
*/

/**
	����ȭ �ּ�
	(��Ŭ������ �� ������ �о��ش�)
 */

// Ctrl + [+, -] : ���� ũ�� ����
// Ctrl + M : ���� â ũ�� �ִ�/�ּ�ȭ


// �� ��� ���� ���� ����Ű

// Ctrl + A : ���� ��ü ��� ����
// Shift + ����Ű	: ����Ű�� �̿��� �������
// Shift + Home : Ŀ�� ��ġ���� ���� �� �ձ��� �������
// Shift + End 	: Ŀ�� ��ġ���� ���� �� �ڱ��� ��� ����

// Tab 			: �鿩����
// Shift + Tab 	: �Ųٷ� �鿩����
// ��� �����Ͽ� �ϰ� �鿩���� ��� ����



// �� public class�� �̸��� �ݵ�� ���ϸ�� ���ƾ� �Ѵ�
public class A00_Hello {
// ���� ���� ������ �� �װ��� Ŀ���� �ΰ� F2�� ������
// �ش� ������ ���� ������ �ذ�å�� �� �� �ִ�
	
	
	// # main() �Լ�
	//  - ���α׷��� ���� ���� 
	//  - ���α׷��� �����ϸ� ���� ���� main() �Լ��� ã�Ƽ� �����Ų��
	//  - main() �Լ��� ������ �߰�ȣ�� �����ȴ�
	public static void main (String args[]) {
		// ���α׷��� ���� ����
		
		
		// # System.out.print() �Լ�
		// - () �ȿ� ������ �����͸� �ֿܼ� ����ϴ� �Լ�
		
		// # �Լ���?
		// - � �ܾ� �ڿ� ()�� �پ� �ִ� ���� ��� �Լ���� �θ���
		
		// # �ܼ��̶�?
		// - ���ڸ� ������ ���� ȭ�� (���� ��ǻ�� ȭ��)
		// - Eclipse������ �׽�Ʈ������ �Ͼ� ������ �ܼ��� �����ϴ� �� ��
		// - ������ �츮�� �ۼ��� ���α׷��� ���� ȭ�鿡�� �����ϸ�
		//	 ���� ȭ�鿡 ��µȴ�
		System.out.println("Hello, world!");
		System.out.println("Apple");
		System.out.println("Melon");
		
		System.out.println("��������������������������������������������������������");
		System.out.println("��     **Select Number**    ��");
		System.out.println("��      1. Start Game       ��");
		System.out.println("��      2. Exit             ��");
		System.out.println("��                          ��");
		System.out.println("��������������������������������������������������������");
		
		//# �ڹ��� �����͵�
		
		// 1. ""���̿� ���� �� : ���ڿ� (String), ���� ������
		
		System.out.println("ABCDEFG�����ٶ󸶹ٻ�");
		System.out.println("�ȳ��ϼ���~~!");
		
		// 2. �׳� ���� : ���� (int, Integer) ���굵 ����
		
		System.out.println(123);
		System.out.println(123456);
		System.out.println(123 + 2);
		System.out.println(123 * 2);
		
		
		// 3. �Ҽ� : �Ǽ� (Double, Float)
		
		System.out.println(123.1234567);	// �Ⱥ��̸� double
		System.out.println(123.123456f);	// f�� ���̸� float
		
		// 4. ''���̿� ���� �� : ���� (Character), ���� �� �ϳ�
		// �� ���� ����ǥ���� ���ڸ� ������ ������ ������ �߻��Ѵ�
		
		System.out.println('��');
		System.out.println('X');
		System.out.println('ʫ');
		System.out.println('$');
		
		// # ���ڰ� ������ ������ �ִ� ���ڰ� ����
		
		System.out.println("ʫ�� �ڵ尪 : " + (int)'ʫ');
		System.out.println("$�� �ڵ尪 : " + (int)'$');
		System.out.println("���� �ڵ尪 : " + (int)'��');
		
		// # �ڵ尪���� ���� ����ϱ�
		System.out.println("23478�� ���ڰ� : " + (char)23478);
		System.out.println("36�� ���ڰ� : " + (char)36);
		System.out.println("44032�� ���ڰ� : " + (char)44032);
		
		// �� �ٸ� Ÿ�� + ������ �����ϴ�
		
		// 1. ���ڿ� + ������ �̾���� ���ڿ��� �ȴ�
		System.out.println("123"+ 456);
		System.out.println("���ڿ� : "+ 456);
		
		
		// 2. �Ǽ� + ������ �Ǽ��� �ȴ�
		System.out.println(1234.56 + 30);
		
		// 3. ���� + ������ ���ڰ� �ȴ�
		System.out.println('��' + 90);
		System.out.println('A'+ 1);
	
		// ; (���� �ݷ�) : �� ��ɾ �������� �˸���
		
		// ���α׷��� ��
		//////////////////////////////////////////////////////////
		
	}

}





/*	for (int i = 2; i < 10 ; i++) {
		
		System.out.println(i +"��");
		
		for (int j = 1; j<10; j++) {
			System.out.printf("%d X %d = %d\n", i,j,i*j);
		}
	}

*/

























