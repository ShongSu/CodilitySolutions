//  https://codility.com/programmers/task/max_slice_sum
//  MaxSliceSum
//  test report: https://codility.com/demo/results/trainingPMCSS4-ZG9/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int cur=0;
        int max = A[0];
        for(int i=0;i<A.length;i++){
            cur = Math.max(cur + A[i], A[i]);
            max = Math.max(max,cur);
            //System.out.println(cur+" "+max);
        }
        return max;
    }
}