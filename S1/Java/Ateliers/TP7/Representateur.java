public class Representateur extends Vendeur{
	public Representateur(String Nom,String Prenom,int Age,String DateRec,double ChiffreAff){
		super(Nom,Prenom,Age,DateRec,ChiffreAff);
	}
	public double CalculSal(){	
		return super.CalculSal() + this.SalBase ; 
	}
}
		