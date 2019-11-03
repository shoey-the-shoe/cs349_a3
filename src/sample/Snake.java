package sample;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Snake {
    Pane headBlock;
    Coordinate head;
    ArrayList<Coordinate> blockPosition;
    String direction;


    public Snake(){
        head = new Coordinate(5,5);


    }

    public void update(String command){
        switch (command){
            case "UP":
                headBlock = new Pane();
                headBlock.setBackground(new Background(new BackgroundFill(Color.web("#"+"33cc33"), CornerRadii.EMPTY, Insets.EMPTY)));
                headBlock.setMinSize(20,20);
                head.y--;
                break;
            case "DOWN":
                headBlock = new Pane();
                headBlock.setBackground(new Background(new BackgroundFill(Color.web("#"+"33cc33"), CornerRadii.EMPTY, Insets.EMPTY)));
                headBlock.setMinSize(20,20);
                head.y++;
                break;
            case "LEFT":
                headBlock = new Pane();
                headBlock.setBackground(new Background(new BackgroundFill(Color.web("#"+"33cc33"), CornerRadii.EMPTY, Insets.EMPTY)));
                headBlock.setMinSize(20,20);
                head.x--;
                break;
            case "RIGHT":
                headBlock = new Pane();
                headBlock.setBackground(new Background(new BackgroundFill(Color.web("#"+"33cc33"), CornerRadii.EMPTY, Insets.EMPTY)));
                headBlock.setMinSize(20,20);
                head.x++;
                break;

        }
//        headBlock = new Pane();
//        headBlock.setBackground(new Background(new BackgroundFill(Color.web("#"+"33cc33"), CornerRadii.EMPTY, Insets.EMPTY)));
//        headBlock.setMinSize(20,20);
//        head.x++;

    }

    public Coordinate getHead() {
        return head;
    }

    public Pane getHeadBlock() {
        return headBlock;
    }
}
