// not solved

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[] init = {'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ','ㅎ' };
		char[] center = {'ㅏ', 'ㅐ','ㅑ', 'ㅒ', 'ㅓ', 'ㅔ', 'ㅕ', 'ㅖ', 'ㅗ', 'ㅘ','ㅙ', 'ㅚ', 'ㅛ', 'ㅜ', 'ㅝ', 'ㅞ', 'ㅟ', 'ㅠ', 'ㅡ', 'ㅢ', 'ㅣ'} ;
		char[] end = {' ', 'ㄱ', 'ㄲ','ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int n = N-1;
		
		//N-1 = (init) * 21*28 + (center) * 28 + (end);
		
		
		System.out.print(init[n/(21*17)]);
		n %= (21*17);
		
		System.out.print(center[n/17]);
		n %= 17;
		
		System.out.print(end[n]);
		
	}

}
