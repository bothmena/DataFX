package wizard.internal;

import io.datafx.controller.flow.Flow;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        new Flow(ViewOne.class).startInStage(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
