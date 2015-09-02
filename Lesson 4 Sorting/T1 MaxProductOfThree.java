//  https://codility.com/programmers/lessons/4
//  MaxProductOfThree
//  test report: https://codility.com/demo/results/demoAWXBVN-VMN/

import java.util.*;  
class Solution {     
    public int solution(int[] A) {         
        // write your code in Java SE 8         
        int N = A.length;         
        // the worst-case time complexity is O(N*log(N))     
        Arrays.sort(A);         
        // the max product of three elements is the product of the last three         
        // elements in the sorted array or the product of the first two elements         
        // and the last element if the first two elements are negatives.         
        return Math.max(A[0] * A[1] * A[N-1], A[N-3] * A[N-2] * A[N-1]);     
    }
}