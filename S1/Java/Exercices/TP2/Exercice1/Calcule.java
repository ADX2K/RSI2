class Calcul {
	int s = 0;
	int x ;
	Calcul (int x){
		this.x=x;
	}
	public void somme(int limit){
		for(int i=1;i<=x;i++){
			s += i;
		}
		System.out.println("la somme des "+limit+" premiers entiers est : "+ s);
	}

		

	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		Calcul calcul = new Calcul(x);
		calcul.somme(calcul.x);
	}
}