public abstract class BienImmobilier implements louable{
	protected int code;
	protected String ville;
	protected double surface;
	protected boolean libre;
	protected personne prioritaire;
	public BienImmobilier (int code, String ville, double surface, boolean libre, personne prioritaire){
		this.code=code;
		this.ville=ville;
		this.surface=surface;
		this.libre=libre;
		this.prioritaire=prioritaire;
	}
	public BienImmobilier (int code, String ville, double surface,personne prioritaire){
		this(code,ville,surface,true,prioritaire);
	}
	public String toString(){
		String ch ="Code : "+this.code+"\nVille : "+this.ville+"\nSurface : "+this.surface;
		if(this.libre){
			ch+="\nlibrenibilité : Oui";
		}
		else{
			ch+="\nlibrenibilité : Non";
		}
		ch+="\nPrioritaire : \n"+this.prioritaire;
		return ch;
	}
	public void louer() throws ImmobilierReserveException{
		if (!this.libre){
			throw new ImmobilierReserveException();
		}
		else{
			this.libre=false;
		}
	}
	public void liberer(){
		this.libre=true;
	}

}