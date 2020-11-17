package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

	

	// 1. 사용자가 자신의 여러가지 정보를 입력하면 그 정보를 사용자의 이름으로 된 파일에 저장해보세요
	// 2. 사용자의 이름을 전달받는다 -> 가입된 회원이라면 파일에서 정보를 읽어 출력 / 아니라면 가입되지 않았다고 출력하는 메서드를 작성
	// 3. 사용자의 정보를 수정할 수 있는 메서드를 구현
	
public class E03_joinMember {
	
	public static void new_member(String name_writer,String member_info[]) {
		
		try {
			FileWriter member_writer = new FileWriter(String.format("D:\\java_io\\member\\%s.txt", name_writer),Charset.forName("EUC-KR"));
			PrintWriter pw = new PrintWriter(member_writer);
			
			pw.print(String.format("이름 : %s\n%s/%s/%s", name_writer,member_info[0],member_info[1],member_info[2]));
			
			pw.close();
			member_writer.close();
			
		} catch (IOException e) {
			System.err.println("존재하지 않는 경로입니다.");
		}
		
	}
	
	public static void reading_member_info(String name_reader) {
		try {
			FileReader member_reader = new FileReader(String.format("D:\\java_io\\member\\%s.txt", name_reader),Charset.forName("EUC-KR"));
			int ch;
			while((ch = member_reader.read()) != -1) {
				System.out.print((char)ch);
			}
			member_reader.close();
			
		} catch (IOException e) {
			System.err.println("아직 가입되지 않은 사용자입니다.");
			System.exit(0);
		}
		
	}
	

	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String name_writer = null;
		String name_reader = null;
		ArrayList<String>member_info = new ArrayList<>();

		String name_revise = null;
		String member_revise_info = null;
		
		
		System.out.print("등록할 사용자의 이름을 입력하세요 > ");
		name_writer = sc.nextLine();
		System.out.println("멤버의 정보를 입력하세요(나이/혈액형/거주지)");

//		
//		System.out.print("확인할 사용자의 이름을 정확히 입력하세요 > ");
//		name_reader = sc.nextLine();
		
		
//		System.out.print("정보를 수정할 사용자의 이름을 입력하세요 > ");
//		name_revise = sc.nextLine(); 
//		reading_member_info(name_revise);
//		
//		System.out.print("\n수정할 정보를 입력하시오 > ");
//		member_revise_info = sc.nextLine();
//		
//		revise_member_info(name_revise,member_revise_info);
//		reading_member_info(name_revise);
//		
		
		
		
		
	}
}
