package crypto;

import java.util.Arrays;


public class CaesarCipher extends Cipher {
	
	// # 암호란?
	//	- 비밀 메세지를 주고받기 위한 것
	//	- 암호화 (Encryption) : 평문(일반 메세지)를 암호문(비밀 메세지)로 바꾸는 것
	//	- 복호화 (Decryption) : 암호문을 평문으로 되돌리는것
	//	- 키(Key)
	//	 암호화와 복호화에 사용되는 비밀 값
	
	
	// # 시저(카이사르) 암호
	//	- 알파벳을 키(Key)값 만큼 오른쪽으로 이동시키는 암호 방식
	//	- 암호화	: 평문을 키 값 만큼 오른쪽으로 이동시킨다
	//	- 복호화	: 암호문을 키 값만큼 왼쪽으로 이동시킨다
	
	
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
		// 매개변수로 받은 평문을 암호화하여 리턴하는 함수를 구현
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
		// 매개변수로 받은 암호문을 복호화하여 리턴하는 함수를 구현
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
