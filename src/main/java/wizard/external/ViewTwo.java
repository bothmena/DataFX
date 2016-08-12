package wizard.external;

import io.datafx.controller.FXMLController;
import javax.annotation.PostConstruct;

/**
 * Created by Aymen Ben Othmen on 10/08/16.
 */

@FXMLController( value = "viewTwo.fxml", title = "Wizard: Step Two")
public class ViewTwo extends AbstractView {

    @PostConstruct
    public void init() {
        getLabel().setText( "Welcome to the second step." );
    }
}
