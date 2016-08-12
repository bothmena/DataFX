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

@FXMLController( value = "wizard/viewOne.fxml", title = "Wizard: Step One")
public class ViewOne {

    @FXML private Label label;

    @FXML
    @LinkAction( ViewTwo.class )
    private Button next;

    @FXML
    private Button back;

    @FXML
    @LinkAction( LastView.class )
    private Button finish;

    @PostConstruct
    public void init() {
        label.setText( "Welcome to the first step." );
        back.setDisable(true);
    }
}
