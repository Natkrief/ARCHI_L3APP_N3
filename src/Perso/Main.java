package Perso;

public class Main {

	public static void main(String[] args) {
		Personne pers = new Personne("Tay","Fuh");
		Personne sala = new Salarie("Faille","Fuh","2000");
		
		System.out.println(pers.afficher());
		System.out.println(sala.afficher());
		
		Salarie salarie = new Salarie("Yaille","Fuh","4500");
		
		System.out.println(salarie.afficher());
		
		//Salarie salarie2 =new Personne("Kay","Fuh"); Impossible car une personne n'est pas forcément un salarié :D

	}

}
