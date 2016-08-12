package tuto5;

import io.datafx.controller.flow.Flow;
import io.datafx.controller.flow.FlowHandler;
import io.datafx.controller.flow.container.DefaultFlowContainer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Flow flow = new Flow( ViewController.class );
        FlowHandler handler = flow.createHandler();
        StackPane pane = handler.start( new DefaultFlowContainer() );
        primaryStage.setScene( new Scene( pane ));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
