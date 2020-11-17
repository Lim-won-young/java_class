package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class E04_SaveGame  {
	
	
	// 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후
	// 프로그램 종료 시 자동으로 플레이어의 전적을 파일에 저장
	
	// 프로그램 실행 시 전적을 불러오도록 만들어보세요
	static class RSP implements Comparable<RSP>{
		String rsp_value;
		int rsp_num;
		String[] rsp_list;
		
		{
			rsp_list = new String[]{"Rock","Scissors","Paper"};
		}
		
		public RSP(int num) {
			this.rsp_value = rsp_list[num];
			this.rsp_num = num;
		}
		
		
		@Override
		public String toString() {
			return rsp_value;
		}


		@Override
		public int compareTo(RSP o) {
			if (this.rsp_value.equals(o.rsp_value))
				return 0;
			else if (this.rsp_num - o.rsp_num == -1 || this.rsp_num - o.rsp_num == 2)
				return 1;
			return -1;
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		boolean restart = true;
		String yesno;
		String result;
		ArrayList<String> result_array = new ArrayList<>();
		
		// 디렉토리 생성 메서드
		File dir = new File("D:\\java_io\\game");
		
		// 디렉토리가 존재하지 않는다면 만들어라
		if (dir.exists()) {
			dir.mkdir();
		}
		
		DataInputStream savein = null;
		try {
			savein = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\java_io\\game\\save.txt")));
			String resadd;
			
			
			
			while (true) {
				try {
				resadd = savein.readUTF();
				}
				catch (Exception e) {
					break;
				}
				result_array.add(resadd);
			}

			System.out.println("이전까지의 승부 결과 : " + result_array);
			
			
			
			savein.close();
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while (restart) {
			
			
			
			RSP computer_RSP = new RSP(ran.nextInt(3));
			RSP user_RSP;
			
			System.out.print("무엇을 내시겠습니까?(1.주먹, 2.가위 3.보)\n> ");
			user_RSP = new RSP((sc.nextInt()-1));
			
			if (user_RSP.compareTo(computer_RSP) == 0)
				result = "무";
			else 
				result = user_RSP.compareTo(computer_RSP) == -1 ? "패" : "승";
			
			System.out.println("Computer : " + computer_RSP + "\nUser : " + user_RSP + "\n결과 : " + result);
			result_array.add(result);
			
			System.out.println("CONTINUE?(Y/N)");
			yesno = sc.next();
			restart = yesno.equals("Y") ? true:false ;
			
			if (restart == false) {
				DataOutputStream saveout;
				try {
					saveout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\java_io\\game\\save.txt"),2048));
					
					for (String res : result_array)
						saveout.writeUTF(res);
					
					System.out.println("결과가 저장되었습니다 : " + result_array);
					
					saveout.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
