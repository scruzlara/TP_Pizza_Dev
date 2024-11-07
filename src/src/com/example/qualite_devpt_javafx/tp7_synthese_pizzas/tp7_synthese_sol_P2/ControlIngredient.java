package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol_P2;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControlIngredient  implements EventHandler<ActionEvent> {
private ModeleCommande model;
private String [] ingredients={"Fromage","Champignons","Chorizo","Oeuf","Oignons","Olives noires","Olives vertes","Roquette"};


	public ControlIngredient(ModeleCommande model) {
		this.model=model;
	}



	public void handle(ActionEvent e) {
		String s=(String)e.toString();
		boolean trouve=false;
		
		for(int i=0;i<this.ingredients.length && !trouve;i++){
			System.out.println("dans choix");
			if(s.contains(ingredients[i])){
				System.out.println("choix ingredient :"+i);
				this.model.choixIngredient(i);
				trouve=true;
			}
		}
	}
	
}

	

	


