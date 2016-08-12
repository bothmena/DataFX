package wizard.external;

import io.datafx.controller.flow.Flow;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        new Flow(ViewOne.class).
                withLink( ViewOne.class,   "next", ViewTwo.class   ).
                withLink( ViewTwo.class,   "next", ViewThree.class ).
                withLink( ViewThree.class, "next", LastView.class  ).
                withLink( LastView.class, "next", ViewOne.class  ).
                withGlobalBackAction("back").
                withGlobalLink("finish", LastView.class).
                startInStage(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
