package quiz;

import java.util.HashMap;

public class D07_PhoneBook {
	
	private HashMap<String, HashMap<String,String>> phone_book = new HashMap<>();
	// # HashMap�� �̿��� PhoneBook�� �����غ�����
	
	// 1. �׷� /��ȭ��ȣ / �̸��� �����ؾ��Ѵ�
	// 2. �׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�
	// 3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű�� ������ �̸��� ���´�
	
	// # �����ؾ� �� �޼���
	
	// 1. ���ο� �׷��� �߰��ϴ� �޼���
	// 2. �����ϴ� �׷쿡 ���ο� ���d��ȣ�� ����ϴ� �޼���
	// 3. ��ϵ� ��� ��ȭ��ȣ�� �������� ����ϴ� �޼���
	// 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
	// 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
	
	public void phone_group_add(String groupN) {
		phone_book.put(groupN, new HashMap<>());
	}
	
	public void phone_number_add(String groupN,String number, String name) {
		HashMap<String, String> group_name = phone_book.get(groupN);
		group_name.put(number,name);
	}
	
	public void show() {
		for (String group : phone_book.keySet()) {
			//System.out.println(group + "\t:\t" + phone_book.get(group));
			System.out.print(group + "\t: ");
			for (String number : phone_book.get(group).keySet()) {
				System.out.print(phone_book.get(group).get(number)+ "(" + number+")\t");
			}
			System.out.println();
		}
	}
	
	public void containsName(String namePic) {
		if (namePic == "") {
			System.out.println("null");
			return;
		}
		
		System.out.println("'" +namePic +"'" + "��(��) ���Ե� �̸��� ���� ����� ��� ����");
		for (String group : phone_book.keySet()) {
			HashMap<String, String>check_list = phone_book.get(group);
			for (String person : check_list.keySet()) {
				if (check_list.get(person).contains(namePic)) {
					System.out.println(check_list.get(person) + "\t:\t" + person );
				}
			}
			
		}
	}
	
	public void containsNum(String numberPic) {
		
		if (numberPic == "") {
			System.out.println("null");
			return;
		}
		
		System.out.println("'"+numberPic+"'" + "��(��) ���Ե� ��ȣ�� ���� ������� ��� ����");
		for (String group : phone_book.keySet()) {
			HashMap<String, String>check_list = phone_book.get(group);
			for (String number : check_list.keySet()) {
					if (number.contains(numberPic)) {
						System.out.println(check_list.get(number) + "\t:\t" + number);
				}
			}
			
		}
	}

	
	
	public static void main(String[] args) {
			// # MapŸ�� ���ο� MapŸ�� �ֱ�
			
			D07_PhoneBook pb1 = new D07_PhoneBook();
			
			// �⺻ �׷�
			pb1.phone_book.put("����",new HashMap<>());
			pb1.phone_book.put("����б�",new HashMap<>());

			System.out.println("�⺻���� ��ȭ��ȣ�� : " + pb1.phone_book);
			
			// �׷��� �߰��ϴ� �޼���
			pb1.phone_group_add("���Ƹ�");
			System.out.println("���Ƹ� �׷� �߰� �� ��ȭ��ȣ�� : " + pb1.phone_book);
			
			// �����ϴ� �׷쿡 �� ��ȭ��ȣ�� �߰��ϴ� �޼���
			pb1.phone_number_add("����", "010-1111-2222", "����");
			pb1.phone_number_add("����", "010-2222-3333", "�ƺ�");
			pb1.phone_number_add("���Ƹ�", "010-4444-4444", "ȸ���");
			pb1.phone_number_add("����б�", "010-7777-7777", "������");
			pb1.phone_number_add("����б�", "010-8888-8888", "������");
			pb1.phone_number_add("����б�", "010-9999-9999", "������");
			System.out.println("���� ��ȭ��ȣ �߰� �� ��ȭ��ȣ�� : " + pb1.phone_book);
			
			// ��ϵ� ��ȭ��ȣ�� �������� ����ϴ� �޼���
			System.out.println("++++++++++++++++++++++++++++"
					+ "+++++++++++++++++++++++++++++++++++++++++++++++++++++");
			pb1.show();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			// �̸��� �Ϻθ� �Է��ϸ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
			pb1.containsName("��");
			
			// ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
			pb1.containsNum("2222");
			
			
			
	}
}
