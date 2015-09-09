//  https://codility.com/programmers/lessons/2
//  FrogRiverOne
//  Test report: https://codility.com/demo/results/demoB33QSG-3DH/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int steps = X;
        boolean[] isCovered = new boolean[steps+1];
        for(int i = 0; i < A.length; i++){
            if(!isCovered[A[i]]){
                isCovered[A[i]] = true;
                steps--;
            }
            if(steps == 0) return i;
        }
        return -1;
    }
}