package sample;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Fruit {
    Coordinate coordinate;
    Boolean hide = false;

    public Fruit(Coordinate coordinate){
        super();
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void hide(){
        hide=true;
    }

    public boolean isHidden(){
        return this.hide;
    }
}
