import java.util.Scanner;
public class TestSwap {

	public static void main (String[] arg)  {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez x: ");
		int x = sc.nextInt();

		System.out.print("Entrez y: ");
		int y = sc.nextInt();

		System.out.println("Avant permutation: ");
		System.out.println("x : " + x);
		System.out.println("y : " + y);

		x = x * y;
		y = x / y;
		x = x / y;

		System.out.println("Après permutation: ");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
			}
}
