public class Abonne{
	private final String nom_prenom;
	private String adresse;
	private int contact;
	private livre[] livres;
	
	public Abonne(String nom,String add,int contact){
		this.nom_prenom=nom;
		this.adresse=add;
		this.contact=contact;
		livres = new livre[10];
	}
	public void EmprunterLivre(livre L){
		int i=0;
		while (livres[i]!=null && i<livres.length){
			i++;
		}
		if (i==livres.length){
			System.out.println("Tableau de livres Saturé");
		}
		else{
			L.emprunt();
			livres[i]=L;
		}
	}
	public void RetournerLivre(livre L){
		int i=0;
		while (livres[i]!=L && i<livres.length){
			i++;
		}
		if (i==livres.length){
			System.out.println("Ce livre n'existe pas dans la table de livres emprunté");
		}
		else{
			L.retourner();
			livres[i]=null;
		}
	}	
	public String toString(){
		String ch = "Nom et Prenom : "+this.nom_prenom+"\nAdresse : "+this.adresse+"\nContact : "+this.contact+"\n";
		for (livre l : livres) {
			if (l != null){
				ch+= "\n"+l.toString()+"\n";
			}
		}
		return ch;
	}
}
