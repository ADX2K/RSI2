class Etudiant {
    private String nom;

    public Etudiant(String nom) {
        this.nom = nom;
    }

    public void afficher() {	
        System.out.println("Le nom de l'étudiant est : " + this.nom);
    }

    public void modifier(String nom) {
        System.out.println("Le nom de l'étudiant est modifié de " + this.nom + " vers " + nom);
        this.nom = nom;
    }	

    public void travailler() {
        System.out.println(this.nom + " se met au travail !");
    }

    public void seReposer() {
        System.out.println(this.nom + " se repose.");
    }
}

public class TestEtudiant {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("Mohamed Adel Aiouaz");
        e1.afficher();
        e1.travailler();
        e1.seReposer();
        e1.modifier("Ali Hamza");
        e1.afficher();
    }
}
