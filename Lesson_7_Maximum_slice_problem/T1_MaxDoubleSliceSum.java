//  https://codility.com/programmers/task/max_double_slice_sum
//  MaxDoubleSliceSum
//  test report: https://codility.com/demo/results/training7VRATP-VP3/

class Solution {
    public int solution(int[] A) {
      int N = A.length;
      int[] leftSide = new int[N];
      int[] rightSide = new int[N];

      for(int i = 1; i < N-1; i++){
        leftSide[i] = Math.max(leftSide[i-1] + A[i], 0);
      }
      for(int i = N-2; i > 0; i--){
        rightSide[i] = Math.max(rightSide[i+1] + A[i], 0);
      }

      int max = 0;

      for(int i = 1; i < N-1; i++){
        max = Math.max(max, leftSide[i-1] + rightSide[i+1]);
      }

      return max;
    }

}