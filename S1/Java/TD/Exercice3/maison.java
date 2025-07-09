public class maison extends BienImmobilier{
	private String rue;
	private int num_maison;
	private int nbPieces;
	public maison (int code, String ville, double surface,personne prioritaire, String rue, int num_maison, int nbPieces){
		super(code,ville,surface,true,prioritaire);
		this.rue=rue;
		this.num_maison=num_maison;
		this.nbPieces=nbPieces;
	}
	public String toString(){
		return super.toString() + "\nRue : "+this.rue+"\nNumero de la maison : "+this.num_maison+"\nNombre de pieces : "+this.nbPieces;
	}

}