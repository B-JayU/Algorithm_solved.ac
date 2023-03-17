import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static class Person{
		int age;
		String name;
		
		Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		Person[] p = new Person[n];
		
		int age;
		String name;
		
		for (int i = 0; i <n; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			age = Integer.parseInt(st.nextToken());
			name = st.nextToken();
			p[i] = new Person(age, name);
		
		}
		
		Arrays.sort(p, new Comparator<Person>() {
				
				public int compare(Person p1, Person p2) {
					return p1.age - p2.age;
				}
		});
		
		for (int i = 0; i < n; i++) {
			System.out.println(p[i].age + " " + p[i].name);
		}
	}

}
