import agenceLoc.Location;
import agenceTiers.Client;
import agenceTiers.Voiture;
public class agenceApplication{
	public static void main(String[] args){
		Client C1 = new Client(15028204,"Aiouaz","Mohamed Adel");
		Voiture V1 = new Voiture("157Tu5921","Pegeot 206+",3500);
		Location L1 = new Location(1526,"06/08/2024","09/09/2024",C1,V1);
		System.out.println("Location:");
        	System.out.println("Client: " + C1.getNom() + " " + C1.getPrenom());
        	System.out.println("Voiture: " + V1.getMarque() + " (" + V1.getImmatricule() + ")");
		System.out.println("Prix: "+V1.getPrix()+ "Dt");
        	System.out.println("Contrat No: " + L1.getNumContrat());
        	System.out.println("Date de début: " + L1.getDateDebutLocation());
        	System.out.println("Date de fin: " + L1.getDateFinLocation());
	}



}