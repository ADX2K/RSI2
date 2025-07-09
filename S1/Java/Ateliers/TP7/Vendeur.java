public class Vendeur extends Employe{
	protected double ChiffreAff;
	final protected int SalBase=400;
	
	public Vendeur(String Nom,String Prenom,int Age,String DateRec,double ChiffreAff){
		super(Nom,Prenom,Age,DateRec);
		this.ChiffreAff=ChiffreAff;
	}
	public double CalculSal(){	
		return this.SalBase + this.ChiffreAff*0.2 ; 
	}
}
		