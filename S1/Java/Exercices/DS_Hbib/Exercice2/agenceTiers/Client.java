package agenceTiers;
public class Client{
	private int Code;
	private String Nom;
	private String Prenom;
	public Client(int Code, String Nom, String Prenom){
		this.Code=Code;
		this.Nom=Nom;
		this.Prenom=Prenom;
	} 
	public int getCode() {
        	return Code;
    	}

   	public void setCode(int Code) {
        	this.Code = Code;
    	}

    	public String getNom() {
        	return Nom;
    	}

    	public void setNom(String Nom) {
        	this.Nom = Nom;
    	}

    	public String getPrenom() {
        	return Prenom;
    	}

    	public void setPrenom(String Prenom) {
        	this.Prenom = Prenom;
    	}
}