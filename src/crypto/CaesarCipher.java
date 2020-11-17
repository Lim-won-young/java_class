package crypto;

import java.util.Arrays;


public class CaesarCipher extends Cipher {
	
	// # ��ȣ��?
	//	- ��� �޼����� �ְ�ޱ� ���� ��
	//	- ��ȣȭ (Encryption) : ��(�Ϲ� �޼���)�� ��ȣ��(��� �޼���)�� �ٲٴ� ��
	//	- ��ȣȭ (Decryption) : ��ȣ���� ������ �ǵ����°�
	//	- Ű(Key)
	//	 ��ȣȭ�� ��ȣȭ�� ���Ǵ� ��� ��
	
	
	// # ����(ī�̻縣) ��ȣ
	//	- ���ĺ��� Ű(Key)�� ��ŭ ���������� �̵���Ű�� ��ȣ ���
	//	- ��ȣȭ	: ���� Ű �� ��ŭ ���������� �̵���Ų��
	//	- ��ȣȭ	: ��ȣ���� Ű ����ŭ �������� �̵���Ų��
	
	
	public int key = 0;
	
	
	public char[]codeC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ~!@#$%^&*()_+-=<>?,./abcdefghijklmnopqrstuvwxyz".toCharArray();
	public char[]k_codeC = new char[codeC.length];
	
	
	public CaesarCipher(int key) {
		this.key = key % codeC.length;
		int normal = 0;
		
		for (int i = 0; i < codeC.length; i++) {
			
			if ((this.key+i) >= codeC.length) 
				k_codeC[i] = codeC[normal++];
			
			else 
				k_codeC[i] = codeC[this.key+i];		
		}
	}
	
	
	
	
	
	@Override
	public String encryption(String plain_text){
		// �Ű������� ���� ���� ��ȣȭ�Ͽ� �����ϴ� �Լ��� ����
		char[]plain_textC = plain_text.toCharArray();
		
		for (int i = 0; i < plain_textC.length; i++) {
			for (int j = 0; j<codeC.length; j++) {
				if (plain_textC[i]==codeC[j]) {
					plain_textC[i] = k_codeC[j];
					break;
				}
			}
		}
		return String.valueOf(plain_textC);
	}
	
	@Override
	public String decryption(String crypto_text) {
		// �Ű������� ���� ��ȣ���� ��ȣȭ�Ͽ� �����ϴ� �Լ��� ����
		char[]crypto_textC = crypto_text.toCharArray();
		
		for (int i = 0; i < crypto_textC.length; i++) {
			for (int j = 0; j<k_codeC.length; j++) {
				if (crypto_textC[i]==k_codeC[j]) {
					crypto_textC[i] = codeC[j];
					break;
				}
			}
			
		}
		return String.valueOf(crypto_textC);
	}
	
	
	public static void main(String[] args) {
		
		CaesarCipher cae = new CaesarCipher(77);
		
		String before = cae.encryption("hello, world!");
		
		String after = cae.decryption(before);
		
		
		System.out.println(before);
		System.out.println(after);
		
		
			
	}
}
