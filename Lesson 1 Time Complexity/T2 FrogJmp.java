//  https://codility.com/programmers/lessons/2
//  FrogJmp
//  Test report: https://codility.com/demo/results/demoNPHZ6Y-M2U/

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
