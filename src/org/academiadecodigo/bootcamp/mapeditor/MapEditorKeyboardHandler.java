package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.bootcamp.mapeditor.MapEditor;
import org.academiadecodigo.bootcamp.mapeditor.org.academiadecodigo.bootcamp.mapeditor.cels.Cursor;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MapEditorKeyboardHandler implements KeyboardHandler {

    private Keyboard keyboard;
    private MapEditor mapEditor;
    //private Cursor cursor;



    public MapEditorKeyboardHandler(MapEditor mapEditor){

        this.mapEditor = mapEditor;
        //this.cursor = cursor;
        keyboard = new Keyboard(this);
        addKeysAndEvents();
    }



    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()){

            case KeyboardEvent.KEY_RIGHT:
                 mapEditor.cursor.moveRight();
            break;

            case KeyboardEvent.KEY_LEFT:
                 mapEditor.cursor.moveLeft();
            break;

            case KeyboardEvent.KEY_UP:
                 mapEditor.cursor.moveUp();
            break;

            case KeyboardEvent.KEY_DOWN:
                 mapEditor.cursor.moveDown();
            break;
/*
            case KeyboardEvent.KEY_SPACE:

                 break;
*/
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


    private void setKeyAndEvent(int key, KeyboardEventType type){
        KeyboardEvent event = new KeyboardEvent();
        event.setKey(key);
        event.setKeyboardEventType(type);
        keyboard.addEventListener(event);
    }


    private void addKeysAndEvents(){

        setKeyAndEvent(KeyboardEvent.KEY_SPACE, KeyboardEventType.KEY_PRESSED);

        setKeyAndEvent(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);

        setKeyAndEvent(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);

        setKeyAndEvent(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);

        setKeyAndEvent(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);

    }

}
