public class JouerAvecMethode {
    String Nom;

    // Constructeur
    JouerAvecMethode(String Nom) {
        this.Nom = Nom;
    }

    // Méthode pour afficher le message
    void affiche(JouerAvecMethode X) {
        System.out.println("Bienvenu à l’ISET Zaghouan !" + X.Nom);
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            JouerAvecMethode s = new JouerAvecMethode(args[i]);
            s.affiche(s);
        }
    }
}
