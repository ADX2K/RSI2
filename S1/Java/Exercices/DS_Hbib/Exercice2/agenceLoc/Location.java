package agenceLoc;
import agenceTiers.Client;
import agenceTiers.Voiture;

public class Location{
	private int NumContrat;
	private String DateDebLocation;
	private String DateFinLocation;
	private Client client;
	private Voiture voiture;

	public Location(int NumContrat, String DateDebLocation, String DateFinLocation, Client client, Voiture voiture){
		this.NumContrat=NumContrat;
		this.DateDebLocation=DateDebLocation;
		this.DateFinLocation=DateFinLocation;
		this.client=client;
		this.voiture=voiture;
	}
	public int getNumContrat() {
        	return this.NumContrat;
    	}

    	public void setNumContrat(int NumContrat) {
        	this.NumContrat = NumContrat;
    	}

    	public String getDateDebutLocation() {
        	return this.DateDebLocation;
    	}

    	public void setDateDebLocation(String DateDebLocation) {
        	this.DateDebLocation = DateDebLocation;
    	}

    	public String getDateFinLocation() {
        	return this.DateFinLocation;
    	}

    	public void setDateFinLocation(String DateFinLocation) {
        	this.DateFinLocation = DateFinLocation;
    	}

   	public Client getClient() {
        	return client;
    	}

    	public void setClient(Client client) {
        	this.client = client;
    	}

    	public Voiture getVoiture() {
        	return voiture;
    	}

    	public void setVoiture(Voiture voiture) {
        	this.voiture = voiture;
    	}
}