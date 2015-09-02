//  https://codility.com/programmers/lessons/3
//  CountDiv
//  test report: https://codility.com/demo/results/demoDTSJK4-2B7/

class Solution {     
	public int solution(int X, int Y, int D) {         
	// write your code in Java SE 8         
		int step = 0;        
		int dis = Y - X;         
		step = dis / D;         
		if(dis % D != 0)         
			step += 1;         
		return step;                       
	} 
}