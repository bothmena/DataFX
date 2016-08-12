package tuto6;

import io.datafx.controller.FXMLController;
import io.datafx.controller.flow.FlowException;
import io.datafx.controller.flow.action.ActionMethod;
import io.datafx.controller.flow.action.ActionTrigger;
import io.datafx.controller.flow.context.ActionHandler;
import io.datafx.controller.flow.context.FlowActionHandler;
import io.datafx.controller.util.VetoException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javax.annotation.PostConstruct;

/**
 * Created by Aymen Ben Othmen on 11/08/16.
 */

@FXMLController(value = "masterView.fxml", title = "Main view")
public class MasterView {

    @FXML
    @ActionTrigger("navigate")
    private Button button;

    @ActionHandler
    private FlowActionHandler actionHandler;

    @FXML
    private ComboBox<String> comboBox;

    @PostConstruct
    public void init() {

        comboBox.getItems().addAll(
                "First View",
                "Second View",
                "Third View"
        );
    }

    @ActionMethod("navigate")
    public void navigate() throws FlowException, VetoException {

        try {
            switch ( comboBox.getValue() ) {

                case "First View":
                    actionHandler.navigate( ViewOneController.class );
                    break;
                case "Second View":
                    actionHandler.navigate( ViewTwoController.class );
                    break;
                case "Third View":
                    actionHandler.navigate( ViewThreeController.class );
                    break;
                default:
                    System.out.println( "Please select a view first." );
            }
        } catch ( NullPointerException e ) {
            System.out.println( "Please select a view first." );
        }
    }
}
