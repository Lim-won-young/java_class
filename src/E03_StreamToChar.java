import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class E03_StreamToChar {
	
	// # Reader/Writer�� ���� Ŭ��������
	//	Stream���� ���� �����͸� ���ڷ� ��ȯ�ϴ� Ŭ�������̴�
	
	// # ���α׷��Ӱ� �����͸� ���ڷ� ���ϰ� �ٷ�� ���� ��
	//	InputStream/OutputStream�� Reader/WriterŬ������
	//	�ѹ� �� ���μ� ����Ѵ�
	
	public static void main(String[] args) {
		
		// # abstract class Reader
		//	- Reader�� ��ӹ޾� ������ Ŭ������
		//	- BufferedReader, InputStreamReader, FileReader ���...
		//	- Stream���� ���� �����͸� ���ڷ� �籸���Ͽ� ���α׷��ӿ��� �����Ѵ�
		//	- �ڵ� �����͸� ���ڷ� �籸���� �� ����� charset�� �˸°� �������� ������ ���ڰ� ������
		
		 try {
			FileReader fr = new FileReader("D:\\java_io\\bufferedout.txt",Charset.forName("EUC-KR"));
			
			// FileReader�� BufferedReader�� ���׷��̵�
			
			 // ������ �о��
			 FileInputStream fin = new FileInputStream("D:\\java_io\\bufferedout.txt");
			 
			 // �о�� ������ EUC-KR������� ����
			 InputStreamReader ir = new InputStreamReader(fin, "EUC-KR");
			 
			 // ���۸� ���� ������� ����
			 BufferedReader br = new BufferedReader(ir, 2048);
			 
			// ReaderŬ������ read�� ���� byte�� �ƴ϶�, ���� char�� �д´�
			int ch;
			while ((ch = br.read()) != -1) {
			//	System.out.print((char)ch);
			}
			
			
			br.close();
			ir.close();
			fin.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("�������� �ʴ� ���� ����Դϴ�.");
		} catch (IOException e) {
			System.err.println("������ �д� ���� ������ �߻��Ͽ����ϴ�.");
		}
		 
		
		 // # abstract class Writer
		 //	- ���Ͽ� ���ڸ� ������ �� charset�� ������ �� �ִ�
		 // - ���α׷��Ӱ� �� �� ���ϰ� OutputStream�� �̿��� �� �ִ�	
		 
		 
		 try {
			long start_time = System.currentTimeMillis();
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt");
			
			
			// OutputStream��Ŀ��� Writer�� ��ȯ (byte -> char)
			OutputStreamWriter ow = new OutputStreamWriter(fout, "UTF-8");
			
			// ���� �� �����  ���ļ� FileWriter()�� ������ ���� �ִ� : OutputStream�� Writer�� ��ȯ�ϴ� ������ ����
			
			// Buffered : ���� ���
			BufferedWriter bw = new BufferedWriter(ow,4096);
			
			// Print : ���α׷��ӿ��� ���� print�޼������ �̿��� �� ����
			PrintWriter pw = new PrintWriter(bw);
			
			// �ֿܼ� ����ϴ� ���� ���Ͽ� ����� �� �ִ�
			for (int i = 0; i < 10000; i++) {
				pw.printf("%d/%d %d:%d - �ȳ��ϼ��� �ݰ����ϴ�\n", 1,2,3,4);
			}
			pw.close();
			bw.close();
			ow.close();
			fout.close();
			
			System.out.println("����� ��� �������ϴ�. : " + (System.currentTimeMillis() - start_time) +"ms");
		} catch (FileNotFoundException e) {
			System.err.println("������ ã�� ���߽��ϴ�.");
		} catch (UnsupportedEncodingException e) {
			System.err.println("�߸��� ���ڵ� ����Դϴ�.");
		} catch (IOException e) {
			System.err.println("--");
		}
		 
		 
		 
		
	}
}
