public class TestEnseignant{
	public static void main(String[] args){
		Intervenants I = new Intervenants("Adel",50);
		Enseignants2Fac E = new Enseignants2Fac("Ali",200);
		Cycle C=new Cycle("foulen",150);
		System.out.println(I.toString()+"\n\n");
		System.out.println(E.toString()+"\n\n");
		System.out.println(C.toString());
	}
}