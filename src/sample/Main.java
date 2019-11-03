package sample;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Snake snake = new Snake();
        GameBoard board = new GameBoard(snake);
        Scene scene = new Scene(board);
        //root.getChildren().add(board);
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {


        }));
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:
                        snake.update("UP");
                        break;
                    case DOWN:
                        snake.update("DOWN");
                        break;
                    case LEFT:
                        snake.update("LEFT");
                        break;
                    case RIGHT:
                        snake.update("RIGHT");
                        break;
                }
                board.update();
            }
        });
        timeline.setCycleCount(5);
        timeline.play();

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
