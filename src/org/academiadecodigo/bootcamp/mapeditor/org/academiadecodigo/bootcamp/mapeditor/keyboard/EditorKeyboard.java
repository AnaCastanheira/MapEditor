package org.academiadecodigo.bootcamp.mapeditor.org.academiadecodigo.bootcamp.mapeditor.keyboard;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academidecodigo.bootcamp.mapeditor.cels.Cursor;

public class EditorKeyboard implements KeyboardHandler {

    private Cursor cursor;
    //private MapEditor mapEditor;

    public EditorKeyboard(Cursor cursor) {
        this.cursor = new Cursor (0,0);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
