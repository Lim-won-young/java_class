import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {
	
	// # 정규표현식 (Regular Expression)
	//	- 문자열의 패턴을 표현하는 표현식
	//	- 해당 패턴과 일치하는 문자열을 검색할 수 있다
	
	// # Pattern 클래스
	//	- 정규표현식을 다루는 클래스 
	
	// # Matcher 클래스 
	//	- 패턴을 이용하여 대상 문자열을 검색할 때 사용하는 클래스
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지 정의한다
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		
		// []내부에 정의할 수 있는 것들
		// 1. abc	: abc만 허용
		// 2. ^abc	: abc를 제와한 모두를 허용
		// 3. a-z	: a부터 z까지 허용
		// 4. &&	: 교집합
		System.out.println(Pattern.matches("s[^1-9]eep", "s1eep"));
		System.out.println(Pattern.matches("s[a-zA-Z]eep", "saeep"));
		System.out.println(Pattern.matches("s[aeiou]eep", "saeep"));
		System.out.println(Pattern.matches("s[a-dm-z]eep", "saeep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "seeep"));
		
		// # 여러 문자를 간단하게 표현하는 것들
		// 1. .	: 해당 자리에 모든 문자를 허용
		// 2. \d: 해당 자리에 숫자들을 허용
		// 3. \D: 해당 자리에 숫자를 제외한 모든것을 허용
		// 4. \s: 해당 자리에 공백을 혀용[\t\n\r.. 등의 모든 공백들]
		// 5. \S: 해당 자리에 공백을 제외한 모든 것을 허용
		// 6. \w: 일반적인 문자들을 허용 [a-zA-Z_0-9]
		// 7. \W: 일반적인 문자들을 제외한 모든것을 허용
		System.out.println(Pattern.matches("s.eep", "s1eep"));
		System.out.println(Pattern.matches("s\\deep", "s1eep"));
		System.out.println(Pattern.matches("s\\Deep", "s1eep"));
		System.out.println(Pattern.matches("s\\seep", "s eep"));
		System.out.println(Pattern.matches("s\\Seep", "s eep"));
		System.out.println(Pattern.matches("..[.]..", "ab.de"));
		
		// # 해당 패턴이 적용될 문자의 개수를 정의하는 방법		- ※ 공백이 없어야함
		//	1. Ex{n}	: 앞에 있는 패턴이 n글자 일치해야 한다
		//	2. Ex{n,m}	: 앞에 있는 패턴이 최소 n글자부터 최대 m글자 일치해야 한다
		//	3. Ex{n,}	: 앞에 있는 패턴이 최소 n글자 이상 일치해야한다
		// 	4. Ex? 		: 한번 혹은 없어야 한다
		//	5. Ex+		: 최소 한번 이상 존재 해야한다
		//	6. Ex*		: 0번 혹은 여러번
		System.out.println(Pattern.matches("....[\\d]{4,}", "abfd12341234"));
		System.out.println("유효한 아이디 : " + Pattern.matches("[\\w가-힣]{2,12}", "IlIllll1l1l1"));
		System.out.println(Pattern.matches("[@]?.*", "@abc"));
		
		String email = "abc@gunivac.kr";
		
		System.out.println("이메일 패턴 : " + Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+", email));
		
		
		// # Pattern.matches(regex, str)
		//	- 전달한 문자열이 정규표현식과 일치하면 true 반환
		
		// # Pattern.compile(regex)
		//	- 전달한 정규표현식을 이용해 생성한 인스턴스를 반환한다
		
		Pattern split_regex = Pattern.compile("/");
		
		
		// # 생성된 Pattern 인스턴스로 split하기
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		// # 생성된 Pattern 인스턴스로 matcher 생성하기
		
		// # java.util.regex.Matcher
		//	- 문자열을 처음부터 끝까지 검사하면서 정규표현식과 일치하는 인덱스를 찾은 결과
		// split_regex.matcher("apple/banana/orange/kiwi");
		
		Pattern fruit_regex = Pattern.compile("[a-zA-Z][^/]+");
		
		Matcher matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		
		// find : 정규 표현식을 통해 찾은 것이 있으면 true
		while(matcher.find()) {
			System.out.println("찾은 것 : " + matcher.group());
			System.out.println(matcher.start() + "to" + matcher.end());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
