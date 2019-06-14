package org.academidecodigo.bootcamp.mapeditor.cels;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cursor extends Cell {


    public Cursor (int row, int col) {
        super(row,col);
        super.row = 0;
        super.col = 0;
        super.rectangle.setColor(Color.MAGENTA);
        super.rectangle.fill();

    }

    public void moveRight() {
        super.col = col++;
    }

    public void moveLeft() {
        super.col = col--;
    }

    public void moveUp() {
        super.row = row--;
    }

    public void moveDown() {
        super.row = row++ ;
    }

}
