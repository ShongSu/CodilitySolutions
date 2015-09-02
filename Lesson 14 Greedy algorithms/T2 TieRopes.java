//  https://codility.com/programmers/lessons/14
//  TieRopes
//  test report: https://codility.com/demo/results/demoUGURSE-REV/


class Solution {
    public int solution(int K, int[] A) {
        // write your code in Java SE 8
        int count = 0, sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum >= K) {
                count++;
                sum = 0;
            }
        }
        return count;
        
        
    }
}