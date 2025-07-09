public class Compte{
	private int numCompte;
	private String nom;
	private String prenom;
	private double solde;
	private double plafond;
	
	public Compte(int numCompte, String nom, String prenom, double solde){
		this.numCompte=numCompte;
		this.nom=nom;
		this.prenom=prenom;
		this.solde=solde;
		this.plafond = 0;
	}
	public Compte(int numCompte, String nom, String prenom, double solde, double plafond){
		this.numCompte=numCompte;
		this.nom=nom;
		this.prenom=prenom;
		this.solde=solde;
		this.plafond=plafond;
	}
	public String getNom(){
		return this.nom;
	}	
	public String getPrenom(){
		return this.prenom;	
	}
	public double getSolde(){
		return this.solde;
	}
	public double getPlafond(){
		return this.plafond;
	}
	public void setNom(String nom){
		this.nom=nom;
	}
	public void setPrenom(String prenom){
		this.prenom=prenom;
	}
	public void setPlafond(double plafond){
		this.plafond=plafond;
	}
	public String toString(){
		return ("Numero De Compte : " + this.numCompte + "\nNom Proprietaire : " + this.nom +"\nPrenom Proprietaire : "+this.prenom+"\nSolde : "+this.solde+"\nPlafond : "+this.plafond) ;
	}
	public double retirer(double mantant){
		if (this.solde >= mantant){
			this.solde-=mantant;
		}
		else if ((this.solde + this.plafond) >= mantant){
			mantant-=this.solde;
			this.solde=0;
			plafond-=mantant;
		}
		return mantant;
	}
	public void deposer(double mantant){
		this.solde+=mantant;
	}
		
}