import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> dice = new ArrayList<Integer>();
		int prize, max_prize = 0;
		
		int parties = sc.nextInt();
		
		for (int p = 0; p < parties; p++) {
			
			//prize = 0;
			for (int i = 0; i < 3; i++)
				dice.add(i, sc.nextInt());
			
			dice.sort(null);
			
			if (dice.get(0) == dice.get(2))
				prize = 10000 + dice.get(0)*1000;
			else {
				if(dice.get(0) == dice.get(1)) 
					prize = 1000 + dice.get(0)*100;
				else if(dice.get(1) == dice.get(2))
					prize = 1000 + dice.get(1)*100;
				else
					prize = dice.get(2)*100;
			}
			
			if (prize > max_prize)
				max_prize = prize;
			
			dice.clear();
		}
		
		System.out.println(max_prize);	
	}

}
