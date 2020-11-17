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

	

	// 1. ����ڰ� �ڽ��� �������� ������ �Է��ϸ� �� ������ ������� �̸����� �� ���Ͽ� �����غ�����
	// 2. ������� �̸��� ���޹޴´� -> ���Ե� ȸ���̶�� ���Ͽ��� ������ �о� ��� / �ƴ϶�� ���Ե��� �ʾҴٰ� ����ϴ� �޼��带 �ۼ�
	// 3. ������� ������ ������ �� �ִ� �޼��带 ����
	
public class E03_joinMember {
	
	public static void new_member(String name_writer,String member_info[]) {
		
		try {
			FileWriter member_writer = new FileWriter(String.format("D:\\java_io\\member\\%s.txt", name_writer),Charset.forName("EUC-KR"));
			PrintWriter pw = new PrintWriter(member_writer);
			
			pw.print(String.format("�̸� : %s\n%s/%s/%s", name_writer,member_info[0],member_info[1],member_info[2]));
			
			pw.close();
			member_writer.close();
			
		} catch (IOException e) {
			System.err.println("�������� �ʴ� ����Դϴ�.");
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
			System.err.println("���� ���Ե��� ���� ������Դϴ�.");
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
		
		
		System.out.print("����� ������� �̸��� �Է��ϼ��� > ");
		name_writer = sc.nextLine();
		System.out.println("����� ������ �Է��ϼ���(����/������/������)");

//		
//		System.out.print("Ȯ���� ������� �̸��� ��Ȯ�� �Է��ϼ��� > ");
//		name_reader = sc.nextLine();
		
		
//		System.out.print("������ ������ ������� �̸��� �Է��ϼ��� > ");
//		name_revise = sc.nextLine(); 
//		reading_member_info(name_revise);
//		
//		System.out.print("\n������ ������ �Է��Ͻÿ� > ");
//		member_revise_info = sc.nextLine();
//		
//		revise_member_info(name_revise,member_revise_info);
//		reading_member_info(name_revise);
//		
		
		
		
		
	}
}
