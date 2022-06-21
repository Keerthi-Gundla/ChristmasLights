package org.example;


import org.example.interfaces.Grid;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger=Logger.getLogger(InitializeGrid.class.getName());

        Grid gridBoard=new ChristmasLights();
        InitializeGrid grid=new InitializeGrid(gridBoard);

        grid.takeAction();

        logger.info("Lighted Bulbs: "+grid.getLitBulbsCount());
    }
}
