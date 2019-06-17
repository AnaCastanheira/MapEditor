package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.bootcamp.mapeditor.org.academiadecodigo.bootcamp.mapeditor.cels.Cursor;

public class MapEditor {


    private Field field;
    private Cursor cursor;


    public MapEditor(int nrOfRows, int nrOfCols) {
        this.field = new Field(nrOfRows,nrOfCols);
        this.cursor = new Cursor(0, 0);

    }

    public void goRight() {
        cursor.moveRight();
    }

    public void goLeft() {
        cursor.moveLeft();
    }

    public void goUp() {
        cursor.moveUp();
    }

    public void goDown() {
        cursor.moveDown();
    }

    public void changeColor() {
        field.changeCellColor(cursor.getCol(), cursor.getRow());
    }











}
