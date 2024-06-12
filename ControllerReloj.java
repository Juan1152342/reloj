
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ControllerReloj {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cmdAdelantaHora;

    @FXML
    private Button cmdAdelantaMinuto;

    @FXML
    private Button cmdAdelantaSegundo;

    @FXML
    private Button cmdRetrocedeHora;

    @FXML
    private Button cmdRetrocedeMinuto;

    @FXML
    private Button cmdRetrocedeSegundo;

    @FXML
    private ImageView imgTales;

    @FXML
    private Label lbHorario;

    @FXML
    private Label lbMinutero;

    @FXML
    private Label lbSegundero;

    @FXML
    private Label lblHoras;

    @FXML
    private Label lblMinutos;

    @FXML
    private Label lblSegundos;

    @FXML
    private Label lblTitulo;

    @FXML
    private TextField txtHora;

    @FXML
    private TextField txtMinuto;

    @FXML
    private TextField txtSegundo;

    @FXML
    void avanzarHorario(ActionEvent event) {
        System.out.println("Event Button Avanzar Horario");

    }

    @FXML
    void avanzarMinutero(ActionEvent event) {
        System.out.println("Event Button Avanzar Minutero");

    }

    @FXML
    void avanzarSegundero(ActionEvent event) {
        System.out.println("Event Button Avanzar Segundero");

    }

    @FXML
    void retrocederHorario(ActionEvent event) {
        System.out.println("Event Button Retroceder Horario");

    }

    @FXML
    void retrocederMinutero(ActionEvent event) {
        System.out.println("Event Button Retroceder Minutero");

    }

    @FXML
    void retrocederSegundero(ActionEvent event) {
        System.out.println("Event Button Retroceder Segundero");

    }

    @FXML
    void initialize() {
        assert cmdAdelantaHora != null : "fx:id=\"cmdAdelantaHora\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert cmdAdelantaMinuto != null : "fx:id=\"cmdAdelantaMinuto\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert cmdAdelantaSegundo != null : "fx:id=\"cmdAdelantaSegundo\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert cmdRetrocedeHora != null : "fx:id=\"cmdRetrocedeHora\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert cmdRetrocedeMinuto != null : "fx:id=\"cmdRetrocedeMinuto\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert cmdRetrocedeSegundo != null : "fx:id=\"cmdRetrocedeSegundo\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert imgTales != null : "fx:id=\"imgTales\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert lbHorario != null : "fx:id=\"lbHorario\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert lbMinutero != null : "fx:id=\"lbMinutero\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert lbSegundero != null : "fx:id=\"lbSegundero\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert lblHoras != null : "fx:id=\"lblHoras\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert lblMinutos != null : "fx:id=\"lblMinutos\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert lblSegundos != null : "fx:id=\"lblSegundos\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert txtHora != null : "fx:id=\"txtHora\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert txtMinuto != null : "fx:id=\"txtMinuto\" was not injected: check your FXML file 'vistaReloj.fxml'.";
        assert txtSegundo != null : "fx:id=\"txtSegundo\" was not injected: check your FXML file 'vistaReloj.fxml'.";

    }

}

