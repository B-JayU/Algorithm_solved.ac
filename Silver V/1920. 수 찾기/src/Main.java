import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static boolean search(int[] a, int left, int right, int sNum) {
	
		boolean r = false;
		int mid = (left + right) /2;
		
		if (left > right)
			return false;
		
		if (a[mid] == sNum)
			r = true;
		
		else if (a[mid] > sNum)
			r = search(a, left, mid-1, sNum);
		else if (a[mid] < sNum)
			r = search(a, mid+1, right, sNum);
		
		return r;
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		//System.out.println(n);
		
		int[] ary = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < n; i++) 
			ary[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(ary);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int searchNum;
		boolean result = false;
		
		for (int i = 0; i <m; i++) {
			searchNum = Integer.parseInt(st.nextToken());
			
			result = search(ary, 0,n-1, searchNum);
			if (result == true)
				System.out.println("1");
			else
				System.out.println("0");
		}
	}

}
