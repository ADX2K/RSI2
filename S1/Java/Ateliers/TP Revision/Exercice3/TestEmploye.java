class TestEmploye{
	public static void main(String[] args){
		Employe E = new Employe("Aiouaz","Mohamed Adel",2023,1200,5200);
		System.out.println(E);	
		if (E.accorderPrime()){
			System.out.println("Prime : "+E.calculPrime());
		}
		else{
			System.out.println("Cet employe n'a pas de prime");
		} 
		System.out.println("Salaire Totale : "+E.calculSalaire());
		
		System.out.println("Change le salaire :");
		E.setSalaire();
		System.out.println("\n\n\n");
		System.out.println(E);
		if (E.accorderPrime()){
			System.out.println("Prime : "+E.calculPrime());
		}
		else{
			System.out.println("Cet employe n'a pas de prime");
		} 
		System.out.println("Salaire Totale : "+E.calculSalaire());
	}
}
		
		
		