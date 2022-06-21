package org.example;

import org.example.interfaces.Grid;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class InitializeGrid {
    private final int[][] gridBoard;
    private final Grid grid1;

    private final Logger logger=Logger.getLogger(InitializeGrid.class.getName());

    public InitializeGrid(Grid grid1){
        this.grid1=grid1;
        gridBoard=grid1.grid;
    }

    public void takeAction(){

        Scanner sc=new Scanner(System.in);

        logger.info("Enter number of Entries : ");
        int n=sc.nextInt();

        Map<Integer,Integer> value=initializeMap();

        for(int count=0;count<n;count++) {

            logger.info("Enter\n 1 for on \n 2.for off \n 3.toggle");
            int action=sc.nextInt();

            logger.info("Enter the first row and col: ");
            int firstRow = sc.nextInt();
            int firstCol = sc.nextInt();

            logger.info("Enter the second row and col : ");
            int secondRow = sc.nextInt();
            int secondCol = sc.nextInt();

            action=value.get(action);

            grid1.executeInstruction(action,firstRow,firstCol,secondRow,secondCol);

        }

    }

    public int getLitBulbsCount(){
        return new LitBulbs().count(gridBoard);
    }

    public Map<Integer,Integer> initializeMap(){

        Map<Integer,Integer> value=new HashMap<>();
        value.put(1,1);
        value.put(2,0);
        value.put(3,-1);

        return value;
    }

    public int[][] getGrid(){
        return gridBoard;
    }
}
