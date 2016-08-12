package wizard.external;

import io.datafx.controller.FXMLController;
import javax.annotation.PostConstruct;

/**
 * Created by Aymen Ben Othmen on 10/08/16.
 */

@FXMLController( value = "viewThree.fxml", title = "Wizard: Step Three")
public class ViewThree extends AbstractView {

    @PostConstruct
    public void init() {
        getLabel().setText( "Still one more step to the end." );
    }
}
