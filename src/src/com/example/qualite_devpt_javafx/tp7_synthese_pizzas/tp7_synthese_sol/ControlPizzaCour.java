package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol;


import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 * un controleur --> gestion des clics de souris 
 * dans le JPanel ou les pizzas sont visualisees 
 *
 */
public class ControlPizzaCour implements EventHandler<MouseEvent> {

	
	private ModeleCommande model;
	
	public ControlPizzaCour(ModeleCommande mo) {
		this.model=mo;
	}

	@Override
	public void handle(MouseEvent e) {
		int x= (int) e.getX();
		int numP=x/225;
		this.model.setNumPizzaCourante(numP);
	}


}
