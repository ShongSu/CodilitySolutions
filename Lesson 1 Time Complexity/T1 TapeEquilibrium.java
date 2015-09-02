//  https://codility.com/programmers/lessons/1
//  TapeEquilibrium
//  Test report: https://codility.com/demo/results/demoN6TNGP-SF4/

class Solution {     
    public int solution(int[] A) {

	    // write your code in Java SE 7
	    int N = A.length;

	    int sumLeft = A[0];
	    int sumRight = 0;
	    int P = 1;
	    for (int i = P; i < N; i++) {
	        sumRight += A[i];
	    }
	    int diff = Math.abs(sumLeft - sumRight);

	    for (; P < N-1; P++) {
	        sumLeft += A[P];
	        sumRight -= A[P];

	        int newDiff = Math.abs(sumLeft - sumRight);
	        if (newDiff < diff) {
	            diff = newDiff;
	        }
	    }
	    return diff;
	}
}