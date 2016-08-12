package sample;

import javafx.application.Application;
import io.datafx.controller.flow.Flow;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        new Flow(SimpleController.class).startInStage(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
