import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> myDict = new ArrayList<String>();
		int cnt_word;
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			String str = sc.next();
			cnt_word = myDict.size();
			int j;
			
			for (j = 0; j < cnt_word; j++) {
					
					if (myDict.get(j).length() < str.length()) continue;
					
					else if (myDict.get(j).length() > str.length()) {
						myDict.add(j, str);
						break;
					} else {
						if (str.compareTo(myDict.get(j)) > 0) continue;
						else if (str.compareTo(myDict.get(j)) < 0) {
							myDict.add(j,str);
							break;
						}		
						else 
							break;
					}	
			}
			
			if (j == cnt_word)
				myDict.add(j,str);
		
		}
		
		for (int i = 0; i < myDict.size(); i++) 
			System.out.println(myDict.get(i));
	}

}

