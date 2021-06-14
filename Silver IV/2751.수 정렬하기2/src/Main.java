import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int[] number = new int[n];
		
		for (int i = 0; i <n; i++) {
			number[i] = sc.nextInt();
		}
		
		Arrays.sort(number);
		
		for (int i = 0; i < n; i++)
			sb.append(number[i] + "\n");
		
		System.out.println(sb.toString());
	}

}

