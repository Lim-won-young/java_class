package quiz;

import java.util.HashMap;

public class D07_PhoneBook {
	
	private HashMap<String, HashMap<String,String>> phone_book = new HashMap<>();
	// # HashMap을 이용한 PhoneBook을 구현해보세요
	
	// 1. 그룹 /전화번호 / 이름을 저장해야한다
	// 2. 그룹 이름을 키값으로 넣으면 해당 그룹의 전화번호 목록이 나온다
	// 3. 전화번호 목록에 전화번호를 키로 넣으면 이름이 나온다
	
	// # 구현해야 할 메서드
	
	// 1. 새로운 그룹을 추가하는 메서드
	// 2. 존재하는 그룹에 새로운 전홥번호를 등록하는 메서드
	// 3. 등록된 모든 전화번호를 보기좋게 출력하는 메서드
	// 4. 이름의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
	// 5. 전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
	
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
		
		System.out.println("'" +namePic +"'" + "이(가) 포함된 이름을 가진 사람의 모든 정보");
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
		
		System.out.println("'"+numberPic+"'" + "이(가) 포함된 번호를 가진 사람들의 모든 정보");
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
			// # Map타입 내부에 Map타입 넣기
			
			D07_PhoneBook pb1 = new D07_PhoneBook();
			
			// 기본 그룹
			pb1.phone_book.put("가족",new HashMap<>());
			pb1.phone_book.put("고등학교",new HashMap<>());

			System.out.println("기본적인 전화번호부 : " + pb1.phone_book);
			
			// 그룹을 추가하는 메서드
			pb1.phone_group_add("동아리");
			System.out.println("동아리 그룹 추가 후 전화번호부 : " + pb1.phone_book);
			
			// 존재하는 그룹에 새 전화번호를 추가하는 메서드
			pb1.phone_number_add("가족", "010-1111-2222", "엄마");
			pb1.phone_number_add("가족", "010-2222-3333", "아빠");
			pb1.phone_number_add("동아리", "010-4444-4444", "회장님");
			pb1.phone_number_add("고등학교", "010-7777-7777", "선생님");
			pb1.phone_number_add("고등학교", "010-8888-8888", "박지성");
			pb1.phone_number_add("고등학교", "010-9999-9999", "박지성");
			System.out.println("세부 전화번호 추가 후 전화번호부 : " + pb1.phone_book);
			
			// 등록된 전화번호를 보기좋게 출력하는 메서드
			System.out.println("++++++++++++++++++++++++++++"
					+ "+++++++++++++++++++++++++++++++++++++++++++++++++++++");
			pb1.show();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			// 이름의 일부를 입력하면 모든 전화번호가 출력되는 메서드
			pb1.containsName("님");
			
			// 전화번호의 일부를 입력하면 모든 전화번호가 출력되는 메서드
			pb1.containsNum("2222");
			
			
			
	}
}
