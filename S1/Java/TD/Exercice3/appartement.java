public class appartement extends BienImmobilier{
	private String residence;
	private int etage;
	private int num_app;
	public appartement (int code, String ville, double surface,personne prioritaire, String residence, int etage, int num_app){
		super(code,ville,surface,true,prioritaire);
		this.residence=residence;
		this.etage=etage;
		this.num_app=num_app;
	}
	public String toString(){
		return super.toString() + "\nResidence : "+this.residence+"\nEtage : "+this.etage+"\nNombre d'appartement : "+this.num_app;
	}

}