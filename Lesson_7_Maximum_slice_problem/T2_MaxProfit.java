//  https://codility.com/programmers/task/max_profit
//  MaxProfit
//  test report: https://codility.com/demo/results/trainingQNHX9M-PMK/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
       if(A.length == 1 || A.length == 0){
        return 0;
    }
    
    int tempMax = 0;
    int Max = 0;
    int currentMin = A[0];
    
    for(int i=1;i<A.length;i++)
    {
        tempMax = Math.max(0, A[i]-currentMin);
        currentMin = Math.min(A[i], currentMin);
        Max = Math.max(Max, tempMax);
    }
    return Max;
     
    }
}