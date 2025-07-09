public class ProducteurARisque extends Producteur implements ARisque{
	public ProducteurARisque(String Nom,String Prenom,int Age,String DateRec,int NbProduit){
		super(Nom,Prenom,Age,DateRec,NbProduit);
	}
	public double CalculSal(){
		return super.CalculSal() + PrimeRisque;
	}
} 

	