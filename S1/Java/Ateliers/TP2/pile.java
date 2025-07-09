import java.util.*;
public class pile{
	private int sommet = -1;
	private int[] element;
	public pile (int max){
		element = new int [max];
	}
	public void empiler(int x){
		sommet++;
		if (sommet == element.length){
			afficher("Pile Saturé");
		}
		else{
			element[sommet]=x;
			afficher("Element bien empilé");
			
		}
	}
	public int depiler(){
		int x=0;
		if(!pilevide()){
			x=element[sommet];
			sommet--;
		}
		else{
			afficher("Pile Vide");
		}
		return x;
	}
	public boolean pilevide(){
		return (sommet == -1);
	}
	public void viderpile(){
		sommet=-1;
		afficher("Pile bien vidé");
	}
	private void afficher(String ch){
		System.out.println(ch);
	}
	public void listerpile(){
		if(pilevide()){
			afficher("Pile Vide");
		}
		else{
			for(int i=0;i<sommet;i++){
				System.out.print(element[i]+",");
			}
		}
	}
	public static void main(String[] arg) {
		pile element = new pile(5); 
		System.out.println("Manipuler votre pile:\n0.Exit\n1.Initialiser\n2.Empiler(x)\n3.Depiler()\n4.ViderPile()\n5.ListerPile()");

		Scanner choix = new Scanner(System.in);
		Scanner emp = new Scanner(System.in);
		element.afficher("Choisis une fonction\n");
		int option = choix.nextInt();
		do{
			switch (option) {
				case 1: element.afficher("Donner la taille maximale de la pile");
					element = new pile(emp.nextInt());
					break;
				case 2:
					System.out.println("Saisissez le nombre à empiler:");
					int value = emp.nextInt(); 
					element.empiler(value);
					break;
				case 3:
					element.depiler();
					break;
				case 4:
					element.viderpile();
					break;
				case 5:
					element.listerpile();
					break;
				default : element.afficher("Saisir un choix entre 0 et 4");
			}
			element.afficher("\nChoisis une fonction");
			option = choix.nextInt();

		}while (option != 0);
	}


}