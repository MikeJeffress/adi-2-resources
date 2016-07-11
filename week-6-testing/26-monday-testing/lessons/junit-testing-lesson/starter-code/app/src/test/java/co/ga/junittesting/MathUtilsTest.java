package co.ga.junittesting;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by michaeljeffress on 7/11/16.
 */
public class MathUtilsTest {

    @Test
    public void testIntMultiply () throws Exception {

        int expectedIntMultiply = 20;
        int actualIntMultiply = MathUtils.multiply(4,5,1);

        assertEquals(expectedIntMultiply, actualIntMultiply);
    }

    @Test
    public void testDoubleMultiply () throws Exception {

        double expectedDoubleMultiply = 20.0;
        double actualDoubleMultiply = MathUtils.multiply(4.0,5.0,1.0);

        assertEquals(expectedDoubleMultiply, actualDoubleMultiply);
    }

    @Test
    public void testIntSquare (){

        int expectedIntSquare = 125;
        int actualIntSquare = MathUtils.multiply(4,5,1);;

        assertEquals(expectedIntSquare, actualIntSquare);
    }

    @Test
    public void testDoubleSquare (){

        double expectedDoubleSquare = 125.0;
        double actualDoubleSquare = MathUtils.multiply(5.0,5.0,5.0);

        assertEquals(expectedDoubleSquare, actualDoubleSquare);

    }

    @Test
    public void testIntAdd (){

        int expectedIntAdd = 7;
        int actualIntAdd = MathUtils.multiply(2,4,1);

        assertEquals(expectedIntAdd, actualIntAdd);


    }

    @Test
    public void testDoubleAdd (){

        double expectedDoubleAdd = 9.0;
        double actualDoubleAdd = MathUtils.multiply(3.0,4.0,1.0);;

        assertEquals(expectedDoubleAdd, actualDoubleAdd);

    }

    @Test
    public void testIntPythagorean  (){

        int expectedIntPythagorean = ;
        int actualIntPythagorean = ;

    }

    @Test
    public void testDoublePythagorean (){

        double expectedDoublePythagorean = ;
        double actualDoublePythagorean = ;

    }


}
