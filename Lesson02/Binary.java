import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String result = "";
		while(x > 0) {
			int i = x % 2;
			result = i + result;
			x = x / 2;
		}
		System.out.println(result);
	}
}