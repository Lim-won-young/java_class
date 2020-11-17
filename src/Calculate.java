
public class Calculate {
	
	public static void main(String[] args) {
		
		int a = 1;
		char ch = 'M';
		boolean complete = false;
		String str = "yes";
		String command = "11q11111";
		
		
		System.out.println("1번 : " + (a % 2 != 0));
		System.out.println("2번 : " + ((ch < 'a' || ch > 'z')&&(ch < 'A' || ch > 'Z')));
		System.out.println("3번 : " + !(complete));
		System.out.println("4번 : " + str.equals("yes"));
		System.out.println("5번 : " + (command.length() == 8));
		System.out.println("6번 : " + (command.charAt(2) == 'q' || command.charAt(2) == 'Q'));
		
		
	}
}
