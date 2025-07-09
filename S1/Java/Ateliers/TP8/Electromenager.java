public class Electromenager  extends Article implements VendabeParPiece,Succeptible{
	private int stock=0;

	public Electromenager(double pa,double pv,String nom,String fourni){
		super(pa,pv,nom,fourni);
	}
	public void setStock(int S){
		this.stock=S;
	}
	public void affiche(){
		super.affiche();
		System.out.println("\nStock : "+this.stock); 
	}
	public double vendre(int qt){
		stock-=qt;
		return (qt*prixVente);
	}
	public void DebSolde(double p){
		prixVente+=(prixVente*p)/100;
	}
	public void FinSolde(double p){
		prixVente-=(prixVente*p)/100;
	}
}
