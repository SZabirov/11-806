import java.util.Scanner;

public class Mult {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N:");
		int n = sc.nextInt();
		int result = 1;
		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			result = result * x;
		}
		System.out.println(result);
	}
}