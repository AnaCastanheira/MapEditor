package org.academidecodigo.bootcamp.mapeditor.cels;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Color;


public class Cell {


    protected int row;
    protected int col;
    protected Rectangle rectangle;
    private boolean painted;


    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.painted = painted;
        this.rectangle = new Rectangle (row*10, col*10, 10,10 );

    }

    public boolean isPainted() {
        return this.painted;
    }


}
