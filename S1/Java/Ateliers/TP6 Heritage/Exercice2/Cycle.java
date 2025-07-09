public class Cycle extends Enseignant{
	public Cycle(String Nom,int Heures){
		super(Nom,Heures,0);
	}
	public int hComp(){
		if(this.Heures>96){
			return 96;
		}
		return this.Heures;
	}
	public String toString(){		
		return "Type Enseignant: Troisieme Cycle\n"+super.toString() + "\nHeures Complementaires : "+this.hComp()+"\nRétribution :"+retribution();
	}
}