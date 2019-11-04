package sample;

public class Coordinate {
    public int x;
    public int y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Coordinate coordinate = (Coordinate) obj;
        return x == coordinate.x && y == coordinate.y;
    }
}
