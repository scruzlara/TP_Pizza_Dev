package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol_P2;


/**
 * classe des pizzas base tomate
 *
 */
public class PizzaTomate implements Pizza {
	private double prix;
	private String nomIm;
	private String description;
	
	public PizzaTomate(){
		this.nomIm="/fond_tomate.png";
		this.prix=5.0;
		this.description="Pizza base tomate ";
	}
	
	@Override
	public MyImage getPizzaIm() {
		return new MyImage(nomIm,null);
	}

	@Override
	public double cout() {
		return prix;
	}
	
	public String getDescription(){
		return description;
	}

}
