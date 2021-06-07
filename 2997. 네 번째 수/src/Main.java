import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> seq = new ArrayList<Integer>();
		
		int fourth=0;
		
		// 크기 순으로 정렬
		for (int i = 0; i <3; i++) {
			seq.add(sc.nextInt());
		}
		seq.sort(null);
		
		int diff_front = seq.get(1)-seq.get(0);
		int diff_rear = seq.get(2)-seq.get(1);
		
		if (diff_front == diff_rear)
			fourth = seq.get(2) + diff_front;
		else if (diff_front > diff_rear)
			fourth = (seq.get(0) + seq.get(1))/2;
		else if(diff_front < diff_rear)
			fourth = (seq.get(1) + seq.get(2)) /2;
		
		System.out.println(fourth);
	}

}
