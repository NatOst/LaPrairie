public class RenverserTab {

  static int [] RenverseTableauxEntiers (int [] t, int n)
  {
      int [] rev;
      rev = new int [n];

      // Renverser le tableau
      for (int i=0; i<= n-1; i++)
          rev[i] = t[n-1-i];

      return rev;
  }

  public static void main (String[] arg)  {

  int[] tableauEntier2 = new int[10];
	int tableauEntier[] = {0,1,2,3,4,5,6,7,8,9};

  for(int i = 0; i < (tableauEntier.length); i++)
    System.out.println("Avant : La valeur du tableau à l'indice ["+i+"] est : " + tableauEntier[i]);

  tableauEntier2 = RenverseTableauxEntiers(tableauEntier, tableauEntier.length);

  System.out.println("***");

  for(int i = 0; i < tableauEntier2.length; i++)
    System.out.println("Après : La valeur du tableau à l'indice ["+i+"] est : " + tableauEntier2[i]);

  }


}
