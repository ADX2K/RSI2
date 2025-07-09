public class Magazin{
	private double dep=0;
	private double rev=0;
	private Primeur[] P;
	private Electromenager[] E;
	public Magazin(){
		P = new Primeur[20];
		E = new Electromenager[20];
	}
	public void affiche(){
		int i=0;
		while(i<P.length){
			if(P[i]!=null){
				P[i].affiche();
			}
			i++;
		}
		i=0;
		while(i<E.length){
			if(E[i]!=null){
				E[i].affiche();
			}
			i++;
		}
	}
	public double rendement(){
		int i=0;
		double r=0;
		while(i<P.length){
			if(P[i]!=null){
				P[i].rendement();
			}
			i++;
		}
		return r/(i+1);
	}
}