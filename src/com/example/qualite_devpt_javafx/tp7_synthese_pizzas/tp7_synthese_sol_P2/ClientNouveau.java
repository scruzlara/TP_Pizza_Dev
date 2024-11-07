package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol_P2;

public class ClientNouveau implements StrategyFidelite {

	@Override
	public double getTaux() {
		// Taux max pour les nouveaux clients
		return 1;
	}

}
