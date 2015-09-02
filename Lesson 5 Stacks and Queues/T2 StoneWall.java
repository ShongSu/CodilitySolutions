//  https://codility.com/programmers/lessons/5
//  StoneWall
//  test report: https://codility.com/demo/results/demoCHUTPC-EG4/

import java.util.*;

class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8
        int length = H.length;
        int count = 0;
        Stack<Integer> stack = new Stack<Integer>();         
        if(length <= 1)
            return length;
        for(int i=0;i<length;i++)
        {
            while(!stack.empty() && H[i]<stack.peek())
            {
                stack.pop();
                count++;
            }
            
            if(stack.empty())
                stack.push(H[i]);
            
            if(H[i]>stack.peek())
                stack.push(H[i]);

        }
        count+=stack.size();
        return count;

    }
}

