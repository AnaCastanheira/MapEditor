package org.academiadecodigo.bootcamp.mapeditor.org.academiadecodigo.bootcamp.mapeditor.cels;

import org.academiadecodigo.simplegraphics.graphics.Color;


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
        rectangle.translate(20,0);
    }

    public void moveLeft() {
        super.col = col--;
        rectangle.translate(-20,0);
    }

    public void moveUp() {
        super.row = row--;
        rectangle.translate(0,-20);
    }

    public void moveDown() {
        super.row = row++ ;
        rectangle.translate(0,20);
    }

}
