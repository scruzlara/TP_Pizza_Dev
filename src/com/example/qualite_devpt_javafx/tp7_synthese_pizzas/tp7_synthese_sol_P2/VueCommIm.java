package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol_P2;

import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.List;
import java.util.Stack;


/**
 * Vue visualisant les images des pizzas de la commande
 *
 */
public class VueCommIm extends GridPane implements Observateur {


	
	public VueCommIm(){


		this.setPadding(new Insets(15));
		this.setHgap(25);

	}
	
	@Override
	public void actualiser(Sujet s) {
		
		ModeleCommande model=(ModeleCommande)s;

		List<Pizza> l =model.getListePizza();

		for(int i=0; i<model.getNbPizza(); i++){
			//this.add(l.get(i).getPizzaIm().getSp(),i,1);
			if(model.getNumPizzaCourante()==i) {
				Rectangle rect= new Rectangle(202,202, Color.rgb(255,255,255,0.2)); // création d'un rectangle entourant l'image
				rect.setStroke(Color.BLACK);
				StackPane ssp =l.get(i).getPizzaIm().getSp();
				ssp.getChildren().add(rect);
				this.add(ssp,i,1);
			}
			else{
				this.add(new Rectangle(203,203,Color.rgb(255,255,255)),i,1 );
				this.add(l.get(i).getPizzaIm().getSp(),i,1);
			}

		}
		
	}
	


	
}
