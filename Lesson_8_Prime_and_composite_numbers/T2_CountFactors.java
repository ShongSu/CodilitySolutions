//	https://codility.com/programmers/task/count_factors
//	CountFactors
//	Test report: https://codility.com/demo/results/trainingP95X42-GQ8/


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        double middleVal = Math.sqrt(N);
        int count = 0;
        for(int i=1;i<middleVal;i++)
        {
            if(N%i==0)
            {  
                count += 2;
            }
        }
        if(middleVal==(int)middleVal)
        {
            count++;
        }
        
        return count;
        

        
    }
}

