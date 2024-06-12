

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.Parent;
import javafx.fxml.FXML;

/**
 * Use los comentarios para explicar el objetivo de este programa vistaReloj .
 *
 * @author Ponga aqui su nombre y correo
 * @version Ponga aquí la versión o fecha
 */
public class vistaReloj extends Application{
    

    public void start(Stage stage) throws Exception{
        // Create the FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "vistaReloj.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

        // Create the Pane and all Details
        Parent root = (Parent) loader.load(fxmlStream);

        // Create the Scene
        Scene scene = new Scene(root);
        // Set the Scene to the Stage
        stage.setScene(scene);
        // Set the Title to the Stage
        stage.setTitle("Reloj de Elonk Musk");
        stage.resizableProperty().setValue(Boolean.FALSE);
        // Display the Stage
        stage.show();
    }
}

