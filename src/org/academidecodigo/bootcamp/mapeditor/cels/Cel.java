package org.academidecodigo.bootcamp.mapeditor.cels;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Color;


public class Cel {


    protected int row;
    protected int col;
    protected Rectangle rectangle;


    public Cel(int row, int col) {
        this.row = row;
        this.col = col;
        this.rectangle = new Rectangle (row, col, );

    }


}
