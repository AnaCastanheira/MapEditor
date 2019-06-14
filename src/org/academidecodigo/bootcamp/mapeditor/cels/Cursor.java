package org.academidecodigo.bootcamp.mapeditor.cels;

import org.academidecodigo.bootcamp.mapeditor.cels.Cel;

public class Cursor extends Cel {


    public Cursor () {
        super();
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
