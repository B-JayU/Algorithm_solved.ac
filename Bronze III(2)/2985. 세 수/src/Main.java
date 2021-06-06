import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		
		if (value1+value2==value3)
			System.out.println(value1+"+"+value2+"="+value3);
		else if (value1-value2==value3)
			System.out.println(value1+"-"+value2+"="+value3);
		else if (value1*value2==value3)
			System.out.println(value1+"*"+value2+"="+value3);
		else if (value1/value2==value3)
			System.out.println(value1+"/"+value2+"="+value3);
		else if (value2+value3==value1)
			System.out.println(value1+"+"+value2+"="+value3);
		else if (value2-value3==value1)
			System.out.println(value1+"-"+value2+"="+value3);
		else if (value2*value3==value1)
			System.out.println(value1+"*"+value2+"="+value3);
		else if (value2/value3==value1)
			System.out.println(value1+"/"+value2+"="+value3);
	}

}
