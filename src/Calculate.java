
public class Calculate {
	
	public static void main(String[] args) {
		
		int a = 1;
		char ch = 'M';
		boolean complete = false;
		String str = "yes";
		String command = "11q11111";
		
		
		System.out.println("1�� : " + (a % 2 != 0));
		System.out.println("2�� : " + ((ch < 'a' || ch > 'z')&&(ch < 'A' || ch > 'Z')));
		System.out.println("3�� : " + !(complete));
		System.out.println("4�� : " + str.equals("yes"));
		System.out.println("5�� : " + (command.length() == 8));
		System.out.println("6�� : " + (command.charAt(2) == 'q' || command.charAt(2) == 'Q'));
		
		
	}
}
