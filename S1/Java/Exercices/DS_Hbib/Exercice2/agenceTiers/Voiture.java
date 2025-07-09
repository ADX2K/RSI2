package agenceTiers;
public class Voiture{
	private String Immatricule;
	private String Marque;
	private double Prix;
	public Voiture(String Immatricule, String Marque, double Prix){
		this.Immatricule=Immatricule;
		this.Marque=Marque;
		this.Prix=Prix;
	}
	  
  	public String getImmatricule() {
        	return Immatricule;
    	}

    	public void setImmatricule(String Immatricule) {
        	this.Immatricule = Immatricule;
    	}

    	public String getMarque() {
        	return Marque;
    	}

    	public void setMarque(String Marque) {
        	this.Marque = Marque;
    	}

    	public double getPrix() {
        	return Prix;
    	}

    	public void setPrix(double Prix) {
        	this.Prix = Prix;
    	}
}