package sample;

import javafx.geometry.Insets;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class GameBoard extends GridPane {
    Pane[][] blockList;
    Snake snake;
    int width = 30;
    int height = 30;

    public GameBoard(){
        super();
        this.snake = new Snake();
        this.setHgap(2);
        this.setVgap(2);


    }

    public void update(){
        Pane headBlock = new Pane();
        headBlock.setBackground(new Background(new BackgroundFill(Color.web("#"+"33cc33"), CornerRadii.EMPTY, Insets.EMPTY)));
        headBlock.setMinSize(20,20);
        snake.update();
        this.add(headBlock,snake.getHead().x,snake.getHead().y);
        System.out.println(snake.getHead().x);
    }

}
