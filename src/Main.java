import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Stack;


public class Main extends Application {

    Stage window;
    Scene scene1, scene2;


    public static void main(String[] args) {

        launch(args);

    }

    /**
     * Creating alert boxes
     */



    /**
     * Switching between scenes
     */

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;

        Label label1 = new Label("Welcome to Scene 1.");
        Button button1 = new Button("Go to Scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        // Layout 1 - children in column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        // Button 2
        Button button2 = new Button("Go back to Scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        // Layout 2 - children
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 200, 300);

        window.setScene(scene1);
        window.setTitle("TITLE HERE");
        window.show();

    }

    /**
     * Creating scenes + buttons
     */

    //    @Override
//    public void start(Stage stage) throws Exception {
//
//        stage.setTitle("Window Title");
//        button = new Button("Click here");
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("Hey, you clicked me.");
//            }
//        });

//        LAMBDA EXPRESSION:
//        button.setOnAction(e -> System.out.println("Hey, you clicked me."));

//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//
//        Scene scene = new Scene(layout, 300, 250);
//        stage.setScene(scene);
//        stage.show();
//
//
//    }

//    @Override
//    public void handle(ActionEvent actionEvent) {
//        if (actionEvent.getSource() == button) {
//            System.out.println("Hey, you clicked me.");
//        }
//
//    }
}
