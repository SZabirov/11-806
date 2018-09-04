import java.util.Scanner;

public class Backwards {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print number:");
		int x = sc.nextInt();
		//x = abc
		int c = x % 10;//получили последнюю цифру
		x = x / 10;//удалили посл. цифру
		int b = x % 10;
		int a = x / 10;
		int result = c * 100 + b * 10 + a;
		System.out.print(result);		
	}
}