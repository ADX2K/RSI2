public class Article {
	protected double prixAchat;
	protected double prixVente;
	protected String nom;
	protected String fourni;
	
	public Article(double pa,double pv,String nom,String fourni){
		this.prixAchat=pa;
		this.prixVente=pv;
		this.nom=nom;
		this.fourni=fourni;
	}

	public double rendement(){
		try{
			return (prixVente-prixAchat)/prixAchat;
		}
		catch ( ArithmeticException E){
			System.out.println("Division par 0 impossible");
return(0);
		}
	}

	public void affiche(){
		System.out.println("Nom Fournisseur : "+this.fourni+"\nNom Produit : "+this.nom+"\nPrix Achat : "+this.prixAchat+"\nPrix Vente : "+this.prixVente+"\nRendement : "+this.rendement());
	}

	








}
	