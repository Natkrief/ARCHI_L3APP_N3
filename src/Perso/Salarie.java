package Perso;

public class Salarie extends Personne{
	private String salaire;

	public Salarie(String nom, String prenom,String salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}
	

	public String afficher() {
		return super.afficher()+"Salarie [salaire=" + salaire + "]";
	}


}
