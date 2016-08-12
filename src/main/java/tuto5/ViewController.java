package tuto5;


import io.datafx.controller.FXMLController;
import io.datafx.controller.flow.Flow;
import io.datafx.controller.flow.FlowException;
import io.datafx.controller.flow.FlowHandler;
import io.datafx.controller.flow.action.ActionMethod;
import io.datafx.controller.flow.action.ActionTrigger;
import io.datafx.controller.flow.container.AnimatedFlowContainer;
import io.datafx.controller.util.VetoException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import javax.annotation.PostConstruct;

/**
 * Created by Aymen Ben Othmen on 10/08/16.
 */

@FXMLController( value = "view.fxml", title = "Home page")
public class ViewController {

    @FXML private StackPane centerPane;
    private FlowHandler innerFlowHandler;

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

    @PostConstruct
    public void init() throws FlowException {

        Flow innerFlow = new Flow( ViewOneController.class ).
                withLink( ViewOneController.class,   "next", ViewTwoController.class   ).
                withLink( ViewTwoController.class,   "next", ViewThreeController.class ).
                withLink( ViewThreeController.class, "next", LastViewController.class  ).
                withLink( LastViewController.class, "next", ViewOneController.class  );

        innerFlowHandler = innerFlow.createHandler();
        centerPane.getChildren().add( innerFlowHandler.start( new AnimatedFlowContainer(Duration.millis( 350 ))) );
    }

    @ActionMethod("back")
    public void onBack() throws VetoException, FlowException {
        innerFlowHandler.navigateBack();
        //setLabel( innerFlowHandler.getCurrentViewControllerClass() );
        if(innerFlowHandler.getCurrentViewControllerClass().equals(ViewOneController.class)) {
                back.setDisable(true);
        } else {
            back.setDisable(false);
        }
        finish.setDisable(false);
        next.setDisable(false);
    }

    @ActionMethod("next")
    public void onNext() throws VetoException, FlowException {
        innerFlowHandler.handle("next");
        //setLabel( innerFlowHandler.getCurrentViewControllerClass() );
        if(innerFlowHandler.getCurrentViewControllerClass().equals(LastViewController.class)) {
            next.setDisable(true);
            finish.setDisable(true);
        } else {
            next.setDisable(false);
        }
        back.setDisable(false);
    }

    @ActionMethod("finish")
    public void onFinish() throws VetoException, FlowException {
        innerFlowHandler.navigateTo(LastViewController.class);
        //setLabel( LastViewController.class );
        finish.setDisable(true);
        next.setDisable(true);
        back.setDisable(false);
    }

    /*private void setLabel( Class aClass) {

        if ( aClass.equals( ViewOneController.class ) )
            this.label.setText( "Welcome to the first step." );
        else if ( aClass.equals( ViewTwoController.class ) )
            this.label.setText( "Welcome to the second step." );
        else if ( aClass.equals( ViewThreeController.class ) )
            this.label.setText( "Still one more step to the end." );
        else if ( aClass.equals( LastViewController.class ) )
            this.label.setText( "Great! you're done." );
    }*/
}
