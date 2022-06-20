package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class InitializeGrid {
    private final int[][] grid;

    private final Logger logger=Logger.getLogger(InitializeGrid.class.getName());

    public InitializeGrid(){
        grid=new int[1000][1000];
    }

    public void takeAction(){

        Scanner sc=new Scanner(System.in);

        logger.info("Enter number of Entries : ");
        int n=sc.nextInt();

        ChristmasLights grid1=new ChristmasLights(grid);

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
        return new LitBulbs().count(grid);
    }

    public Map<Integer,Integer> initializeMap(){

        Map<Integer,Integer> value=new HashMap<>();
        value.put(1,1);
        value.put(2,0);
        value.put(3,-1);

        return value;
    }
}
