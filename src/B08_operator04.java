
public class B08_operator04 {
	
	
	public static void main(String[] args) {
		
		
		// # ���� ����
		
		//  = : ������ ������ �������� ���� ����
		int num = 10;
		num = num + 5;
		
		num = 10;
		
		
		
		// # ���� ���� ����
		//	- ������ ����� ������Ű�� ����
		
		
		System.out.println(num += 5);
		System.out.println(num -= 2);
		
		// # ���� ����
		num = 10;
		
		
		num++; // num = num + 1
		System.out.println(num);
		
		++num; 
		System.out.println(num);
		
		
		num--; // num = num - 1
		System.out.println(num);
		
		--num;
		System.out.println(num);
		
		
		// # ++, --�� ��ġ�� ���� ���� ����� �޶����⵵ �Ѵ�
		
		int a = 3, b = 10;
		int result = a++ *b;
		
		System.out.println(result);
		
		System.out.println("a�� �� : " + a);
		
		
		
		
		
	}
}







