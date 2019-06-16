package org.academiadecodigo.bootcamp.mapeditor;


public class Main {
    public static void main(String[] args) {


        MapEditor mapEditor = new MapEditor(30,30);
        new MapEditorKeyboardHandler(mapEditor);


    }
}
