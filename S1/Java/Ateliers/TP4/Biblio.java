class Biblio{
	private Document[] Docs;

	public Biblio(){
		Docs=new Document[20];
	}

	public void addDoc(Document D){
		while (D.getNum()>= Docs.length){
			Document[] T = new Document[Docs.length * 2];
			for (int i=0 ; i<Docs.length;i++){
				T[i]=Docs[i];
			}
			Docs=T;
		}	
	 	Docs[D.getNum()]=D;
	}


	public Document getDoc(int i){
		if(i>= Docs.length || Docs[i] == null){
			return null;
		}
        	else{
		 	return Docs[i];
		}
	}

	public String toString(){
		String res="";
    		for(int i=0 ; i<Docs.length ; i++){
			if(Docs[i]!=null){
				res+=getDoc(i);
			}
		}
		return res;
	}
	
	

}

