import java.util.*;
class Employe{
	private String Nom;
	private String Prenom;
	private int AnneeEmbauche;
	private double Salaire;
	private double ChiffreAffaire;
	private Scanner input = new Scanner(System.in);
	public Employe(String Nom,String Prenom,int AnneeEmbauche,double Salaire,double ChiffreAffaire){
		this.Nom=Nom;	
		this.Prenom=Prenom;
		this.AnneeEmbauche=AnneeEmbauche;
		this.Salaire=Salaire;
		this.ChiffreAffaire=ChiffreAffaire;
	}
	public String toString(){
		return "Nom : "+this.Nom+"\nPrenom : "+this.Prenom+"\nAnnee d'embauche : "+this.AnneeEmbauche+"\nSalaire : "+this.Salaire+"\nChiffre d'affaire : "+this.ChiffreAffaire;
	}
	public void affiche(){
		System.out.println("Nom : "+this.Nom+"\nPrenom : "+this.Prenom+"\nAnnee d'embauche : "+this.AnneeEmbauche+"\nSalaire de base : "+this.Salaire+"\nChiffre d'affaire : "+this.ChiffreAffaire);
	}
	public double getSalaire(){
		return this.Salaire;
	}
	public void setSalaire(){
		this.Salaire=input.nextDouble();
	}
	public boolean accorderPrime(){
		return this.ChiffreAffaire >= 5000;
	}
	public double calculPrime(){
		return this.ChiffreAffaire*0.02;
	}
	public double calculSalaire(){
		if(this.accorderPrime()){
			return this.Salaire+this.calculPrime();
		}
		else{
			return this.Salaire;
		}
	}
		
}
