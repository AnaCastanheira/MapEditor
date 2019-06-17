package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.bootcamp.mapeditor.org.academiadecodigo.bootcamp.mapeditor.cels.Cell;

import java.io.FileWriter;
import java.io.IOException;


public class Field {


   private Cell[][] grid;
   private int nrOfRows;
   private int nrOfCols;


   public Field (int nrOfRows, int nrOfCols) {

       this.nrOfRows = nrOfRows;
       this.nrOfCols = nrOfCols;
       this.grid = gridConstruction(nrOfRows,nrOfCols);

   }


   public Cell[][] gridConstruction(int nrOfRows, int nrOfCols) {

       Cell [] rows = new Cell[nrOfRows];
       Cell [] cols = new Cell[nrOfCols];
       Cell [][] grid = new Cell[nrOfRows][nrOfCols];

       for (int i =0; i<rows.length; i++) {
           for (int j=0; j<cols.length; j++) {
               grid[i][j] = new Cell(i, j);
           }
       }
       return grid;

   }

   public void changeCellColor(int row, int col){

       if (!(grid[row][col].isPainted())) {
           grid[row][col].paintRectangle();
           return;
       }
       grid[row][col].cleanRectangle();

   }


   public void clearAll() {

       for (int i =0; i<nrOfRows; i++) {
           for (int j=0; j<nrOfCols; j++) {
               grid[i][j].cleanRectangle();
           }
       }
   }


    private void writeFileByLine(String file, String text) throws IOException {

        FileWriter writer = new FileWriter("/Users/codecadet/workspace/mapEditor.TXT");

        BufferedWriter bWriter = new BufferedWriter(writer);

        bWriter.writer(text);

        bWriter.flush();

        bWriter.close();


    }


}
