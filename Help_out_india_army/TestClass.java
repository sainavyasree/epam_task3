/*Protection of the Indian border and safe transport of items from one point to another along the border are the paramount jobs for the Indian army. However they need some information about the protection status along the length of the border. The border can be viewed as the real x-axis. Along the axis, Indian army has N checkpoints for lookout. 

We know that each checkpoint is located at an integer location xi. Each checkpoint must have a fleet of armed men which are responsible for guarding the neighboring areas of the checkpoint and provide military assistance of all kinds. The size of the fleet is based on the location of the checkpoint and how active the region is for terrorist activities. 

Given the number of armed men assigned at the ith checkpoint, as pi, this information is available for all checkpoints. 
With the skills of the armed men, it is known that if for the ith checkpoint, the length on the x axis that they can defend is a closed interval [xi-pi, xi+pi].

Now, your task is to transport some military items from position S to the end position E on the x-axis. 

Input:
First line of the input contains 3 integers N, S and E. N is the number of checkpoints that the Indian Army has on the border.
Then N lines follow. ith line contains 2 integers, xi and pi.

Output:
Print the total distance of the x-axisfrom S to E, that is not protected by the armed forces.

Constraints:
1 ≤ N ≤ 105
1 ≤ xi, pi ≤ 1018
xi + pi ≤ 1018
1 ≤ S ≤ E ≤ 1018

SAMPLE INPUT 
5 229 8419
1795 95
4873 720
3149 81
6101 2325
3674 629
SAMPLE OUTPUT 
2626
*/

package Help_out_india_army;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {

    Help_out_indian_army h=new Help_out_indian_army();
    
    @Test
    void testCalculate()
    {
        assertEquals(2626,h.calculate(5,229,8419,(new long[] {1795,4873,3149,6101,3674}),(new long[] {95,720,81,2325,629})));
        assertEquals(18997673568343431L,h.calculate(5,822981260158260522L,841978933726603953L,(new long[] {179547116602436426L,610152700132147177L,314956034464094616L,367465088898028107L,487310515160732228L}),new long[] {9445,4325,81,629,7202}));
    }

}
