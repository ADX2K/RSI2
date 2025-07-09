public class personne{
	private final String nom_prenom;
	private String adresse;
	private int contact;
	public personne(String nom,String add,int contact){
		this.nom_prenom=nom;
		this.adresse=add;
		this.contact=contact;
	}
	public String getNomPrenom(){
		return this.nom_prenom;
	}
	public String getAdresse(){
		return this.adresse;
	}
	public int getContact(){
		return this.contact;
	}
	public void setContact(int contact){
		this.contact=contact;
	}
	public void setAdresse(String adresse){
		this.adresse=adresse;
	}
	public String toString(){
		return "Nom et Prenom : "+this.nom_prenom+"\nAdresse : "+this.adresse+"\nContact : "+this.contact+"\n";
	}
}

