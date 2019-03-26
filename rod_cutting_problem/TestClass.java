/*
 * A young mischievous boy Harsh, got into a trouble when his mechanical workshop teacher told him to cut Iron rods. The rod cutting algorithm is as follows:

Step 1. If the rod can be divided into two equal parts, cut it and choose any one of them.

Step 2. Else cut the rod into two parts having non-zero integral lengths such that the difference between the lengths of the two pieces is minimized, and then choose the piece having smaller length.

Step 3. Repeat the above algorithm with the currently chosen piece. If the length of the currently chosen piece becomes 1 , stop the algorithm.

There can be special rods which require Step 2 in every step of its cutting. Harsh want to find out the number of such special rods. Help Harsh to find out the answer.

Input:
The first line of the input will contain T, the number of test-cases. 
Each subsequent T lines will contain an integer N, where N is the range of lengths of rods from 1 to N .

Output:
For each test-case print the required answer. 

Constraints:
SAMPLE INPUT 
2
3
2
SAMPLE OUTPUT 
1
0
 */

package rod_cutting_problem;

public class TestClass {

    public static void main(String args[]) {
    rod_cutting_problem r=new rod_cutting_problem();
    
    int T=2;
    int N[]= {3,2};
    int result[]=new int[2];
    result=r.calculate(T,N);
    
    for(int i=0;i<result.length;i++)
        System.out.println(result[i]);
}
}
