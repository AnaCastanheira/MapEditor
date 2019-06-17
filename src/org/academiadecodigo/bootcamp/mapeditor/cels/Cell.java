package org.academiadecodigo.bootcamp.mapeditor.cels;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cell {

    protected int row;
    protected int col;
    protected Rectangle rectangle;
    private boolean painted;
    private int cellSize;
    private int padding;


    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.padding = 10;
        this.cellSize = 20;
        this.painted = false;
        this.rectangle = new Rectangle (padding+row*cellSize, padding+col*cellSize, cellSize,cellSize );
        rectangle.draw();

    }

    public boolean isPainted() {
        return painted;
    }

    public void paintRectangle() {
        rectangle.setColor(Color.BLACK);
        rectangle.fill();
        painted = true;
    }

    public void cleanRectangle() {
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
        painted = false;
    }









}
