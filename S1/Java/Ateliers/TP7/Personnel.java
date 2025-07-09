public class Personnel {
	private Employe[] Collection;
	public Personnel(){
		Collection = new Employe[10];
	}
	public void AjoutEmp(Employe E){
		int i=0;
		while(i < Collection.length && Collection[i] != null){
			i++;
		}
		if(i < Collection.length){
			Collection[i] = E;
		}
	}
	public void Salaires(){
		int i=0;
		while(i < Collection.length && Collection[i] != null){
			System.out.println(Collection[i].CalculSal());
			i++;
		}
	}
	public double salaireMoyen(){
		int i=0;
		double S=0;
		while(Collection[i]!= null && i<Collection.length - 1){
			S+=Collection[i].CalculSal();
			i++;
		}
		return S/(i+1);
	}
	public static void main(String[] args) {
		Personnel p = new Personnel();
		Employe e;
		p.AjoutEmp(e = new Vendeur("Ali", "Abidi", 45, "1995", 30000));
		p.AjoutEmp(e = new Representateur("Farid", "Zitouni", 25, "2001", 20000));
		p.AjoutEmp(e = new Producteur("Sarah", "Fatnassi", 28, "1998", 1000));
		p.AjoutEmp(e = new ProducteurARisque("Amin", "Fatnassi", 28, "1998", 1000));	
		p.AjoutEmp(e = new Manutention("Salwa", "Majri", 32, "1998", 45));
		p.AjoutEmp(e = new ManutentionARisque("Fadi", "Ben ali", 30, "2001", 45));
		p.Salaires();
		System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " dinars."); 
	}
}
		
