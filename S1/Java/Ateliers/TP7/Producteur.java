public class Producteur extends Employe{
	private int NbProduit;
	public Producteur(String Nom,String Prenom,int Age,String DateRec,int NbProduit){
		super(Nom,Prenom,Age,DateRec);
		this.NbProduit=NbProduit;
	}
	public double CalculSal(){	
		return this.NbProduit * 5 ; 
	}
}
		