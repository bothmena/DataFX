package tuto6;

import io.datafx.controller.FXMLController;
import io.datafx.controller.flow.action.BackAction;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Created by Aymen Ben Othmen on 10/08/16.
 */

@FXMLController( value = "viewTwo.fxml", title = "Wizard: Step Two")
public class ViewTwoController {

    @FXML
    @BackAction
    private Button back;
}
