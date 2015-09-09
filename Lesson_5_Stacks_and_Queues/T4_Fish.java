//  https://codility.com/programmers/lessons/5
//  Fish
//  test report: https://codility.com/demo/results/demoX8QVHM-EFA/


// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int length = A.length;
        int count = 0;
        if(length <= 0)
            return 0;
        Stack<Integer> stack = new Stack<Integer>();          
        for(int i=0;i<length;i++)
        {   
            if(stack.empty() && B[i]==0)
                count++;
            
            if(B[i]==1)
                stack.push(A[i]);
                
            while(!stack.empty() && A[i] > stack.peek())
            {
                stack.pop();
                if(stack.empty())
                    count++;
            }
                        
        }
        
        count += stack.size();
            
        return count;
            
                    
    }
}