package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application implements EventHandler<ActionEvent> {


    /*
    @Override
    public void start(Stage stage) throws IOException {

        StackPane root = new StackPane();

        Scene scene = new Scene(root);

       TextField keyPressed = new TextField();

        Button btn = new Button ("click me ");

        btn.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event){
                System.out.println(" حماااااااااار ");
            }

        });


        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                keyPressed.setText("Key Pressed: " + ke.getCode());
            }
        });




        root.getChildren().addAll(btn);
        root.getChildren().add(keyPressed);
        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }
*/
    public void start(Stage stage) throws IOException{

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        Label heading = new Label("Press Key");
        Label keyPressed = new Label();
        root.getChildren().addAll(heading, keyPressed);
        Scene scene = new Scene(root, 400, 300);


        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
         /*       if(ke.getCode() == KeyCode.ESCAPE){  heading.setText("Good Monkey");}
                if(ke.getCode() == KeyCode.A){  heading.setText("Good A");}
                if(ke.getCode() == KeyCode.B){  heading.setText("Good B");}
                if(ke.getCode() == KeyCode.C){  heading.setText("Good CMonkey");}
                if(ke.getCode() == KeyCode.D){  heading.setText("Good DMonkey");}
                if(ke.getCode() == KeyCode.E){  heading.setText("Good EMonkey");}
                if(ke.getCode() == KeyCode.F){  heading.setText("Good FMonkey");}
                if(ke.getCode() == KeyCode.G){  heading.setText("Good GMonkey");}
                if(ke.getCode() == KeyCode.H){  heading.setText("Good HMonkey");}
                if(ke.getCode() == KeyCode.I){  heading.setText("Good IMonkey");}
                if(ke.getCode() == KeyCode.J){  heading.setText("Good JMonkey");}
                if(ke.getCode() == KeyCode.K){  heading.setText("Good KMonkey");}
                if(ke.getCode() == KeyCode.L){  heading.setText("Good LMonkey");}
                if(ke.getCode() == KeyCode.N){  heading.setText("Good MMonkey");}
                if(ke.getCode() == KeyCode.O){  heading.setText("Good NMonkey");}
                if(ke.getCode() == KeyCode.P){  heading.setText("Good OMonkey");}
                if(ke.getCode() == KeyCode.Q){  heading.setText("Good PMonkey");}
                if(ke.getCode() == KeyCode.R){  heading.setText("Good QMonkey");}
                if(ke.getCode() == KeyCode.S){  heading.setText("Good RMonkey");}
                if(ke.getCode() == KeyCode.S){  heading.setText("Good SMonkey");}
                if(ke.getCode() == KeyCode.T){  heading.setText("Good TMonkey");}
                if(ke.getCode() == KeyCode.U){  heading.setText("Good UMonkey");}
                if(ke.getCode() == KeyCode.V){  heading.setText("Good VMonkey");}
                if(ke.getCode() == KeyCode.W){  heading.setText("Good WMonkey");}
                if(ke.getCode() == KeyCode.X){  heading.setText("Good XMonkey");}
                if(ke.getCode() == KeyCode.Y){  heading.setText("Good YMonkey");}
                if(ke.getCode() == KeyCode.Z){  heading.setText("Good ZMonkey");}

                if(ke.getCode() == KeyCode.ENTER){  a.setText("Good ZMonkey");}*/

                keyPressed.setText("Key Pressed: " + ke.getCode());
            }
        });

        stage.setTitle("get the key code");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {

    }
}
