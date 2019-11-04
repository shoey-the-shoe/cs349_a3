package sample;

import javafx.geometry.Insets;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class GameBoard extends GridPane {

    private Snake snake;
    private ArrayList<Fruit> fruits;
    private final int width = 500;
    private final int height = 500;
    private final int blockSize = 20;
    private final int rows = height/blockSize;
    private final int cols = width/blockSize;
    private int score;

    public GameBoard(Snake snake){
        super();
        this.snake = snake;
        score = 0;
        fruits = new ArrayList<Fruit>();
        fruits.add(new Fruit(new Coordinate(3,7)));
        fruits.add(new Fruit(new Coordinate(10,10)));
        fruits.add(new Fruit(new Coordinate(4,2)));
        fruits.add(new Fruit(new Coordinate(12,12)));
        this.setPrefSize(width,height);
        this.setBackground(new Background(new BackgroundFill(Color.web("#" + "000066"), CornerRadii.EMPTY, Insets.EMPTY)));
        for (int i = 0; i < rows; i++) {
            this.getRowConstraints().add(new RowConstraints(blockSize));
        }
        for (int j = 0; j < cols; j++) {
            this.getColumnConstraints().add(new ColumnConstraints(blockSize));
        }
        //this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    }

    public void update() {

        LinkedList<Coordinate> newBlockPosition = snake.getBlockPosition();
        for(Coordinate position : newBlockPosition){
            Pane block = new Pane();
            block.setBackground(new Background(new BackgroundFill(Color.web("#" + "33cc35"), CornerRadii.EMPTY, Insets.EMPTY)));
            block.setPrefSize(blockSize, blockSize);
            if(position.x>=0 && position.x<=cols
            && position.y>=0 && position.y<=rows){
                this.add(block,position.x,position.y);

            }
        }
        //newBlockPosition.set(1, new Coordinate(newBlockPosition.getFirst().x,newBlockPosition.getFirst().y));

        for (Fruit fruit : fruits) {
            if (fruit.getCoordinate().equals(snake.getBlockPosition().get(0)) && !fruit.isHidden()) {
                fruit.hide();
                snake.setShouldGrow(true);
                    score++;
                System.out.println(this.score);
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
        if(!(snake.getBlockPosition().getLast().x>=0 && snake.getBlockPosition().getLast().x <= cols
        && snake.getBlockPosition().getLast().y>=0 && snake.getBlockPosition().getLast().y <= rows)){
            System.out.println("out of bounds");
            System.exit(1);
        }
    }

    public Snake getSnake() {
        return snake;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }
}
