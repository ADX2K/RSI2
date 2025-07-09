import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // Création de l'objet Scanner pour lire les entrées
        Scanner scanner = new Scanner(System.in);

        // Demander et lire la variable
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        // Afficher la variable
        System.out.println("Votre âge est : " + age);
        
        // Fermer le scanner
        scanner.close();
    }
}
