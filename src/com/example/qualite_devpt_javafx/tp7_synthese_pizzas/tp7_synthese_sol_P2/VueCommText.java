/**
 * 
 */
package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol_P2;


import javafx.scene.control.Label;

import static javafx.geometry.Pos.TOP_LEFT;

/**
 * Vue donnant la description textuelle des pizzas de la commande
 *
 */
public class VueCommText extends Label implements Observateur {
	
	public VueCommText(){

		super("Aucune commande en cours");
		this.setAlignment(TOP_LEFT);
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void actualiser(Sujet su) {
		ModeleCommande m=(ModeleCommande)su;
		String s=" VOTRE COMMANDE :\n";
		for(int i=0; i< m.getNbPizza();i++){
			s=s+"\n Pizza "+ (i+1)+" : "+ String.format("%.2f", m.getListePizza().get(i).cout())+" euros  \n";
			s=s+"  "+m.getListePizza().get(i).getDescription() + "\n";
		}
		this.setText(s);
			
	}

}
