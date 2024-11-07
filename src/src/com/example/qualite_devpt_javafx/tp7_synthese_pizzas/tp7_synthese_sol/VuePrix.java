package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol;


import javafx.scene.control.Label;

/**
 * Vue indiquant le prix total de la commande
 *
 */
public class VuePrix extends Label implements Observateur {
	
	public VuePrix(){
		super("Pas de commande en cours");
	}

	@Override
	public void actualiser(Sujet s) {
		double prix= ((ModeleCommande)s).getPrixCommande(); 
		this.setText("Prix total de votre commande : "+String.format("%.2f", prix)+" euros\n");

	}

}
