class addition {
	int n1;
	int n2;
	int s;
	addition (int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	public void calcul(){
		s=n1+n2;
		System.out.println(n1+" + "+n2+" = "+s);
	}
	
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("Veuillez fournir deux entiers comme arguments.");
		}
		else {
            		int n1 = Integer.parseInt(args[0]);
            		int n2 = Integer.parseInt(args[1]);
			addition addition = new addition(n1,n2);
			addition.calcul();
			
		}

	}
}