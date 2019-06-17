package org.academiadecodigo.bootcamp.mapeditor.cels;

import org.academiadecodigo.simplegraphics.graphics.Color;


public class Cursor extends Cell {


    public Cursor (int row, int col) {
        super(row,col);
        this.row = row;
        this.col = col;
        super.rectangle.setColor(Color.MAGENTA);
        super.rectangle.fill();

    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public void moveRight() {
        if (!(col >= 29)) {
            rectangle.translate(20, 0);
            col++;
        }
    }

    public void moveLeft() {
        if (!(col <= 0)) {
            col--;
            rectangle.translate(-20, 0);
        }
    }

    public void moveUp() {
        if (!(row <= 0)) {
            row--;
            rectangle.translate(0, -20);
        }
    }

    public void moveDown() {
        if (!(row >= 29)) {
            row++;
            rectangle.translate(0, 20);
        }
    }

}
