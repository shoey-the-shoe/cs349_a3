package sample;

import javafx.geometry.Insets;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class GameBoard extends GridPane {

    Snake snake;
    ArrayList<Fruit> fruits;
    int width = 500;
    int height = 500;
    int blockSize = 20;
    int rows = height/blockSize;
    int cols = width/blockSize;

    public GameBoard(Snake snake){
        super();
        this.snake = snake;
        fruits = new ArrayList<Fruit>();
        fruits.add(new Fruit(new Coordinate(3,7)));
        fruits.add(new Fruit(new Coordinate(10,10)));
        this.setPrefSize(width,height);
        this.setBackground(new Background(new BackgroundFill(Color.web("#" + "000066"), CornerRadii.EMPTY, Insets.EMPTY)));
        for (int i = 0; i < rows; i++) {
            this.getRowConstraints().add(new RowConstraints(blockSize));
        }

        for (int j = 0; j < cols; j++) {
            this.getColumnConstraints().add(new ColumnConstraints(blockSize));
        }
        this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    }

    public void update() {
        LinkedList<Coordinate> newBlockPosition = snake.getBlockPosition();
        for(Coordinate position : snake.getBlockPosition()){
            Pane block = new Pane();
            block.setBackground(new Background(new BackgroundFill(Color.web("#" + "33cc35"), CornerRadii.EMPTY, Insets.EMPTY)));
            block.setPrefSize(blockSize, blockSize);
            this.add(block,position.x,position.y);
        }

        for (Fruit fruit : fruits) {
            if (fruit.getCoordinate().equals(snake.getHead())) {
                fruit.hide();
            }
        }

        for (Fruit fruit : fruits) {
            if(!fruit.isHidden()) {
                Pane block = new Pane();
                block.setBackground(new Background(new BackgroundFill(Color.web("#" + "ff0000"), CornerRadii.EMPTY, Insets.EMPTY)));
                block.setPrefSize(blockSize, blockSize);
                this.add(block, fruit.getCoordinate().x, fruit.getCoordinate().y);
            }
        }







            //System.out.println(snake.getHead().x);
    }



    public Snake getSnake() {
        return snake;
    }
}
