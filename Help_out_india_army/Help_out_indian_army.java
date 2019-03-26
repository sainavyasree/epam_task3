/*
 * Protection of the Indian border and safe transport of items from one point to another along the border are the paramount jobs for the Indian army. However they need some information about the protection status along the length of the border. The border can be viewed as the real x-axis. Along the axis, Indian army has N checkpoints for lookout. 

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

import java.util.*;
public class Help_out_indian_army {

    static class pair implements Comparable<pair>
    {
        Long x, y;
        pair(long x,long y)
        {
            this.x=x;
            this.y=y;
        }
        public int compareTo(pair o) {
            return x.compareTo(o.x);
        }  
    }
  public long calculate(int N,long S,long E,long[] x,long[] p)
   {
      pair[] areaDefended = new pair[N];
      for(int i=0;i<N;i++)
      {
          areaDefended[i] = new pair(x[i]-p[i],x[i]+p[i]);
      }
      
      Arrays.sort(areaDefended);
      ArrayList<pair> list = new ArrayList<pair>();
      
      long c = areaDefended[0].x;
      long d = areaDefended[0].y;
      
      //merging the defended segments if any
      for(int i=1;i<N;i++)
      {
          if(areaDefended[i].x<=d)
              d = Math.max(d, areaDefended[i].y);
          else
          {
              list.add(new pair(c,d));
              c = areaDefended[i].x;
              d = areaDefended[i].y;
          }
      }
      list.add(new pair(c,d));
      int i;
      long ans = 0;
      for(i=0;i<list.size();i++)
      {
          if(S>=E)
          {
              S=E;
              break;
          }
          //if starting position is in between current segment
          if(list.get(i).x<=S && S<=list.get(i).y)
              S = list.get(i).y;
          //if current segment is in between starting position & ending position
          else if(S<=list.get(i).x && E>=list.get(i).y)
          {
              ans+=list.get(i).x-S;
              S = list.get(i).y;
              
          }//if ending position lies between current segment
          else if(S<=list.get(i).x && E>=list.get(i).x &&  E<=list.get(i).y)
          {
              ans+=list.get(i).x-S;
              S = E;
          }
          //if starting position & ending position are before the current segment
          else if(S<=list.get(i).x && E<=list.get(i).x)
          {
              ans+=E-S;
              S = E;
          }
      }
      //add the distance which is not covered in above segments
      if(S<E)
          ans+=E-S;
      
      return ans;
       
    
   }
}
