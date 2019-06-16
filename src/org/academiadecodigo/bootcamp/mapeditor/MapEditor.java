package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.bootcamp.mapeditor.org.academiadecodigo.bootcamp.mapeditor.cels.Cursor;

public class MapEditor {


    protected Field field;
    protected Cursor cursor;



    public MapEditor(int nrOfRows, int nrOfCols) {
        this.field = new Field(nrOfRows,nrOfCols);
        this.cursor = new Cursor(0, 0);

    }


    public void initi() {





    }

}
