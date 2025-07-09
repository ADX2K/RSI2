public class testAgence {
    public static void main(String[] args) {
        personne p1 = new personne("Ali", "Zaghouan", 123456);
        personne p2 = new personne("Ahmed", "Tunis", 789012);
        personne p3 = new personne("Sami", "Sousse", 345678);
        personne p4 = new personne("Mouna", "Nabeul", 567890);
        personne p5 = new personne("Rania", "Kairouan", 678901);
        agence ag = new agence("Zaghouan", p1);


        appartement A1 = new appartement(1, "Tunis", 80.5, p2, "Residence A", 3, 101);
        appartement A2 = new appartement(2, "Sousse", 65.0, p3, "Residence B", 2, 102);
        appartement A3 = new appartement(3, "Nabeul", 90.5, p4, "Residence C", 4, 103);
        maison M1 = new maison(4, "Kairouan", 120.0, p5, "Rue X", 15, 6);

        try {
            A1.louer();
            M1.louer();
        } catch (ImmobilierReserveException e) {
            System.out.println(e);
        }

 
        ag.ajout(A1);
        ag.ajout(A2);
        ag.ajout(A3);
        ag.ajout(M1);


        System.out.println(ag);
    }
}
