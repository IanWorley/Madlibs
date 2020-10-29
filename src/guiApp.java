import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class guiApp extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        phrase.isGui = true;
        stage.setTitle("madlibs");
        VBox root = new VBox();
        Label firstLabel = new Label();
        proNoun proNoun = new proNoun();
        firstLabel.setText(proNoun.giveQuestion());
        TextField textField = new TextField();
        Button submitButton = new Button("submit");
        submitButton.setOnAction(e -> {
            proNoun.setPharse(textField.getText());
            textField.setText("");
        });
        root.getChildren().addAll(firstLabel, textField,submitButton);
        Scene scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();

    }


}
