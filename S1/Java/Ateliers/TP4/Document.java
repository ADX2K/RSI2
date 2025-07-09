class Document{
	private String Titre;
	private int Num;
	private static int Compteur=0;
	public Document(String Titre, int Num){
		this.Titre = Titre;
		if (Num<this.Compteur){
			this.Num=this.Compteur++;
		}
		else{
			this.Num=Num;
			this.Compteur=Num+1;
		}
	}
	public Document(String Titre){
		this.Titre = Titre;
		this.Num=this.Compteur;
		this.Compteur++;
	}
	public String getTitre(){
		return this.Titre;
	}	
	public int getNum(){
		return this.Num;
	}
	public String toString(){	
		return this.Num + " - " + this.Titre+"\n";
	}



}