import java.util.Scanner;

public class Taxi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int kmCost = 20;
		double cost = s * kmCost;
		if (cost >= 250) {
			cost = cost * 0.9;
		}
		System.out.println(cost);
	}
}