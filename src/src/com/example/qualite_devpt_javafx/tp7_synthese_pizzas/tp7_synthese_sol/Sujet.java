package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol;

public interface Sujet {
	public void enregistrerObservateur(Observateur o);
	public void supprimerObservateur(Observateur o);
	public void notifierObservateurs();
}
