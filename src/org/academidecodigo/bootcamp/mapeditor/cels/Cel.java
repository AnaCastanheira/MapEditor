package org.academidecodigo.bootcamp.mapeditor.cels;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Color;


public class Cel {


    protected int row;
    protected int col;
    protected int color;
    protected Rectangle rectangle;


    public Cel(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
        this.rectangle = rectangle;

    }


}
