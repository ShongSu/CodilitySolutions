//  https://codility.com/programmers/lessons/2
//  MissingInteger
//  Test report: https://codility.com/demo/results/demoN9M3H8-EC6/

class Solution {     
	public int solution(int[] A) {         
		// write your code in Java SE 8         
		int n = A.length;         
		if(n == 1)         
		{             
			if(A[0] == 1)             
			{                 
				return 2;             
			}             
			else 
				return 1;         
		}         
		else 
		{         
		
			int record[] = new int[n+1];         
			
			for(int i = 0; i < n ; i ++)         
			{             
				if(A[i] > 0 && A[i] <= n)
					record[A[i]]++;         
			}         
			
			for(int j = 1; j < n; j ++)         
			{         
				//    System.out.println(record[j]);        
				if(record[j] == 0)         
					return j;         
			}         
		}          
		return n + 1;     
	} 
}