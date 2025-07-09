public class Manutention extends Employe{
	private int NbHeures;
	public Manutention(String Nom,String Prenom,int Age,String DateRec,int NbHeures){
		super(Nom,Prenom,Age,DateRec);
		this.NbHeures=NbHeures;
	}
	public double CalculSal(){	
		return this.NbHeures * 5 ; 
	}
}
		