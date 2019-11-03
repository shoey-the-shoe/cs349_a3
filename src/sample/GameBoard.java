package sample;

import javafx.geometry.Insets;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class GameBoard extends GridPane {
    Pane[][] blockList;
    Snake snake;
    double width = 600;
    double height = 600;

    public GameBoard(Snake snake){
        super();
        this.snake = snake;
        this.setPrefSize(width,height);
        this.setHgap(2);
        this.setVgap(2);
    }

    public void update(){
        this.add(snake.getHeadBlock(),snake.getHead().x,snake.getHead().y);
        System.out.println(snake.getHead().x);
    }

    public Snake getSnake() {
        return snake;
    }
}
