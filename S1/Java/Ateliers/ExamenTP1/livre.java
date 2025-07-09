public abstract class livre implements Etatlivre{
	protected String titre;
	protected String auteur;
	protected String ISBN;
	protected boolean dispo;
	protected int nbEmprunt;
	
	public livre (String titre, String auteur, String ISBN, boolean dispo){
		this.titre=titre;
		this.auteur=auteur;
		this.ISBN=ISBN;
		this.dispo=dispo;
		this.nbEmprunt=0;
	}
	public livre (String titre, String auteur, String ISBN){
		this(titre,auteur,ISBN,true);
	}
	public boolean emprunt(){
		if (this.dispo){
			this.dispo=false;
			this.nbEmprunt++;
			return true;
		}
		else{
			return false;
		}
	}
	public void retourner(){
		if (!this.dispo){
			this.dispo=true;
		}
		else{
			System.out.println("Livre deja disponible");
		}
	}
	public String toString(){
		String ch ="Titre : "+this.titre+"\nAuteur : "+this.auteur+"\nISBN : "+this.ISBN;
		if(this.dispo){
			ch+="\nDisponibilité : Oui";
		}
		else{
			ch+="\nDisponibilité : Non";
		}
		return ch;	
	}
	public void afficherEtatLivre(){
		if (this.nbEmprunt >= 0 && nbEmprunt <=5){
			System.out.println("Le livre est neuf avec "+this.nbEmprunt+" empruntes");
		}
		else if (this.nbEmprunt >= 6 && nbEmprunt <=15){
			System.out.println("Le livre est bien conserve avec "+this.nbEmprunt+" empruntes");
		}
		else if (this.nbEmprunt >= 16 && nbEmprunt <=30){
			System.out.println("Le livre est usé avec "+this.nbEmprunt+" empruntes");
		}
		else {
			System.out.println("Le livre est trés usé avec "+this.nbEmprunt+" empruntes");
		}
		
	}
}