public class Point{

	double x;
	double y;
	public Point(double x,double y){
		this.x=x;
		this.y=y;
	}
	public void Affiche(){
		System.out.println("Le point est de coordonnees : ("+x+","+y+")");
	}
	public void Translater(double dx,double dy){
		this.x+=dx;
		this.y+=dy;
		System.out.println("Vous avez translater le point par dx="+dx+" et dy="+dy);
	}
	public static void main(String[] args){
		Point P1 = new Point(3.5,7);
		P1.Affiche();
		P1.Translater(2,3);
		P1.Affiche();
	}





}