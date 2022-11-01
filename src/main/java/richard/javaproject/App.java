package richard.javaproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));
        
        stage.setTitle("FXML Welcome!!!!");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }

      public static void main(String[] args) {
        launch();
    }

}