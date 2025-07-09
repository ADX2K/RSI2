public class Intervenants extends Enseignant{
	public Intervenants(String Nom,int Heures){
		super(Nom,Heures,0);
	}
	public String toString(){		
		return "Type Enseignant: Intervenant Extérieur\n"+super.toString() + "\nRétribution :"+retribution();
	}

}
	