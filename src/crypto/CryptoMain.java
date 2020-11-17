package crypto;

import java.util.Scanner;

public class CryptoMain {
	
	public static void main(String[] args) {
		
		// ����ڰ� �޼����� Ű ���� �����ϰ� ���ϴ� ��ȣ �˰������� ��ȣȭ/ ��ȣȭ �۾��� �� �� �ִ� ���α׷��� �ۼ�
		// ����� ���� Ŭ������ �Ϲ�ȭ(��ĳ����) ��Ű�� �뵵�� �ַ� ���� ����Ѵ�
		
	
		String msg = "All samples shall be properly labeled in order.";
		
		int key = 3;
		int select = 0;
		
		final boolean CAESARCIPHER = false;
		final boolean TRANSPOSITIONCIPHER = true;
		final boolean lock = true;
		final boolean un_lock = false;
		
		boolean algorithm = TRANSPOSITIONCIPHER;
		boolean choose_lock = un_lock;
		
		
		while (select != 5) {
			
			System.out.println("=======��ȣȭ ��ȣȭ ���α׷�=======");
			System.out.printf("1. ���� �Է�	 : %s\n",msg);
			System.out.printf("2. Key�� �Է�	 : %d\n", key);
			System.out.printf("3. �˰��� ����	 : %b\n",algorithm);
			System.out.printf("4. ��ȣȭ/��ȣȭ ���� : %b\n",choose_lock);
			System.out.println("5. ��� ���");
			
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				System.out.println("�޽����� �Է��ϼ���!");
				msg = sc.nextLine();
				break;
			case 2:
				System.out.println("Key���� �Է��ϼ���!");
				key = sc.nextInt();
				break;
			
			case 3:
				System.out.println("�˰����� �����ϼ���!!\n1.CAESARCIPHER 2.TRANSPOSITIONCIPHER");
				algorithm = sc.nextInt() == 1 ? false : true;
				break;
			case 4:
				System.out.println("��ȣȭ/��ȣȭ�� �����ϼ���!!\n1.��ȣȭ 2. ��ȣȭ");
				choose_lock = sc.nextInt() == 1 ? false : true;
				break;
			case 5:
				if (algorithm) {
					if (choose_lock) {
						String crypto = new TranspositionCipher(key).encryption(msg);
						System.out.println(crypto);
					}
					else {
						String crypto = new TranspositionCipher(key).decryption(msg);
						System.out.println(crypto);
					}	
				}
				else {
					if (choose_lock) {
						String crypto = new CaesarCipher(key).encryption(msg);
						System.out.println(crypto);
					}
					else {
						String crypto = new CaesarCipher(key).decryption(msg);
						System.out.println(crypto);
					}	
				}
				break;
			}
			
			
		}
		
		
		// while ���� �̿��ؼ� �� -> ��ȣ�� ����
		
		// 1. ���� ��Ȳ�ǰ� �Բ� ���� �Ŵ��� ���
		// 2. ���� �Ŵ��� �����ϸ� �Է°��� ���� �ش� �Ŵ��� ���� �������� ���� �� ���� -> ��Ȳ�ǿ� �ֽ�ȭ
		// 3. ������ �Ϸ�Ǿ����� ��� ��ư�� �Է��Ͽ� ����� �� �Ǵ� ��ȣ���� ����Ѵ� 
		
		
		
	}

}






