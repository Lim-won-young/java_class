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
	
	
	// ��ǻ�Ϳ� �����ϴ� ������ ���������� ������ ���� ��
	// ���α׷� ���� �� �ڵ����� �÷��̾��� ������ ���Ͽ� ����
	
	// ���α׷� ���� �� ������ �ҷ������� ��������
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
		
		// ���丮 ���� �޼���
		File dir = new File("D:\\java_io\\game");
		
		// ���丮�� �������� �ʴ´ٸ� ������
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

			System.out.println("���������� �º� ��� : " + result_array);
			
			
			
			savein.close();
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while (restart) {
			
			
			
			RSP computer_RSP = new RSP(ran.nextInt(3));
			RSP user_RSP;
			
			System.out.print("������ ���ðڽ��ϱ�?(1.�ָ�, 2.���� 3.��)\n> ");
			user_RSP = new RSP((sc.nextInt()-1));
			
			if (user_RSP.compareTo(computer_RSP) == 0)
				result = "��";
			else 
				result = user_RSP.compareTo(computer_RSP) == -1 ? "��" : "��";
			
			System.out.println("Computer : " + computer_RSP + "\nUser : " + user_RSP + "\n��� : " + result);
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
					
					System.out.println("����� ����Ǿ����ϴ� : " + result_array);
					
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
