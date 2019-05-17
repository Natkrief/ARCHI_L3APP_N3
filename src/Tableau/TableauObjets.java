package Tableau;

import java.util.Scanner;

public class TableauObjets<T>{
	
	private T [] tabObjets;
	
	public TableauObjets(int taille){
		this.tabObjets = (T[]) new Object[taille];
	}
	
	public T getObjet(int indice){
		return this.tabObjets[indice];
	}
	
	public void setObjet(int indice, T o){
			this.tabObjets[indice]=o;
	}
	
	public static void main(String[]args){
		
		TableauObjets <Integer> t = new TableauObjets<Integer>(10);
		
		t.setObjet(0, 45);
		t.setObjet(1, 19);
		t.setObjet(2, 56);
		System.out.println(t.getObjet(0));
		System.out.println(t.getObjet(1));
	}
	
}

	/* OBJET NORMAL AVEC VERIF
	 * Construire une classe TableauObjets, repr�sentant un tableau d�objets et
	 * respectant les indications suivantes�: Le nombre de cases doit �tre fixe,
	 * fourni par l�utilisateur (taille)�; L�acc�s aux cases est direct, � partir de
	 * leur indice�; Les indices des cases varient entre 0 et taille-1�;
	 * L�utilisateur d�cide lui-m�me de comment remplir les cases et dans quelle
	 * ordre gr�ce aux indices�; Le tableau doit pouvoir comporter des objets java
	 * de n�importe quelle classe, mais tous les objets doivent appartenir � une
	 * seule et unique classe�; Il est interdit d�utiliser les collections d�finies
	 * dans java.util.* (ArrayList, Vector�)
	 * 
	 * 
	 * public class TableauObjets {
	 * 
	 * private Object [] tabObjets; private boolean firstAdd; private Object type;
	 * 
	 * public TableauObjets(int taille){ this.tabObjets = new Object[taille];
	 * this.firstAdd=false;
	 * 
	 * }
	 * 
	 * public Object getObjet(int indice){ return this.tabObjets[indice]; }
	 * 
	 * public void setObjet(int indice, Object o){
	 * 
	 * if(this.firstAdd==false){ this.type=o.getClass(); this.firstAdd=true;
	 * this.tabObjets[indice]=o; System.out.println("objet ajout�!"); }
	 * 
	 * else{ if(o.getClass()!=this.type){
	 * System.out.println("impossible d'ajouter cet objet!"); } else{
	 * this.tabObjets[indice]=o; System.out.println("objet ajout�!"); } }
	 * 
	 * 
	 * }
	 * 
	 * 
	 * }
	 */

	
	
	/* SANS VERIF ET AVEC GENERALISATION
	 * 
	 * 
	 */
	
	
