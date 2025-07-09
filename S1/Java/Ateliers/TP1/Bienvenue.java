class Bienvenue {
	private String Nom;
	public void modif(String ch){
		Nom = ch;
	}
	public static void main(String[] args) {
		Bienvenue obj = new Bienvenue(); 
		for (int i = 0; i < args.length; i++) {
			obj.modif(args[i]);
			System.out.println("Yes, on a commencé la POO avec " + obj.Nom);
		}
	}

}
