public class Enseignants2Fac extends Enseignant{
	public Enseignants2Fac(String Nom,int Heures){
		super(Nom,Heures,192);
	}
	public String toString(){		
		return "Type Enseignant: Enseignants De La Fac\n"+super.toString() + "\nHeures Complementaires : "+this.hComp()+"\nRétribution :"+retribution();
	}
}