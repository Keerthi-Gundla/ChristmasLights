package org.example;

import org.example.interfaces.Grid;

public class ChristmasLights extends Grid {

    private final int[][] gridBoard;
    ChristmasLights(){
        this.gridBoard=super.grid;
    }

    public int value(int val,int presentValue){
        if(val<0)
            return presentValue==1?0:1;
        return val;
    }

    @Override
    public void executeInstruction(int val,int firstRow,int firstCol,int lastRow,int lastCol){

        for(int row=firstRow;row<=lastRow;row++)
        {
            for(int col=firstCol;col<=lastCol;col++){

                gridBoard[row][col]=value(val,gridBoard[row][col]);
            }
        }
    }
}
