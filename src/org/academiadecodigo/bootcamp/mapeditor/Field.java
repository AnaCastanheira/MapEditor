package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.bootcamp.mapeditor.org.academiadecodigo.bootcamp.mapeditor.cels.Cell;


public class Field {

   private int nrOfRows;
   private int nrOfCols;
   private Cell[][] grid;


   public Field (int nrOfRows, int nrOfCols) {
       this.nrOfCols = nrOfCols;
       this.nrOfRows = nrOfRows;
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
}
