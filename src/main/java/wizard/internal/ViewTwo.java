package wizard.internal;

import io.datafx.controller.FXMLController;
import io.datafx.controller.flow.action.BackAction;
import io.datafx.controller.flow.action.LinkAction;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.annotation.PostConstruct;

/**
 * Created by aymen on 10/08/16.
 */

@FXMLController( value = "wizard/viewTwo.fxml", title = "Wizard: Step Two")
public class ViewTwo {

    @FXML private Label label;

    @FXML
    @LinkAction( ViewThree.class )
    private Button next;

    @FXML
    @BackAction
    private Button back;

    @FXML
    @LinkAction( LastView.class )
    private Button finish;

    @PostConstruct
    public void init() {
        label.setText( "Welcome to the second step." );
    }
}
