package org.example;

public class LitBulbs {

    public int count(int[][] lightsBoard){
        int count=0;
        for(int row=0;row<1000;row++){
            for(int col=0;col<1000;col++){

                if(lightsBoard[row][col]==1)
                    count=count+1;
            }
        }
        return count;
    }
}
