public class Bibliotheque {
	public static void main(String[] args){
		livre R1 = new Roman("Les Miserables","Victor Hugo","978-1234","Historique");
		livre R2 = new Roman("1984","George Orwell","978-0451","Dystopie");
		livre C1 = new Conte("Le Petit Prince","Antonie de Saint-Exupery","978-1238","Enfants");
		livre C2 = new Conte("La Belle Au Bois Dormant","Charles Perrault","978-1122","Enfants");
		Abonne A1 = new Abonne("John Doe","123 rue Principale",123456789);
		Abonne A2 = new Abonne("Jane Smith","456 rue Secondaire",987654321);

		A1.EmprunterLivre(R1);
		A2.EmprunterLivre(C2);
		A1.EmprunterLivre(C1);
		System.out.println("Empruntes : \n");
		System.out.println(A1);
		System.out.println(A2);
		A1.RetournerLivre(R1);
		A2.RetournerLivre(C2);
		System.out.println("\n\n\nRetour : \n");
		System.out.println(A1);
		System.out.println(A2);
		
		System.out.println(((Roman)R1).Equals((Roman)R2));
		System.out.println(((Conte)C1).Equals((Conte)C2));
		R1.afficherEtatLivre();
	}
}