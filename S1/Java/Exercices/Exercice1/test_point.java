class point {  // Notice no 'public' keyword
    char Nom;
    int Abscisse;
    int Ordonnée;

    public point(char n, int a, int o) {
        Nom = n;
        Abscisse = a;
        Ordonnée = o;
    }

    public point(int a, int o) {
        Abscisse = a;
        Ordonnée = o;
    }

    public point(char n) {
        Nom = n;
    }

    public void affiche() {
        System.out.println(Nom + "(" + Abscisse + "," + Ordonnée + ")");
    }

    public void transHorz(int a) {
        Abscisse = Abscisse + a;
    }

    public void transVer(int b) {
        Ordonnée = Ordonnée + b;
    }

    public void Translation(int a, int b) {
        Abscisse = Abscisse + a;
        Ordonnée = Ordonnée + b;
    }

    boolean Coincide(point p) {
        return (Abscisse == p.Abscisse) && (Ordonnée == p.Ordonnée);
    }
}

public class test_point {
    public static void main(String[] args) {
        point p1;
        p1 = new point(3, 5);
        p1.affiche();

        point p2 = new point('m'); // on ajoute des coordonnées à l'objet p2
        point p3 = new point('b', 3, 5);

        p2.affiche();
        p3.affiche();

        if (p1.Coincide(p3)) {
            System.out.println("les 2 points sont coincïdes");
        } else {
            System.out.println("les 2 points ne coïncident pas");
        }

        p1.transHorz(2);
        p2.transVer(3);
        p3.Translation(5, 2);

        p1.affiche();
        p2.affiche();
        p3.affiche();
    }
}
