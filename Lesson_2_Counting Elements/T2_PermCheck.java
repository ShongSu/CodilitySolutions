//  https://codility.com/programmers/lessons/2
//  PermCheck
//  Test report: https://codility.com/demo/results/demoNPTYEU-P3U/


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	public int solution(int[] A) {
		// write your code in Java SE 8
		int[] counter = new int [A.length];
 
        for(int i= 0; i< A.length; i++){
            if (A[i] < 1 || A[i] > A.length) {
                return 0;
            }
            else if(counter[A[i]-1] == 1) {
                return 0;
            }
            else {
                counter[A[i]-1] = 1;
            }
        }
        return 1;
    }
}