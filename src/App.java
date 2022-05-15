import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
        //            "vmArgs": "--module-path C:/Users/Dell/Documents/openjfx-18.0.1_windows-x64_bin-sdk/javafx-sdk-18.0.1/lib --add-modules javafx.controls,javafx.fxml"

    }

    @Override
    public void start(Stage primary) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Scene scene = new Scene(root);
        primary.setTitle("accountant");
        primary.setScene(scene);
        primary.show();
    
    }

}
