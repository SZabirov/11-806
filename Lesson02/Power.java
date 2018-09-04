import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n:");
		int n = sc.nextInt();
		System.out.println("k:");
		int k = sc.nextInt();
		int result = 1;
		for(int i = 0; i < k; i++){
			result = result * n;
		}
		System.out.println(result);
	}
}