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


@FXMLController( value = "wizard/viewThree.fxml", title = "Wizard: Step Three")
public class ViewThree {

    @FXML private Label label;

    @FXML
    @LinkAction( LastView.class )
    private Button next;

    @FXML
    @BackAction
    private Button back;

    @FXML
    @LinkAction( LastView.class )
    private Button finish;

    @PostConstruct
    public void init() {
        label.setText( "Still one more step to the end." );
    }
}
