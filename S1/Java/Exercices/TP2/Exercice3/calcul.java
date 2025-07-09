class calcul {
	int n1;
	int n2;
	char op;
	int s;
	calcul (int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	public void addition(){
		s=n1+n2;
		System.out.println(n1+" + "+n2+" = "+s);
	}
	public void soustraction(){
		s=n1-n2;
		System.out.println(n1+" - "+n2+" = "+s);
	}
	public void division(){
		if (n2!=0){
			s=n1/n2;
			System.out.println(n1+" / "+n2+" = "+s);
		}
		else{
			System.out.println("Division par 0 impossible");
		}
	}
	public void multiplication(){
		s=n1*n2;
		System.out.println(n1+" X "+n2+" = "+s);
	}
	
	public static void main(String[] args){
		if(args.length != 3){
			System.out.println("Veuillez fournir deux entiers et un operateur comme arguments.\nFormat : nombre1 nombre2 operation");
		}
		else {
            		int n1 = Integer.parseInt(args[0]);
            		int n2 = Integer.parseInt(args[1]);
			calcul operation = new calcul(n1,n2);
			char operator = args[2].charAt(0);
			switch(operation){
				case '+' : operation.addition();break;
				case '-' : operation.soustraction();break;
				case '/' : operation.division();break;
				case '*' : operation.multiplication();break;
				Defaut : System.out.println("possible operations : \n +,-,/,*");
			}	
					
		}

	}
}