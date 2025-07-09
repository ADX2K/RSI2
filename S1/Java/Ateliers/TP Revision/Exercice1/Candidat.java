class Candidat {
	private String Nom;
	private String Prenom;
	private double Poids;
	private double Taille;
	public Candidat(String Nom,String Prenom,double Poids,double Taille){
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.Poids=Poids;
		this.Taille=Taille;
	}
	public double calculMasseCorp(){
		return (this.Poids/(this.Taille*this.Taille));
	}
	public String estObese(){
		if(this.calculMasseCorp()>= 16 && this.calculMasseCorp()<=25){
			return "Candidat Normal";
		}
		else if(this.calculMasseCorp()<16){
			return "Candidat Mince";
		}
		else{
			return "Candidat Obése";
		}
	}	
	public String affiche(){
		return "Le sujet " +this.Nom+" "+this.Prenom+" pése "+this.Poids+"KG et mesure "+this.Taille+"\nSa masse corporelle est egale a "+this.calculMasseCorp()+"\nC'est un "+this.estObese();
	}
}
	