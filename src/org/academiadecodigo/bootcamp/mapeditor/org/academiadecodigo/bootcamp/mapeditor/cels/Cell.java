package org.academiadecodigo.bootcamp.mapeditor.org.academiadecodigo.bootcamp.mapeditor.cels;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cell {

    protected int row;
    protected int col;
    protected Rectangle rectangle;
    private boolean painted;


    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.painted = painted;
        this.rectangle = new Rectangle (10+row*20, 10+col*20, 20,20 );
        rectangle.draw();

    }


    public boolean isPainted() {
        return this.painted;
    }


}
