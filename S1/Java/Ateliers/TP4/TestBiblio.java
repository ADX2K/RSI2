import java.util.*;
class TestBiblio{
	private static int Menu(int i){
		Scanner choix = new Scanner(System.in);
		if (i==1){
			System.out.println("\nManupuler Votre Bibliotheque :\n0/Quiter\n1/Ajouter un document\n2/Afficher les livres disponibles\n3/Afficher un livre dans une case specifique\n");
		}
		else{
			System.out.println("1/Oui\n2/Non\n");
		}
		return choix.nextInt();
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String Titre;
		Document D;
		int Num;
		Biblio B = new Biblio();
		while(true){
			switch(Menu(1)){
				case 0 : 
					return ; 
				case 1 :
					System.out.println("Saisie le nom du livre\n");
					
					Titre = input.next();
					System.out.println("Voulez-vous saisire un numero de livre personalisé ?\n");
					switch(Menu(2)){
						case 1 : 
							System.out.println("Saisie le numero du livre");
							Num = input.nextInt();
							D = new Document(Titre,Num);
							B.addDoc(D);
							break;
						case 2 :
							D = new Document(Titre);
							B.addDoc(D);
							break;
						default : System.out.println("\nSaisi un choix correcte");
						
					}
					break;
				case 2 :
					System.out.println(B.toString());		
					break;
				case 3 :
					System.out.println("Saisie le numero de case");
					D=B.getDoc(input.nextInt());
					if(D==null){
						System.out.println("Case Vide");
					}
					else{
						System.out.println(D);
					}
					break;
				default : System.out.println("\nSaisi un choix correcte");break;
			}
		}
	}
	
}