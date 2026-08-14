module pe.edu.upeu.castillo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pe.edu.upeu.castillo to javafx.fxml;
    exports pe.edu.upeu.castillo;
}