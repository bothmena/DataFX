package wizard.external;

import io.datafx.controller.flow.action.ActionTrigger;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Created by Aymen Ben Othmen on 10/08/16.
 */

public class AbstractView {

    @FXML private Label label;

    @FXML
    @ActionTrigger("next")
    private Button next;

    @FXML
    @ActionTrigger("back")
    private Button back;

    @FXML
    @ActionTrigger("finish")
    private Button finish;

    public Label getLabel() {
        return this.label;
    }

    public Button getNext() {
        return this.next;
    }

    public Button getBack() {
        return this.back;
    }

    public Button getFinish() {
        return this.finish;
    }
}
