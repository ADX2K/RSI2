class TestCandidat{
	public static void main(String[] atgs){
		Candidat C ;
		C = new Candidat("Mekni","Aziz",55,1.7);
		System.out.println(C.affiche());
		C = new Candidat("Lazhar","Anis",95,1.75);
		System.out.println(C.affiche());
	}
}