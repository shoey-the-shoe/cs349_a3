package sample;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Snake snake = new Snake();
        GameBoard board = new GameBoard(snake);
        Scene level1 = new Scene(board);
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.25), event -> {
            snake.paint();
            board.getChildren().clear();
            board.update();
            System.out.println();
        }));
        level1.setOnKeyPressed(new EventHandler<KeyEvent>() {
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
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        //timeline.setOnFinished(actionEvent -> );
        //Gameboard constructor needs to be changed to support different level types.
        primaryStage.setTitle("SNAKE");
        primaryStage.setScene(level1);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
