package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academidecodigo.bootcamp.mapeditor.cels.Cursor;

public class Keyboard implements KeyboardHandler {

    private Cursor cursor;
    private MapEditor mapEditor;

    public Keyboard (Cursor cursor) {
        this.mapEditor = mapEditor;
        this.cursor = new Cursor (0,0 );
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        int key = keyboardEvent.getKey();

        switch (key) {

            case KeyboardEvent.KEY_RIGHT:
                cursor.moveRight();
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.moveLeft();
                break;
            case KeyboardEvent.KEY_DOWN:
                cursor.moveDown();
                break;
            case KeyboardEvent.KEY_UP:
                cursor.moveUp();
                break;
            case KeyboardEvent.KEY_SPACE:
                //if celula não pintada, pintar;
                // se célula pintada, tirar cor;
                break;
        }
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
