//  https://codility.com/programmers/lessons/5
//  Nesting
//  test report: https://codility.com/demo/results/demoAYPHW5-9NS/

import java.util.*;  

class Solution {     
    public int solution(String S) {         
        // write your code in Java SE 8         
        int length = S.length();         
        if(length % 2 != 0)             
            return 0;         
        char[] c=new char[length];         
        c=S.toCharArray();         
        Stack stack = new Stack();          
        for(int i=0;i<length;i++)         
        {             
            if(stack.empty())             
            {                 
                if(c[i]=='(')                 
                    stack.push(c[i]);                 
                if(c[i]==')')                     
                    return 0;             
            }             
            else              
            {                 
                if(c[i]=='(')                 
                    stack.push(c[i]);                 
                if(c[i]==')')                 
                    stack.pop();             
            }         
        }         
        if(stack.empty())             
            return 1;         
        else return 0;     
    } 
}