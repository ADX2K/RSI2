import java.util.*;
class Pays{
	private Scanner input = new Scanner(System.in);
	private String Nom;
	private int Superficie;
	private int Population;
	private static int NombrePays=0;
	public Pays(){
		this.Nom=null;
		this.Superficie=0;
		this.Population=0;
		this.NombrePays++;
	}
	public Pays(String Nom,int Superficie,int Population){
		this.Nom=Nom;
		this.Superficie=Superficie;
		this.Population=Population;
		this.NombrePays++;	
	}
	public String getNom(){
		return this.Nom;	
	}
	public int getSuperficie(){
		return this.Superficie;
	}
	public int getPopulation(){
		return this.Population;
	}
	public void setNom(){
		this.Nom=input.nextLine();
	}
	public void setSuperficie(){
		do{
			this.Superficie=input.nextInt();
		}while(this.Superficie<20000);
	}
	public void setPopulation(){
		this.Population=input.nextInt();
	}
	public String toString(){
		return "Nom : "+this.Nom+"\nSuperficie : "+this.Superficie+"\nPopulation : "+this.Population;
	}
	public double densite(){
		return (this.Population*1000000)/this.Superficie;
	}
	public Boolean plusPeupleQue(Pays P){
		return this.densite() > P.densite();
	}
	
}
	
		