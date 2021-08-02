/*
 * 2006. 바이러스
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class Main {

	static int n;
	static int[][] network;
	static int[] visited;
	static int vertex = 0;
	
	static void dfs(int idx) {
		for (int j = 1; j <=n; j++) {
			if (network[idx][j] == 1 && visited[j] != 1) {
				visited[j] = 1;
				vertex++;
				dfs(j);
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		n= Integer.parseInt(br.readLine());
		int lines = Integer.parseInt(br.readLine());
		network = new int[n+1][n+1];
		
		int comp1, comp2;
		for (int i = 0; i < lines; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			comp1 = Integer.parseInt(st.nextToken());
			comp2 = Integer.parseInt(st.nextToken());
		
			network[comp1][comp2] = 1;
			network[comp2][comp1] = 1;
		}
		
		visited = new int [n+1]; 
		
		visited[1] = 1;
		dfs(1);
		
		bw.write(vertex + "\n");
		bw.flush();
		bw.close();
	}

}
