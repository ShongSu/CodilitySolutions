
//  https://codility.com/programmers/lessons/2
//  MaxCounters
//  Test report: https://codility.com/demo/results/demoQFZSUV-5TA/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int M = A.length;
        int tempMax = 0;
        int tempMin = 0;
        int[] counter = new int[N];
        for(int i = 0; i < M ; i ++)
        {
            if(A[i] >= 1 && A[i] <= N)
            {
                counter[A[i] - 1] = counter[A[i] - 1] < tempMin ? tempMin : counter[A[i] - 1];
                counter[A[i]-1]++;
                tempMax = tempMax > counter[A[i]-1] ? tempMax : counter[A[i]-1];

            }
            else if(A[i] == N + 1)
            {
                tempMin = tempMax;;
            }
            //System.out.println("tempMax="+tempMax);
            //System.out.println("tempMin="+tempMin);
        }
        
        for(int i = 0; i < N; i ++){
            counter[i] = counter[i] < tempMin ? tempMin : counter[i];
        }
        
        return counter;
    }
}
