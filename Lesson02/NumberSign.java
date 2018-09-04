import java.util.Scanner;

public class Mult {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x > 0) {
			System.out.println("Positive"):
		} else {
			if (x == 0) {
				System.out.println("Is zero");
			} else {
				System.out.println("Negative");
			}
		}
	}
}