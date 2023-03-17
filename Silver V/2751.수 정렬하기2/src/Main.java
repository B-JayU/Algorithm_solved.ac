import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> seq = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i <n; i++) {
			seq.add(sc.nextInt());
		}
		
		seq.sort(null);
		
		Iterator<Integer> iterseq = seq.iterator();
		while(iterseq.hasNext()) {
			System.out.println(iterseq.next());
		}
		
	}

}
