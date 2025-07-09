class JouerAvecAttribut{
	String maChaine;
	void Afficher(){
		System.out.println(this.maChaine);
	}
	public static void main(String[] args){
		JouerAvecAttribut s=new JouerAvecAttribut();
		s.maChaine = "Salut";
		s.Afficher();
	}
}

