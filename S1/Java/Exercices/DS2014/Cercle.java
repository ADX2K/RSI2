public class Cercle{

	private double Rayon;
	private String Couleur;
	public Cercle(){
		this.Rayon=1.0;
		this.Couleur="rouge";
	}
	public Cercle(double Rayon){
		this.Rayon=Rayon;
		this.Couleur="rouge";
	}
	public Cercle(String Couleur){
		this.Rayon=1.0;
		this.Couleur=Couleur;
	}
	public Cercle(double Rayon,String Couleur){
		this.Rayon=Rayon;
		this.Couleur=Couleur;
	}
	public void getRayon(){
		System.out.println("Le rayon de cette cercle est : " + this.Rayon + " Cm");
	}
	public void getCouleur(){
		System.out.println("La couleur de cette cercle est : " + this.Couleur);
	}
	public void getAire(){
		double aire;
		aire = Math.PI * Math.pow(this.Rayon,2);
		System.out.println("L'aire de cette cercle est : " + aire + " Cm^2");
	}
	public static void main(String[] args){
		Cercle[] Cercle = {
			new Cercle(2.0,"Bleu"),
			new Cercle(3.0),
			new Cercle()
		};
		for(int i=0;i<3;i++){
			System.out.println("\n\nCercle C" + i + ":");
			Cercle[i].getRayon();
			Cercle[i].getCouleur();
			Cercle[i].getAire();
			
		}
	}

	
}