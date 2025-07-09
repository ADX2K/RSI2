public class Animal{
	protected int NbPattes;
	public Animal(int NbPattes){
		this.NbPattes=NbPattes;
	}
	public String toString(){
		return "Ceci un animal de "+this.NbPattes+" Pattes";
	}
	public void Affiche(){
		System.out.println(this);
	}
}