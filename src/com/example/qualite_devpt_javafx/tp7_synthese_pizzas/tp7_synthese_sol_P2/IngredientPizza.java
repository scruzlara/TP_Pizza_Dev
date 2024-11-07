/**
 * 
 */
package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol_P2;



/**
 * @author debled
 *
 */
public abstract class IngredientPizza implements Pizza {
	

	protected Pizza pizza;
	protected double prix;
	protected String description;
	protected String nomImage;
	
	protected IngredientPizza(Pizza pi, double pr, String d, String nIm){
		this.pizza=pi;
		this.prix=pr;
		this.description=d;
		this.nomImage=nIm;
	}

	
	public String getDescription(){
		return  pizza.getDescription()+ "-"+this.description;
	}
	
	public double cout(){
		return this.prix + pizza.cout();
	}
	
	public  MyImage getPizzaIm(){
		MyImage i=pizza.getPizzaIm();
		i.superposer("/"+this.nomImage);
		return i;
	}
	
}
