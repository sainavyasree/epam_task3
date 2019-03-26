package Descending_weights;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class Test {

    Descending_weights d=new Descending_weights();
    @org.junit.jupiter.api.Test
    void testdescending()
    {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,3,5,2,4));
        ArrayList<Integer> b=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        assertEquals(a,d.descending_weights(5, 2,b));
    }
    void testdescending1()
    {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,4,3,5,1,3,6,8,7,9));
        ArrayList<Integer> b=new ArrayList<>(Arrays.asList(1,8,9,3,5,6,7,3,1,4));
        assertEquals(a,d.descending_weights(10,3,b));
    }

}
