//	https://codility.com/programmers/task/min_perimeter_rectangle
//	MinPerimeterRectangle
//	Test report: https://codility.com/demo/results/trainingCZYVGB-3KR/

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int min = (1 + N) * 2;
        /*
        for(int i=1;i<=Math.sqrt(N);i++)
        {
            if( N % i == 0)
            {
                min = Math.min(min, 2*(N/i + i));
            }
        }
         return min;*/
         
        double side =  Math.sqrt(N);
        
        for(int i=(int)side;i>=1;i--)
        {
            if( N % i == 0)
            {
                min = 2*(N/i + i);
                return min;
            }
        }
        return min;
        
    }
}