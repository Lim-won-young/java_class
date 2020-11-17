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
	
	// # Reader/Writer가 붙은 클래스들은
	//	Stream으로 읽은 데이터를 문자로 변환하는 클래스들이다
	
	// # 프로그래머가 데이터를 문자로 편하게 다루고 싶을 때
	//	InputStream/OutputStream을 Reader/Writer클래스로
	//	한번 더 감싸서 사용한다
	
	public static void main(String[] args) {
		
		// # abstract class Reader
		//	- Reader를 상속받아 구현한 클래스들
		//	- BufferedReader, InputStreamReader, FileReader 등등...
		//	- Stream으로 얻은 데이터를 문자로 재구성하여 프로그래머에게 제공한다
		//	- 코드 데이터를 문자로 재구성할 시 사용할 charset을 알맞게 설정하지 않으면 글자가 깨진다
		
		 try {
			FileReader fr = new FileReader("D:\\java_io\\bufferedout.txt",Charset.forName("EUC-KR"));
			
			// FileReader를 BufferedReader로 업그레이드
			
			 // 파일을 읽어옴
			 FileInputStream fin = new FileInputStream("D:\\java_io\\bufferedout.txt");
			 
			 // 읽어온 파일을 EUC-KR양식으로 읽음
			 InputStreamReader ir = new InputStreamReader(fin, "EUC-KR");
			 
			 // 버퍼를 통해 입출력을 통제
			 BufferedReader br = new BufferedReader(ir, 2048);
			 
			// Reader클래스의 read는 다음 byte가 아니라, 다음 char를 읽는다
			int ch;
			while ((ch = br.read()) != -1) {
			//	System.out.print((char)ch);
			}
			
			
			br.close();
			ir.close();
			fin.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("존재하지 않는 파일 경로입니다.");
		} catch (IOException e) {
			System.err.println("파일을 읽는 동안 오류가 발생하였습니다.");
		}
		 
		
		 // # abstract class Writer
		 //	- 파일에 문자를 저장할 때 charset을 지정할 수 있다
		 // - 프로그래머가 좀 더 편리하게 OutputStream을 이용할 수 있다	
		 
		 
		 try {
			long start_time = System.currentTimeMillis();
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt");
			
			
			// OutputStream방식에서 Writer로 변환 (byte -> char)
			OutputStreamWriter ow = new OutputStreamWriter(fout, "UTF-8");
			
			// 위의 두 기능을  합쳐서 FileWriter()로 시작할 수도 있다 : OutputStream을 Writer로 변환하는 과정을 생략
			
			// Buffered : 성능 향상
			BufferedWriter bw = new BufferedWriter(ow,4096);
			
			// Print : 프로그래머에게 편리한 print메서드들을 이용할 수 있음
			PrintWriter pw = new PrintWriter(bw);
			
			// 콘솔에 출력하던 것을 파일에 출력할 수 있다
			for (int i = 0; i < 10000; i++) {
				pw.printf("%d/%d %d:%d - 안녕하세요 반갑습니다\n", 1,2,3,4);
			}
			pw.close();
			bw.close();
			ow.close();
			fout.close();
			
			System.out.println("출력이 모두 끝났습니다. : " + (System.currentTimeMillis() - start_time) +"ms");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다.");
		} catch (UnsupportedEncodingException e) {
			System.err.println("잘못된 인코딩 방식입니다.");
		} catch (IOException e) {
			System.err.println("--");
		}
		 
		 
		 
		
	}
}
