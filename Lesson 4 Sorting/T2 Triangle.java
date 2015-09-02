//  https://codility.com/programmers/lessons/4
//  Triangle
//  test report: https://codility.com/demo/results/demoY6J7F9-FKN/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        if(N < 3)
        return 0;
        Arrays.sort(A);
        for(int i=0;i<N-2;i++)
        {
            if(A[i] > A[i+2] - A[i+1]) 
            //be careful, if you use A[i]+A[i+1]>A[i+2] may results to overflow error if using test data MAXINT.
            return 1;
        
        }
        return 0;
        
    }
}
