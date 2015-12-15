import java.util.Scanner;
import  java.lang.Math;
public class Fourchette {

	public static void main (String[] arg)  {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez x: ");
		int x = sc.nextInt();

		System.out.print("Entrez y: ");
		int y = sc.nextInt();

    System.out.print("Entrez z: ");
		int z = sc.nextInt();


		System.out.println("x est il compris entre min(y,z) et max(y,z) ? ");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
    System.out.println("y : " + z);

    System.out.println(" le plus petit = " + Math.min(y, z));

    System.out.println(" le plus grand = " + Math.max(y, z));

    if (Math.min(y, z) < x && x < Math.max(y, z))
      System.out.println( " réponse x est dans l'intervalle");
    else
      System.out.println( " réponse x n'est pas dans l'intervalle");
			}
}
