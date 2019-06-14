package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academidecodigo.bootcamp.mapeditor.cels.Cursor;

public class MapEditor {


    private Field field;
    private Cursor cursor;


    public MapEditor() {
        this.field = new Field(30, 30);
        this.cursor = new Cursor(0, 0);

    }


    public void initi() {

    }

}
