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
    public Snake(){
        head = new Coordinate(5,5);

    }

    public void update(){
        head.x++;
    }

    public Coordinate getHead() {
        return head;
    }

    public Pane getHeadBlock() {
        return headBlock;
    }
}
