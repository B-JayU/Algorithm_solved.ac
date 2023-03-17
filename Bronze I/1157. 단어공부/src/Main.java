import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] alphabet = new int[26];
		
		for (int i = 0; i < 26; i++){
			alphabet[i] = 0;
		}
		
		int max = 0, max_cnt = 0, idx = 0;
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		str = str.toUpperCase();
		
		for (int i = 0; i < str.length(); i++) {
			alphabet[str.charAt(i)-'A']++;
			
			if (alphabet[str.charAt(i)-'A'] > max) {
				max = alphabet[str.charAt(i)-'A'];
				max_cnt = 1;
				idx = str.charAt(i)-'A';
				
			}else if(alphabet[str.charAt(i)-'A'] == max) {
				max_cnt++;
			}
		}
		
		if (max_cnt == 1)
			System.out.println((char)(idx + 'A'));
		else
			System.out.println("?");
		
		
	}

}
