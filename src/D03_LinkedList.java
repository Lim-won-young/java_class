import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class D03_LinkedList {
	
	// # ���� ����Ʈ
	//	- ArrayList���� ����/������ ������ ����Ʈ
	//	- �߰��� ������ �Ͼ�� �� ArrayList�� ��� �����͸� �ڷ� �̵����Ѿ� ������ (Shift) 
	//	- LinkedList�� ����� ��길 �ٲٸ� �Ǳ� ������ �ξ� ������
	//	- ArrayList�� ������ ����, �б⿡ �����ϰ�
	//	- LinkedList�� ������ ������ �� ���� �����ϴ�
	
	public static void main(String[] args) {
		
		LinkedList<String> mem = new LinkedList<>();
		
		mem.add("ȸ��1");
		mem.add("ȸ��2");
		mem.add("ȸ��3");
		
		mem.addFirst("�� ��");
		mem.addLast("�� ��");
		
		
		System.out.println(mem);
		
		System.out.println(mem.get(3));
		System.out.println(mem.getFirst());
		System.out.println(mem.getLast());
		
		// pop() : �� ���� �����͸� �����鼭 ���� (FIFO)
		
		System.out.println("++++++++ pop ���� ++++++++++");
		for (int i = 0, len = mem.size(); i < len; i++) {
			System.out.println("��� ���� �� : " + mem.pop());
			System.out.println("after pop : " + mem);
		}
	
		// �� LinkedList�� ����Ʈ, ����, ťó�� Ȱ���� �� �ִ�
		
		mem.add("ȸ��1");
		mem.add("ȸ��2");
		mem.add("ȸ��3");
		mem.add("ȸ��4");
		mem.add("ȸ��5");
		
		System.out.println(mem);
		
		// poll() : ù ��° ��Ҹ� �����鼭 ��� (pop�� �Ȱ���)
		System.out.println(mem.poll());
		System.out.println(mem);
		
		// pollLast() : ���� �ֱٿ� �߰��� ��Ҹ� �����鼭 ��� (LIFO)
		System.out.println(mem.pollLast());
		System.out.println(mem);
		
		// peek() : ������ ���� �ʰ� �� ó�� ��Ҹ� ����ϱ�
		System.out.println(mem.peek());
		System.out.println(mem);
		
		// peek() : ������ ���� �ʰ� ������ ��Ҹ� ����ϱ�
		System.out.println(mem.peekLast());
		System.out.println(mem);
		
		// �ӵ� ���� �׽�Ʈ
		ArrayList<Integer> arr_list = new ArrayList<Integer>(1000000);
		
		for (int i = 0; i < 1000000; i++) {
			arr_list.add(i);
		}
		
		LinkedList<Integer> linked_list = new LinkedList<Integer>();
		
		for (int i = 0; i < 1000000; i++) {
			linked_list.add(i);
		}
		
		HashSet<Integer> toAdd = new HashSet<>();
		
		for (int i = 0; i < 2; i++) {
			toAdd.add(i);
		}
		
		
		// ArrayList�� �߰��� �����͸� �߰��ϴ� ���� ������
		long start = System.currentTimeMillis();
		System.out.println("ArrauList Insertion Test ����");
		for (int i = 0; i < 2000; i++) {
			arr_list.addAll(10,toAdd);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrauList End : " + (end - start) + "�и���");
		
		// LinkedList�� �߰��� �����͸� �߰��� �� �����ϴ�
		start = System.currentTimeMillis();
		System.out.println("LinkedList Insertion Test ����");
		for (int i = 0; i < 2000; i++) {
			linked_list.addAll(10,toAdd);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList End : " + (end - start) + "�и���");
		
		// �� �̻� �߰�/���� �Ͼ�� ���� �����͸� ArrayList�� ��ȯ�Ͽ� ����
		
		List<Integer> to_store = new ArrayList<>(linked_list);
		
		start = System.currentTimeMillis();
		System.out.println("ArrayList Reading Test....");
		for (int i : to_store) {
			int a = i + 10;
		}
		end = System.currentTimeMillis();
		System.out.println("Test End : " + (end - start) + "�и���");
		
		
		start = System.currentTimeMillis();
		System.out.println("LinkedList Reading Test....");
		for (int i : linked_list) {
			int a = i + 10;
		}
		end = System.currentTimeMillis();
		System.out.println("Test End : " + (end - start) + "�и���");
	}
}














