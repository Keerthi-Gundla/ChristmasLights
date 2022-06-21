package org.example.interfaces;

public abstract class Grid {

    public int[][] grid=new int[1000][1000];
    abstract public void executeInstruction(int val,int firstRow,int firstCol,int lastRow,int lastCol);
}
