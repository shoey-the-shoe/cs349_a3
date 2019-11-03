package sample;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Rectangle;

public class Cell extends Rectangle {
    private static final int width = 5;
    private static final int height = 5;

    public Cell(int x, int y, int width, int height){
        super(x, y, width, height);
    }

//    public static void setCoord(Coordinate coord) {
//        Cell.coord = coord;
//    }
//
//    public Coordinate getCoord() {
//        return coord;
//    }

    public void paint(GraphicsContext gc){}
}


