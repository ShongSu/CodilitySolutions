//  https://codility.com/programmers/lessons/6
//  Dominator
//  test report: https://codility.com/demo/results/demoWCGY4W-3NW/

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int length = A.length;
        Stack<Integer> stack = new Stack<Integer>(); 
        for(int i=0; i<length;i++)
        {
            if(stack.empty())
            {
                stack.push(A[i]);
            }
            else{
                if(A[i] == stack.peek())
                {
                    stack.push(A[i]);
                }
                else
                {
                    stack.pop();
                }
            }
        }
        
        
        int temp;
        if(stack.empty())
        {
            return -1;
        }
        else
        {
            temp = stack.pop();
        }
        int count=0;
        int ret=-1;
        for(int i=0;i<length;i++)
        {
            
            if(A[i]==temp)
            {
                count++;
                ret=i;
            }
            
        }
        if(count > length/2)
            return ret;
        else return -1;
    }
}