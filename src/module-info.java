module S3_QDev_TP_Synthese_2022_V2 {
    requires javafx.controls;

    exports com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol;
    exports com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol_P2;
    opens com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol to javafx.controls;
    opens com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol_P2 to javafx.controls;
}