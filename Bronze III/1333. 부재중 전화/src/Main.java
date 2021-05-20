import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		int cntSong = sc.nextInt();
		int timeSong = sc.nextInt();
		int frequency = sc.nextInt();
		
		boolean connected = false;
		int rest = 0, interval = 5;
		
		// 마지막 곡이 끝나기 전에 전화를 받을 수 있는가?
		for (int i = 1; i < cntSong; i++) {
			
			rest = 0;
			while(!connected && rest < interval) {
				if ((timeSong * i + rest) % frequency == 0) {
					connected = true;
					System.out.println(timeSong * i + rest);
					return;
				}
				
				rest++;
			}
		}
		
		int total = cntSong*(timeSong+5)-5;
		if (!connected) {
			for (int i = 0; i < frequency; i++) {
				if ((total + i)%frequency == 0) {
					System.out.println(total+i);
					break;
				}
			}
		}
	}

}
