package org.example;

import org.example.interfaces.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasLightsTest {

    @Test
    public void testExecution(){

        InitializeGrid grid=new InitializeGrid();
        Grid grid1=new ChristmasLights(grid.getGrid());

        grid1.executeInstruction(1,0,0,2,2);
        grid1.executeInstruction(0,3,2,4,5);
        assertEquals(9,grid.getLitBulbsCount());

        grid1.executeInstruction(-1,1,2,3,3);
        assertEquals(11,grid.getLitBulbsCount());

    }

}