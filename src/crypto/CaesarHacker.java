package crypto;

public class CaesarHacker {
	
	// ��ȣ���� charset�� �˰����� ������ȣ ������� �˰� �ִٰ� ������ ���·�
	// ��ȣ���� �̿��Ͽ� ���� �����غ�����

	// �� ��ȣ�� �������� ���� �� ���� 3������ ��� �����ڰ� �˰� �ִٰ� �����Ѵ�
		
	static char[]codeC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ~!@#$%^&*()_+-=<>?,./abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	static String hijacked = "khoora@zruog$";
	
	
	public static void main(String[] args) {
		for (int key =0; key < codeC.length; key++) {
			CaesarCipher cipher = new CaesarCipher(key);
			System.out.println(cipher.decryption(hijacked));
		}
	}
	
	
	
}