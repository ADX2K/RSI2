import java.util.*;
public class TestCompte{
	private static int menu(int i){
		System.out.println("\nManupuler un compte :\n0/Quiter");
		if (i==2){
			System.out.println("1/Oui\n2/Nom");
		}
		else if(i==1){
			System.out.println("1/Afficher le nom complet du proprietaire\n2/Afficher le solde du compte\n3/Modifier le nom complet du compte\n4/Afficher tout les details du compte\n5/Retirer\n6/Deposer\n7/Modifier le plafond");
		}
		else{
			System.out.println("1/Enregistrer un compte");
		}
		Scanner choix = new Scanner(System.in);
		return choix.nextInt();
	}
	public static void main(String[] args){
		int i=0;		
		Scanner input = new Scanner(System.in);
		Compte C1 = null;
		while(true){
	
			if (i!=1){
				switch(menu(i)){
					case 0: return;
					case 1:
				
						i++;
                    				System.out.println("Saisir le numero de compte :");
                    				int Id = input.nextInt(); 
                    				System.out.println("\nSaisir le Nom du proprietaire :");
                    				String Nom = input.next();
                    				System.out.println("\nSaisir le Prenom du proprietaire :");
                    				String Prenom = input.next();
                    				System.out.println("\nSaisir le solde initial du compte :");
                    				double Solde = input.nextDouble();
						System.out.println("Vous voulez configurer votre plafond rouge?");
						switch(menu(2)){
							case 1 : 
								System.out.println("\nSaisir le plafond rouge :");
                    						double Plafond = input.nextDouble();
                    						C1 = new Compte(Id, Nom, Prenom, Solde,Plafond);
								break;
							case 2 :
								C1 = new Compte(Id, Nom, Prenom, Solde);
								break;
							default : System.out.println("\nSaisi des choix correctes");
						}
						System.out.println("\nCompte bien Creer");
                    				break;
					default : System.out.println("\nSaisi des choix correctes");
				}
			}
			else{
				switch(menu(i)){
					case 0: return;
			
					case 1:			
						System.out.println("\nLe proprietaire du compte est: "+ C1.getNom()+" "+ C1.getPrenom()+"\n\n");
						break;
					case 2 :
						System.out.println("\nLe solde de compte est: "+ C1.getSolde()+"\n\n");
						break;		
					case 3 : 
						System.out.println("\nSaisie le nom du proprietaire");
						C1.setNom(input.next());
						System.out.println("\nSaisie le prenom du proprietaire");
						C1.setPrenom(input.next());
						break;
					case 4 :
						System.out.println("\n"+C1.toString());
						break;	
					case 5 :
						System.out.println("\nSaisie le mantant a retirer");
						
						if (C1.retirer(input.nextInt()) < C1.getSolde()+C1.getPlafond()){
							System.out.println("\nLe mantant est bien retire");
						}
						else{
							System.out.println("\nPlafand insuffisant");
						}
						
						break;	
					case 6 :
						System.out.println("\nSaisie le mantant a deposer");
						C1.deposer(input.nextInt());
						System.out.println("\nLe mantant est bien depose");
						break;
					case 7 : 
						System.out.println("\nChoisis le plafond du compte");
						C1.setPlafond(input.nextDouble());
					default : System.out.println("\nSaisi des choix correctes");
						
				}
			}				
					
					
		}
	}
}

	