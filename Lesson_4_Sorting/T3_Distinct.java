//  https://codility.com/programmers/lessons/4
//  Distinct
//  test report: https://codility.com/demo/results/demo9S6F7J-GDG/

import java.util.*;  

class Solution {     
    public int solution(int[] A) {         
        // write your code in Java SE 8         
        int N=A.length;         
        if(N == 0)         
            return 0;                  
        int count = 1;         
        Arrays.sort(A);         
        int temp = A[0];         
        for(int i=1;i<N;i++)         
        {             
            if(temp != A[i])             
            {             
                count++;             
                temp=A[i];             
            }         
        }         
        return count;                  
    } 
}

