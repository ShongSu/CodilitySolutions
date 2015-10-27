//  https://codility.com/programmers/lessons/5
//  Brackets
//  test report: https://codility.com/demo/results/demo5AGNUZ-P2K/

import java.util.*;  

class Solution {     
    public int solution(String S) {         
        // write your code in Java SE 8         
        int length = S.length();         
        if(length % 2 != 0)             
            return 0;         
        char[] c=new char[length];         
        c=S.toCharArray();         
        Stack<Character> stack= new Stack<Character> ();
        for(int i=0;i<length;i++)         
        {             
            if(stack.empty())             
            {                 
                if(c[i]=='('||c[i]=='['||c[i]=='{')                 
                    stack.push(c[i]);                 
                if(c[i]==')')                     
                    return 0;             
            }             
            else              
            {                 
                if(c[i]=='('||c[i]=='['||c[i]=='{')                 
                    stack.push(c[i]);                 
                if((c[i]==')'&&stack.peek()=='(')||(c[i]==']'&&stack.peek()=='[')||(c[i]=='}'&&stack.peek()=='{'))                 
                    stack.pop();             
            }         
        }         
        if(stack.empty())             
            return 1;         
        else return 0;     
    } 
}