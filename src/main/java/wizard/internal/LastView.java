package wizard.internal;

import io.datafx.controller.FXMLController;
import io.datafx.controller.flow.action.LinkAction;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.annotation.PostConstruct;

/**
 * Created by aymen on 10/08/16.
 */

@FXMLController( value = "wizard/lastView.fxml", title = "Wizard: Done")
public class LastView {

    @FXML private Label label;

    @FXML
    private Button next;

    @FXML
    @LinkAction( ViewOne.class )
    private Button back;

    @FXML
    private Button finish;

    @PostConstruct
    public void init() {
        label.setText( "Great! you're done." );
        next.setDisable(true);
        finish.setDisable(true);
        back.setText("Repeat");
    }
}
