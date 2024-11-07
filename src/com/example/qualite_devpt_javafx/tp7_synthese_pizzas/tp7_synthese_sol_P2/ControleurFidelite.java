package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol_P2;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;

public class ControleurFidelite implements EventHandler<ActionEvent> {
	
	ModeleCommande mod;
	
	public ControleurFidelite(ModeleCommande modele) {
		this.mod=modele;
	}

	@Override
	public void handle(ActionEvent e) {
		ComboBox<String> c = (ComboBox<String>)e.getSource();
		System.out.println("c.getValue()");
	
		switch (c.getValue()) {
			case "Nouveau client":
				mod.setFidelite(new ClientNouveau());
				break;
			case "Client adhérent" :
				mod.setFidelite(new ClientCarte());
				break;
			default:
				mod.setFidelite(new ClientAbonnement());
				break;
		}

	}

}
