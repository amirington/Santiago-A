import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int runs = sc.nextInt();
		
		for (int i=0; i<runs; i++){
			long s = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			
			long num = s/c;
			long mod = (num/a)*b;
			
			System.out.println(num+mod);
		}
	}

}
