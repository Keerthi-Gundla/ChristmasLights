package org.example;


import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger=Logger.getLogger(InitializeGrid.class.getName());

        InitializeGrid grid=new InitializeGrid();

        grid.takeAction();

        logger.info("Lighted Bulbs: "+grid.getLitBulbsCount());
    }
}
