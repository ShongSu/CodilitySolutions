//  https://codility.com/programmers/lessons/14
//  MaxNonoverlappingSegments
//  test report: https://codility.com/demo/results/demo6GWXNF-NTW/


class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int count = 0, pre = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > pre) {
                count++;
                pre = B[i];
            }
        }
        return count;
    }
}