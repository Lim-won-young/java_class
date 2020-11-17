package quiz;

import java.util.HashSet;
import java.util.Random;

public class D02_LottoSet {
	
	
	// 1���� 45������ �ߺ����� ���� ���� 6���� �̷���� HashSet�� ����
	
	
	public static HashSet<Integer> lotto () {
		Random ran = new Random();
		HashSet<Integer> lottoN = new HashSet<>();
		
		while(lottoN.size() != 6) {
			lottoN.add(ran.nextInt(45)+1); 
		}
		return lottoN;
	}
	
	
	public static void main(String[] args) {
		
		HashSet<Integer> mylotto_n = lotto();
		System.out.println(mylotto_n);
		
	}
}
