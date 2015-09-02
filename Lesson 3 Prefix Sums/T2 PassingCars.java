//  https://codility.com/programmers/lessons/3
//  PassingCars
//  test report: https://codility.com/demo/results/demoM5SE5D-FT6/

class Solution {     
	public int solution(int[] A) {      
		if (A.length == 1) 
		{       
			return 0;     
		}      
		long westCars = 0;     
		for(int i=0;i<A.length;i++)
			{        
				if(A[i]==1)        
					westCars ++;     
			}     
			long counter = 0;          
			for(int i=0;i<A.length;i++)
			{         
				if(A[i]==0)  
				{         
					counter += westCars;       
				} 
				else {         
					westCars--;       
				}     
			}      
			if (counter > 1000000000) 
			{       
				return -1;     
			}      
			return (int) counter;   
		} 
	}