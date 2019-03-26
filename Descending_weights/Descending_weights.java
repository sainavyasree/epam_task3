/*
 * You have been given an array A of size N and an integer K. This array consists of N integers ranging from 1 to . Each element in this array is said to have a Special Weight. The special weight of an element  is .

You now need to sort this array in Non-Increasing order of the weight of each element, i.e the element with the highest weight should appear first, then the element with the second highest weight and so on. In case two elements have the same weight, the one with the lower value should appear in the output first.

Input Format:

The first line consists of two space separated integers N and K. The next line consists of N space separated integers denoting the elements of array A.

Output Format:

Print N space separated integers denoting the elements of the array in the order in which they are required.

Constraints:




Note:

You need to print the value of each element and not their weight.

SAMPLE INPUT 
5 2
1 2 3 4 5
SAMPLE OUTPUT 
1 3 5 2 4
 */

package Descending_weights;
import java.util.*;
public class Descending_weights {
    
    ArrayList<Integer> descending_weights(int N,int K,ArrayList<Integer> A)
    {
        Collections.sort(A,(a,b) ->
        { 
            if (a%K == b%K)
                   {
                       return (int)(a-b);
                   }
                                       else
                                       return (int)(b%K-a%K);
   }
   );

        
        return A;
    }

    
}
