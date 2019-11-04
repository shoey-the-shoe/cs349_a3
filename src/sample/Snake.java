package sample;

import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.LinkedList;

public class Snake {
    Pane headBlock;
    Coordinate head;
    LinkedList<Coordinate> blockPosition;
    Coordinate nextCoordinate;
    //Arraylist for snake position, need to create nested for loop to add all panes back in after clearing.
    //Otherwise relative positioning not maintained.
    //Make new blank pane array and color panes according to position array.
    String direction = "RIGHT";


    public Snake(){
        head = new Coordinate(5,5);
        nextCoordinate = head;
        blockPosition = new LinkedList<Coordinate>();
        blockPosition.add(head);
    }

    public void update(String command){
        switch (command){
            case "UP":
                this.direction="UP";
                break;
            case "DOWN":
                this.direction="DOWN";
                break;
            case "LEFT":
                this.direction="LEFT";
                break;
            case "RIGHT":
                this.direction="RIGHT";
                break;
        }
    }

    public void paint(){
        switch (this.direction){
            case "UP":
                head.y--;
                break;
            case "DOWN":
                head.y++;
                break;
            case "LEFT":
                head.x--;
                break;
            case "RIGHT":
                head.x++;
                break;
        }
    }

    public String getDirection(){
        return direction;
    }

    public Coordinate getHead() {
        return head;
    }

    public Pane getHeadBlock() {
        return headBlock;
    }

    public LinkedList<Coordinate> getBlockPosition() {
        return blockPosition;
    }

    public void setBlockPosition(LinkedList<Coordinate> blockPosition) {
        this.blockPosition = blockPosition;
    }
}
