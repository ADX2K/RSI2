public class Enseignant{
	protected String Nom;
	protected int Heures;
	protected int hMin;
	protected final double PrixHeure=35;
	public Enseignant(String Nom,int Heures,int hMin){
		this.Nom=Nom;
		this.Heures=Heures;
		this.hMin=hMin;
	}
	public String getNom(){
		return this.Nom;
	}
	public int hComp(){
		return Heures-hMin;
	}
	public double retribution(){
		if(hComp()>0){
			return this.hComp()*this.PrixHeure;
		}
		return 0;
	}
	public String toString(){
		return "Nom: "+this.Nom+"\nHeures :"+this.Heures;
	}
}