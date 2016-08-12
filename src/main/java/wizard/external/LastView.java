package wizard.external;

import io.datafx.controller.FXMLController;
import javax.annotation.PostConstruct;

/**
 * Created by Aymen Ben Othmen on 10/08/16.
 */

@FXMLController( value = "lastView.fxml", title = "Wizard: Done")
public class LastView extends AbstractView {

    @PostConstruct
    public void init() {
        getLabel().setText( "Great! you're done." );
        getBack().setDisable(true);
        getFinish().setDisable(true);
        getNext().setText("Repeat");
    }
}
