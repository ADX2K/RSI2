public abstract class Employe{
	protected String Nom;
	protected String Prenom;
	protected int Age;
	protected String DateRec;
	
	public Employe(String Nom,String Prenom, int Age,String DateRec){
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.Age=Age;
		this.DateRec=DateRec;
	}
	public String getNom(){
		return this.Nom+" "+this.Prenom;	
	}
	public abstract double CalculSal();
}