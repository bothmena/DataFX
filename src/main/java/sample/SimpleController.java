package sample;

import io.datafx.controller.FXMLController;
import io.datafx.controller.flow.action.ActionMethod;
import io.datafx.controller.flow.action.ActionTrigger;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.annotation.PostConstruct;

@FXMLController("simpleView.fxml")
public class SimpleController {

    @FXML
    private Label label;

    @FXML
    @ActionTrigger("btn-clicked")
    private Button button;

    private int clickCount = 0;

    @PostConstruct
    public void init() {
        label.setText("Button was clicked " + clickCount + " times");
    }

    @ActionMethod("btn-clicked")
    public void btnClicked() {
        clickCount++;
        label.setText("Button was clicked " + clickCount + " times");
    }
}
