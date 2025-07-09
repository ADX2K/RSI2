public class Compte{
	int NumCompte;
	String NomProprietaire;
	double Solde;
	public Compte(int Num,String Nom,double Solde){
		this.NumCompte=Num;
		this.NomProprietaire=Nom;
		this.Solde=Solde;
	}
	
	public void Retirer(double Mantant){
		this.Solde-=Mantant;
		System.out.println("Vous avez retiré "+Mantant+" Dinars.\n"); 
	}
	public void Deposer(double Mantant){
		this.Solde+=Mantant;
		System.out.println("Vous avez deposé "+Mantant+" Dinars.\n"); 	
	}
	public void Consulter(){
		System.out.println("Numero de compte : "+this.NumCompte+"\nNom du proprietaire : "+this.NomProprietaire+"\nSolde : "+this.Solde+"\n\n");
	}	
	public static void main(String[] args){
		Compte A = new Compte(4576001,"Toumi Youssef",850.175);
		A.Consulter();
		A.Deposer(100);
		A.Consulter();
		A.Retirer(2000);
		A.Consulter();
	}
		


}