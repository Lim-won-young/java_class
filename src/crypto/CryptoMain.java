package crypto;

import java.util.Scanner;

public class CryptoMain {
	
	public static void main(String[] args) {
		
		// 사용자가 메세지와 키 값을 설정하고 원하는 암호 알고리즘으로 암호화/ 복호화 작업을 할 수 있는 프로그램을 작성
		// 상속은 여러 클래스를 일반화(업캐스팅) 시키는 용도로 주로 많이 사용한다
		
	
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
			
			System.out.println("=======암호화 복호화 프로그램=======");
			System.out.printf("1. 문장 입력	 : %s\n",msg);
			System.out.printf("2. Key값 입력	 : %d\n", key);
			System.out.printf("3. 알고리즘 선택	 : %b\n",algorithm);
			System.out.printf("4. 암호화/복호화 선택 : %b\n",choose_lock);
			System.out.println("5. 결과 출력");
			
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				System.out.println("메시지를 입력하세요!");
				msg = sc.nextLine();
				break;
			case 2:
				System.out.println("Key값을 입력하세요!");
				key = sc.nextInt();
				break;
			
			case 3:
				System.out.println("알고리즘을 선택하세요!!\n1.CAESARCIPHER 2.TRANSPOSITIONCIPHER");
				algorithm = sc.nextInt() == 1 ? false : true;
				break;
			case 4:
				System.out.println("암호화/복호화를 선택하세요!!\n1.복호화 2. 암호화");
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
		
		
		// while 문을 이용해서 평문 -> 암호문 변경
		
		// 1. 현재 상황판과 함께 설정 매뉴를 출력
		// 2. 설정 매뉴를 선택하면 입력값을 통해 해당 매뉴에 대한 설정값을 변경 후 저장 -> 상황판에 최신화
		// 3. 설정이 완료되었으면 출력 버튼을 입력하여 변경된 평문 또는 암호문을 출력한다 
		
		
		
	}

}






