public class Conte extends livre{
	private String PublicCible;
	public Conte (String titre, String auteur, String ISBN, String PublicCible){
		super(titre,auteur,ISBN);
		this.PublicCible=PublicCible;
	}
	public String getPublicCible(){
		return this.PublicCible;
	}
	public boolean Equals (Conte C){
		return this.PublicCible == C.getPublicCible();
	}
	public String toString(){
		return super.toString() +"\nCible Publique : "+this.PublicCible;
	}
}