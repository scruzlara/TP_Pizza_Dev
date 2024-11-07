/**
 * 
 */
package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * un controleur --> gestion des boutons du JPanel nord de l'IG
 *
 */
public class ControlDebutCommande implements EventHandler<ActionEvent> {
	
	private ModeleCommande model;
		
	/**
	 * Construction du panel des boutons pour ajouter des pizzas � la commande
	 */
	public ControlDebutCommande(ModeleCommande mo) {
		this.model=mo;	
	}

	
	/* (non-Javadoc)
	 *
	 */
	@Override
	public void handle(ActionEvent e) {
		String s= (String) e.toString();   /// Attention grande chaine de caractère
		System.out.println(s);
		
		if(s.contains(" Ajouter une pizza fond creme ")){
			model.ajouterPizza("0");
		}
		if(s.contains(" Ajouter une pizza fond tomate ")){
			model.ajouterPizza("1");
		}

	}

}
