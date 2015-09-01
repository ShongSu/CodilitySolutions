//  https://codility.com/programmers/lessons/1
//  PermMissingElem
//  Test report: https://codility.com/demo/results/demoQ2TB2E-HD2/


class Solution {     
	public int solution(int[] A) {         
	// write your code in Java SE 8         
		int n = A.length;         
		int sum = 0;         
		for(int i=0;i<n;i++)         
		{      
			sum += A[i];         
		}         
		int expsum = 0;         
		for(int i=0;i<=n+1;i++)         
		{             
			expsum += i;         
		}         
		return expsum - sum;                           
	} 
}
