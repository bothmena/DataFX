package wizard.external;

import io.datafx.controller.FXMLController;
import javax.annotation.PostConstruct;

/**
 * Created by Aymen Ben Othmen on 10/08/16.
 */

@FXMLController( value = "viewOne.fxml", title = "Wizard: Step One")
public class ViewOne extends AbstractView {

    @PostConstruct
    public void init() {
        getLabel().setText( "Welcome to the first step." );
        getBack().setDisable(true);
    }
}
