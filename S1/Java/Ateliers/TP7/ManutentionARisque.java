public class ManutentionARisque extends Producteur implements ARisque{
	public ManutentionARisque(String Nom,String Prenom,int Age,String DateRec,int NbHeures){
		super(Nom,Prenom,Age,DateRec,NbHeures);
	}
	public double CalculSal(){
		return super.CalculSal() + PrimeRisque;
	}
} 

	