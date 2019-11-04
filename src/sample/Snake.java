package sample;

import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.LinkedList;

public class Snake {
    private Coordinate head;
    private LinkedList<Coordinate> blockPosition;
    private int length;
    private Coordinate initial;
    private Boolean shouldGrow = false;
    private String direction = "RIGHT";
    //Arraylist for snake position, need to create nested for loop to add all panes back in after clearing.
    //Otherwise relative positioning not maintained.
    //Make new blank pane array and color panes according to position array.


    public Snake(){
        length = 5;
        initial = new Coordinate(5,5);
        blockPosition = new LinkedList<Coordinate>();
        head = new Coordinate(initial.x,initial.y);
        blockPosition.add(head);
        //blockPosition.add(new Coordinate(initial.x,initial.y));
    }

    public void update(String command){
        switch (command) {
            case "UP":
                this.direction = "UP";
                break;
            case "DOWN":
                this.direction = "DOWN";
                break;
            case "LEFT":
                this.direction = "LEFT";
                break;
            case "RIGHT":
                this.direction = "RIGHT";
                break;
        }
    }


    public void paint() {

        switch (this.direction) {
            case "UP":
                blockPosition.add(new Coordinate(head.x, head.y - 1));
                head.y--;
                break;
            case "DOWN":
                blockPosition.add(new Coordinate(head.x, head.y + 1));
                head.y++;
                break;
            case "LEFT":
                blockPosition.add(new Coordinate(head.x - 1, head.y));
                head.x--;
                break;
            case "RIGHT":
                blockPosition.add(new Coordinate(head.x + 1, head.y));
                head.x++;
                break;
        }
        if (shouldGrow) {
            shouldGrow = false;
            return;
        } else {
            blockPosition.removeFirst();
        }
        //shouldGrow=false;
    }


    public String getDirection(){
        return direction;
    }

    public void grow(){
        //blockPosition.add(new Coordinate(getHead().x-1, getHead().y-1));
    }

    public Coordinate getHead() {
        return head;
    }


    public LinkedList<Coordinate> getBlockPosition() {
        return blockPosition;
    }

    public void setBlockPosition(LinkedList<Coordinate> blockPosition) {
        this.blockPosition = blockPosition;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setShouldGrow(Boolean shouldGrow) {
        this.shouldGrow = shouldGrow;
    }

    public int getLength() {
        return length;
    }

    public void up(){

    }
    public void down(){

    }
    public void left(){

    }
    public void right(){

    }
}
