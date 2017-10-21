
package tpigl01;

public class VectorHelper {
    // la premiere méthode
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
                 //2éme méthode
     public int[] somme(int [] tab1,int[] tab2){
		 if(tab1.length != tab2.length)
		       throw new IllegalArgumentException("les tailles des deux tableaux sont différente"); 
		 int[] tab3=new int[tab1.length];
		 for(int i=0;i<tab3.length;i++)
	          tab3[i]=tab1[i]+tab2[i];
		 return tab3;
	 }
                 //la 3éme méthode
     public void invTab(int tableau[])
	 {
	         int i,temp = 0,taille=tableau.length;
	         for (i = 0 ; i <taille/2; i++)
	         {
	                 temp=tableau[i];
	                 tableau[i] = tableau[taille-i-1];
	                 tableau[taille-i-1]=temp;
	         }
	         VectorH=tableau;
	 }
      public int [] minmax(int []VectorH) {
	int [] resulte=new int[2];
	resulte[0]=VectorH[0];
	resulte[1]=VectorH[0];
	 for (int i:VectorH)
       {
		 if (i>resulte[1]) resulte[1] = i;
		 if (i<resulte[0]) resulte[0] = i;
	   }
	 return resulte;
  }
       public int [] puissance(int [] VectorH,int x){
		 if (x==0){
			 for( int i=0;i<VectorH.length;i++)
				 VectorH[i]=1;
		return VectorH;
		 }
		 else
		 if( x==1)return VectorH;
		 else
		 {
			 int[]Vectorsup=new int[VectorH.length];
			 for(int i=0;i<VectorH.length;i++)
			        Vectorsup[i]=VectorH[i];	
			        
			 for(int index=1;index<x;index++)
			 {			 
				 for(int i=0;i<VectorH.length;i++)
				 Vectorsup[i]*=VectorH[i];
			 } 
			 VectorH=Vectorsup;
			 return VectorH;
		 }

}
    
}
