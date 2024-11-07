/**
 * 
 */
package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol_P2;


/**
 * classe des pizzas base creme
 *
 */
public class PizzaCreme implements Pizza {
	private double prix;
	private String nomIm;
	private String description;
	
	public PizzaCreme(){
		this.nomIm="/fond_creme.png";
		this.prix=6.0;
		this.description="Pizza base creme ";
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
