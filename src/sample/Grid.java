package sample;

import javafx.scene.canvas.GraphicsContext;

public class Grid {
    private final int size = 20;
    private final int gridSize = 35;
    private final int blockSize = 5;
    private Coordinate coord;
    private Cell[][] cells = new Cell[size][size];

    private final int rows;
    private final int cols;

    public Grid(Coordinate coord, int width, int height) {
        this.rows = width/blockSize;
        this.cols = height/blockSize;
        this.coord = coord;
        populateGrid(width, height);
    }

    public void populateGrid(int x, int y){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell(x + j * gridSize, y + i * gridSize, gridSize, gridSize);
            }
        }
    }

    public void paint(GraphicsContext gc){

    }

}
