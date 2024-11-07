package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol_P2;

public class ClientCarte implements StrategyFidelite {

	@Override
	public double getTaux() {
		// Avec carte -10%
		return 0.9;
	}

}
