package sample;

public class Fruit {
    private Coordinate coordinate;
    private Boolean hide = false;

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
