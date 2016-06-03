package com.company;

/**
 * Created by admin on 03.06.2016.
 */
public final class StairsFun {

    /**
     * Stairs solutions
     * https://tproger.ru/problems/stairs/
     * @param number
     */
    public static void execute(int number){
        int twoNumbers = 0;
        int count = 0;

        while(number > 0){
            if(number >= 2){
                number -=2;
                twoNumbers++;
            } else {
                number -=1;
            }
            count++;
        }

        combination(twoNumbers,count,0);
    }

    /**
     *  http://integraloff.net/TepBep/cnk.php
     * @param k
     * @param n
     * @param counter
     */
    private static void combination(int k,int n,int counter){
        if(k!=-1){
            int result = factorial(n) / ( factorial(k) * factorial(n -k) );
            combination(k - 1, n+1,counter+result);
        } else {
            System.out.println(counter);
        }
    }

    private static int factorial(int n) {
        int fact = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}
