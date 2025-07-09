public class Employe {
	private String Nom;
	private String Prenom;
 	private int AnneeEmbauche;
	private double Salaire;
	private double ChiffreAffaire;

	public Employe(String Nom,String Prenom,int AnneeEmbauche ,double Salaire ,double ChiffreAffaire){
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.AnneeEmbauche=AnneeEmbauche;
		this.Salaire=Salaire;
		this.ChiffreAffaire=ChiffreAffaire;
		
	}
	public String toString(){
		 return ("Nom: " + this.Nom + ", Prénom: " + this.Prenom + ", Année d'embauche: " + this.AnneeEmbauche + ", Salaire de base: " + this.Salaire + "Dt, Chiffre d'affaire: " + this.ChiffreAffaire + "Dt");
	}
	public void AfficheDetails(){
		System.out.println(this.toString());
	}
	public void AfficheSalaireBase(){
		System.out.println("Le salaire de base de cet employe est :" + this.Salaire + "Dt");
	}
	public void SetSalaireBase(double Salaire){
		this.Salaire=Salaire;	
	}
	public boolean AccorderPrime(){
		return (this.ChiffreAffaire > 5000);		
	}
	public double CalculPrime(){
		if(AccorderPrime()){
			return (0.02*ChiffreAffaire);	
		}
		return 0;
	}
	public double CalculSalaireTotal(){
		if(AccorderPrime()){
			return (this.Salaire + CalculPrime());
		}
		return (this.Salaire);
	}
	public static void main(String[] args){
		Employe E1 = new Employe("Mohamed Adel","Aiouaz",2013,2640.500,8000);
		E1.AfficheDetails();
		E1.AfficheSalaireBase();
		System.out.println("Le salaire totale de cet Employe est :" + E1.CalculSalaireTotal() + "Dt");
		E1.SetSalaireBase(2800.400);
		E1.AfficheSalaireBase();
		System.out.println("Le salaire totale de cet Employe est :" + E1.CalculSalaireTotal() + "Dt");

		
	}
 
}
