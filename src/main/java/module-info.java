module es.habccode.juego.ahorcado{
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.controlsfx.controls;
    requires javafx.graphics;

    opens es.habccode.juego.ahorcado to javafx.fxml;
    exports es.habccode.juego.ahorcado;
    exports es.habccode.juego.ahorcado.controller;
    exports es.habccode.juego.ahorcado.controller.abstractas;
    exports es.habccode.juego.ahorcado.model;
    opens es.habccode.juego.ahorcado.controller to javafx.fxml;
}