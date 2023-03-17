import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt_total = Integer.parseInt(br.readLine());
		int num, sum = 0;
		ArrayList<Integer> ary = new ArrayList<Integer>();
		
		for (int i = 0; i < cnt_total; i++) {
			num = Integer.parseInt(br.readLine());
			
			if (num != 0)
				ary.add(num);
			else
				ary.remove(ary.size()-1);
		}
		
		for (int i = 0; i < ary.size(); i++)
			sum += ary.get(i);
		
		System.out.println(sum);
	}

}
