import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E02_BufferedIO {
	
	// # Buffered I/O
	//	- ���۸� �̿��� �б�/���� ������ ����Ű�� Ŭ����
	//	- ���۶�? �����͸� ��/����ϱ� ���� �ӽ÷� �����صδ� �迭
	
	// # ���۸� �̿��ؾ��ϴ� ����
	//	- ���۾��� �б�/���⸦ �ϰԵǸ� ������� �ʹ� ���� �Ͼ��
	
	// EX > Java programming�� ����ϴ� ���
	// -> �⺻ OutputStream�� ����ϴ� ��� �� ���� �� ����ϱ� ������ ���� �� ��ŭ�� ����� �߻��ϰ� �ȴ�
	// -> �迭�� �����س��� �ѹ��� ���� 1���� ��¸����� ����� ����
	
	public static void main(String[] args) {
		//dummy data
		StringBuilder text = new StringBuilder();
		
		for (int i = 0; i < 100000; i ++) {
			text.append(i + " �ȳ��ϼ���\n");
		}
		
		// # java.io.BufferedOutputStream
		//	- �����ڿ� OutputStream�� �䱸�Ѵ�
		//	- OutputStream�� ����� ��Ҹ� �����ϴ� �뵵�� ���
		//	- BufferedOutputStream�� ���� ���׷��̵��� �뵵�� ���
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt");
			
			// # ������ ũ�Ⱑ 1024�� ��� 
			//	- �����͸� �ش� OutputStream�� �� �� 1024����Ʈ�� �����Ͱ� �� ���̸� ����Ѵ�
			//	- Ȥ�� ���α׷��Ӱ� flush()�޼��带 ȣ���� �� ����Ѵ�
			//	- Ȥ�� close()�� �߻��ϸ� ���� ���� �����͸� ����Ѵ�
			BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);
			
			
			byte[] data = new String(text).getBytes();
			
			
			 for (byte b : data){
			 	bout.write(b);
			 }
			
			
			// batch processing
			//bout.write(data);
			bout.close();
			fout.close();
			
			
		} catch (FileNotFoundException e) {
			System.err.println("��θ� ã�� �� �����ϴ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		// # java.io.BufferedInputStream
		//	- InputStream�� �����ڷ� ����Ѵ�
		
		
		try {
			FileInputStream fin = new FileInputStream("D:\\java_io\\bufferedout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin,1024);
			
			// # read()�� �⺻ �����ε�
			//	- �� ����Ʈ�� int������ �о�´�
			
			// # read(byte[]) �����ε�
			//	- ������ byte[]�� ũ�� ��ŭ�� byte�� ä���ش�
			//	- ������ �迭 �߿� �� byte�� ä�������� ��ȯ (len)
			
			// # read(byte[],off,len)
			//	- ������ byte[]�߿��� off���� len�������� �����͸� ä���ش�
			//	- ������ �迭�� �� byte�� ä������ ��ȯ�Ѵ�
			
			int b;
			
			while ((b = bin.read()) != -1) {
				System.out.print((char)b);
			}
			
			bin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			System.err.println("������ ��θ� ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.err.println("������ �о���� ���� ������ �߻��Ͽ����ϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
