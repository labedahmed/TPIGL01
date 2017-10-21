
package igl;


public class VectorHelper {
	
	 public int [] VectorH;
		
		 public  void TriaBulle(int tab[]) {
				int longueur = tab.length;
				int tampon = 0;
				boolean permut;
		 
				do {
					permut = false;
					for (int i = 0; i < longueur - 1; i++) {
						if (tab[i] > tab[i + 1]) {
							tampon = tab[i];
							tab[i] = tab[i + 1];
							tab[i + 1] = tampon;
							permut = true;
						}
					}
				} while (permut);
				VectorH=tab;
			}

}
