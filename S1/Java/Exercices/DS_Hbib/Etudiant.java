package Etudiant;
class Etudiant{
	private String Nom;
	public Etudiant(String Nom){
		this.Nom = Nom;
	}
	public void Afficher(){	
		System.out.println("Le nom de l'etudiant est : "+this.Nom);
	}
	public void Modifier(String Nom){
		System.out.println("Le nom de l'etudiant est modifier de " +this.Nom+ " vers "+Nom);
		this.Nom = Nom;
	}	
	public void Travailler(){
		System.out.println(this.Nom+" se met au travail !");
	}
	public void SeReposer(){
		System.out.println(this.Nom+" se repose.");
	}
	
}
class TestEtudiant{
	public static void main(String[] args){
		Etudiant E1= new Etudiant("Mohamed Adel Aiouaz");
		E1.Travailler();
		E1.SeReposer();
	}


}