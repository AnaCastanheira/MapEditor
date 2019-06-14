package org.academidecodigo.bootcamp.mapeditor.cels;

public class Cursor extends Cell {


    public Cursor () {
        super(10,10);
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
