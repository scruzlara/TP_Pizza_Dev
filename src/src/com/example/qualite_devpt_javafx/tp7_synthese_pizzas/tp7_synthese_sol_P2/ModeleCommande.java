package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol_P2;

import java.util.ArrayList;
import java.util.List;

/**
 * Modele du MVC de l'application de commandes de pizzas 
 *
 */
public class ModeleCommande implements Sujet {

	private int nbPizza,numPizzaCourante;
	private double prixCommande;
	private List<Pizza> listePizza;
	
	/**
	 * Liste des observateurs 
	 */
	private ArrayList<Observateur> observateurs;

	private StrategyFidelite taux;
	
	public ModeleCommande(){
		super();

		this.observateurs = new ArrayList<Observateur>();
		
		this.nbPizza=0;
		this.prixCommande=0.0;
		this.numPizzaCourante=0;
		this.listePizza= new ArrayList<Pizza>();
		
		this.taux= new ClientNouveau();
	}
	
	
	/**
	 * Methode appelee apres un ajout de pizza 
	 */
	public void ajouterPizza( String base){
		Pizza pizzCourante;
		if(this.nbPizza<4){
			this.nbPizza+=1;
			this.numPizzaCourante = this.nbPizza-1;
		
			if(base.equals("0")){
				pizzCourante=new PizzaCreme();
			}
			else{
				pizzCourante=new PizzaTomate();
			}
			this.listePizza.add(nbPizza-1,pizzCourante);
			this.calculPrixCommande();
			notifierObservateurs();
		}
	}
	
	
	/**
	 * Calcul du prix de la commande de pizzas
	 */
	public void calculPrixCommande(){
		double prix=0.0;
		
		for(int i=0;i<this.nbPizza;i++){
			prix+=this.listePizza.get(i).cout();
		}
		this.prixCommande=prix*this.taux.getTaux();
	}

	
	/**
	 * @return the nbPizza
	 */
	public int getNbPizza() {
		return nbPizza;
	}

	
	/**
	 * @return the prixPizza
	 */
	public double getPrixCommande() {
		return prixCommande;
	}

	
	/**
	 * @return the listePizza
	 */
	public List<Pizza> getListePizza() {
		return listePizza;
	}
	
	
	/**
	 * @return the numPizzaCourante
	 */
	public int getNumPizzaCourante() {
		return numPizzaCourante;
	}


	/**
	 * @param num de la PizzaCourante to set
	 */
	public void setNumPizzaCourante(int num) {
		this.numPizzaCourante = num;
		System.out.println("Pizza "+this.numPizzaCourante+" selectionnee");
		notifierObservateurs();
	}

	/*
	 * Modifie la fidelite du client 
	 */
	public void setFidelite(StrategyFidelite sf) {
		this.taux=sf;
		this.calculPrixCommande();
		notifierObservateurs();
	}

	/**
	 * Methode appelee apres un choix d'ingredient
	 */
	public void choixIngredient(int choix) {
		if (this.nbPizza != 0) {
			Pizza pizzCourante = this.listePizza.get(this.numPizzaCourante);
			switch (choix) {
				case 0:
					this.listePizza.set(this.numPizzaCourante, new PizzaFromage(pizzCourante));
					break;
				case 1:
					this.listePizza.set(this.numPizzaCourante, new PizzaChampignons(pizzCourante));
					break;
				case 2:
					this.listePizza.set(this.numPizzaCourante, new PizzaChorizo(pizzCourante));
					break;
				case 3:
					this.listePizza.set(this.numPizzaCourante, new PizzaOeuf(pizzCourante));
					break;
				case 4:
					this.listePizza.set(this.numPizzaCourante, new PizzaOignons(pizzCourante));
					break;
				case 5:
					this.listePizza.set(this.numPizzaCourante, new PizzaOlivesN(pizzCourante));
					break;
				case 6:
					this.listePizza.set(this.numPizzaCourante, new PizzaOlivesV(pizzCourante));
					break;
				case 7:
					this.listePizza.set(this.numPizzaCourante, new PizzaRoquette(pizzCourante));
					break;

			}

			this.calculPrixCommande();

			notifierObservateurs();
		}
	}
	/**
	 * Ajoute un observateur a la liste 
	 */
	public void enregistrerObservateur(Observateur o) {
		this.observateurs.add(o);
	}
	
	
	/**
	 * Supprime un observateur a la liste
	 */
	public void supprimerObservateur(Observateur o) {
		int i = this.observateurs.indexOf(o);
		if (i >= 0) {
			this.observateurs.remove(i);
		}
	}
	
	
	/**
	 * Informe tous les observateurs de la liste des
	 * modifications en appelant leurs methodes actualiser
	 */
	public void notifierObservateurs() {
		for (int i = 0; i < this.observateurs.size(); i++) {
			Observateur observer = this.observateurs.get(i);
			observer.actualiser(this);
		}
	}

	
}
