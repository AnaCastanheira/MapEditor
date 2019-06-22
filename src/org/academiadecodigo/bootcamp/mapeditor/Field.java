package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.bootcamp.mapeditor.cels.Cell;

import java.io.*;


public class Field {


    private Cell[][] grid;
    private int nrOfRows;
    private int nrOfCols;


    public Field(int nrOfRows, int nrOfCols) {

        this.nrOfRows = nrOfRows;
        this.nrOfCols = nrOfCols;
        this.grid = gridConstruction(nrOfRows, nrOfCols);

    }


    public Cell[][] gridConstruction(int nrOfRows, int nrOfCols) {

        Cell[] rows = new Cell[nrOfRows];
        Cell[] cols = new Cell[nrOfCols];
        Cell[][] grid = new Cell[nrOfRows][nrOfCols];

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < cols.length; j++) {
                grid[i][j] = new Cell(i, j);
            }
        }
        return grid;

    }

    public void changeCellColor(int row, int col) {

        if (!(grid[row][col].isPainted())) {
            grid[row][col].paintRectangle();
            return;
        }
        grid[row][col].cleanRectangle();

    }


    public void clearAll() {

        for (int i = 0; i < nrOfRows; i++) {
            for (int j = 0; j < nrOfCols; j++) {
                grid[i][j].cleanRectangle();
            }
        }
    }

    public String fileToString() {

        String str = "";

        for (int i = 0; i < nrOfRows; i++) {
            for (int j = 0; j < nrOfCols; j++) {
                if (grid[i][j].isPainted()) {
                    str += 1;
                    continue;
                }
                str += 0;
            }
            str += "\n";
        }
        return str;
    }


    public void stringToFile(String file) {

        int index = 0;

        for (int i =0; i<nrOfRows; i++) {
           for (int j = 0; j< nrOfCols; j++) {


               if (file.charAt(index) == '0') {
                   grid[i][j].cleanRectangle();

               } else {
                   grid[i][j].paintRectangle();
               }
               index++;
           }
           index++;
       }
    }
}
