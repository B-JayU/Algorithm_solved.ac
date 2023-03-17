import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;;

public class Main {

	static int size;
	static int[][] square;
	static int blue = 0;
	static int white = 0;
	
	public static void colorPaper(int hStart, int hEnd, int vStart, int vEnd) {
		
		int standard = square[vStart][hStart];
		boolean diff = false;
		
		// size is one
		if (hStart == hEnd-1) {
			if (standard == 1)
				blue++;
			else
				white++;
			return;
		}
		
		
		for (int i = vStart; i < vEnd; i++) {
			
			for (int j = hStart; j < hEnd; j++) {
				if (standard != square[i][j]) 
					diff = true;
				
				
				if (diff == true) {
					int h_mid = (hStart + hEnd) /2;
					int v_mid = (vStart + vEnd) /2;
					
					
					colorPaper(hStart, h_mid, vStart, v_mid);
					colorPaper(h_mid, hEnd, vStart, v_mid);
					colorPaper(hStart, h_mid, v_mid, vEnd);
					colorPaper(h_mid, hEnd, v_mid, vEnd);
					
					break;
				}	
			}
			if (diff == true)
				break;
		}
		
		if (diff == false) {
			if (standard == 1)
				blue++;
			else
				white++;
		}
		
		
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		size = Integer.parseInt(br.readLine());
		square = new int[size][size];
		
		// 
		for (int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for (int j = 0; j < size; j++)
				square[i][j] = Integer.parseInt(st.nextToken());
		}
		
		colorPaper(0, size, 0, size);
		bw.write(white + "\n" + blue + "\n");
		
		bw.flush();
		bw.close();
	}

}
