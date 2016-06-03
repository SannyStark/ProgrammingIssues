package com.company;

/**
 * Created by admin on 03.06.2016.
 */
public final class WaterFinder {

    /**
     * Find water
     * @param array
     * @return
     */
    public static int execute(int[] array){
        int line = 1, waterCounter = 0;
        boolean exit = false;
        while(!exit){
            int leftIndex = -1, rightIndex = -1;
            for (int i = 0, j = array.length-1; i < array.length; i++, j--) {
                if(leftIndex == -1 && line <= array[i]) leftIndex=i; // find left wall
                if(rightIndex == -1 && line <= array[j]) rightIndex=j; // find right wall
                if(i > j) { exit=true; break; } // break and exit if there is no wall
                if(leftIndex != -1 && rightIndex != -1){
                    waterCounter += waterCount(leftIndex,rightIndex,line,array); // count water between walls
                    break;
                }
            }
            line++;
        }
        return waterCounter;
    }


    private static int waterCount(int start,int end,int line,int[] array){
        int result = 0;
        for (int i = start; i <= end; i++) {
            if(line > array[i]) result++;
        }
        return result;
    }
}
