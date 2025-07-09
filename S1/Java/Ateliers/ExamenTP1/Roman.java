public class Roman extends livre{
	private String genre;
	public Roman (String titre, String auteur, String ISBN, String genre){
		super(titre,auteur,ISBN);
		this.genre=genre;
	}
	public String getGenre(){
		return this.genre;
	}
	public boolean Equals (Roman R){
		return this.genre == R.getGenre();
	}
	public String toString(){
		return super.toString() +"\nGenre : "+this.genre;
	}
}