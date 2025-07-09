public class agence{
	private String adresse;
	private personne gerant;
	private BienImmobilier[] tab;
	public agence(String adresse, personne gerant){
		this.adresse=adresse;
		this.gerant=gerant;
		tab=new BienImmobilier[10];
	}
	public String toString(){
		String ch= "Gerant : \n"+this.gerant+"\nAdresse : "+this.adresse;
		for (BienImmobilier i : tab){
			if (i!=null){
				ch+="\n"+i;
			}
		}
		return ch;
	}
	public boolean exist(BienImmobilier b){
		for (BienImmobilier i : tab){
			if (i!=null && i.code==b.code){
				return true;
			}
		}
		return false;
	}
	public void ajout(BienImmobilier b){
		int i=0;
		while (tab[i]!=null && i<tab.length){
			i++;
		}
		if(i>tab.length){
			System.out.println("Table saturé");
		}
		else{
			tab[i]=b;
		}
	}
}