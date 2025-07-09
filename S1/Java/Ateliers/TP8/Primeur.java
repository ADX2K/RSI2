public class Primeur  extends Article implements VendabeParKg{
	private double stock=0;

	public Primeur(double pa,double pv,String nom,String fourni){
		super(pa,pv,nom,fourni);
	}
	public void setStock(double S){
		this.stock=S;
	}
	public void affiche(){
		super.affiche();
		System.out.println("\nStock : "+this.stock); 
	}
	public double vendre(double qt){
		stock-=qt;
		return (qt*prixVente);
	}

}
