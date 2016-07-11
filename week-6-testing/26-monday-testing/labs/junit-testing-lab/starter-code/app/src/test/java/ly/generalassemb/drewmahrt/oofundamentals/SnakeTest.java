package ly.generalassemb.drewmahrt.oofundamentals;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by michaeljeffress on 7/11/16.
 */
public class SnakeTest {

    @Test
    public void testIsPoisonous () throws Exception {
        Snake snake = new Snake(true);


        boolean expectedIsPoisonous = true;
        boolean actualIsPoisonous = snake.mIsPoisonous;

        assertEquals(expectedIsPoisonous, actualIsPoisonous);
    }


    @Test
    public void testMakeNoise () throws Exception {
        Snake snake = new Snake(true);


        String expectedMakeNoiseHiss = "Hiss!!!";
        String actualMakeNoiseHiss = snake.makeNoise();

        assertEquals(expectedMakeNoiseHiss, actualMakeNoiseHiss);
    }

    @Test
    public void testTopSpeed () throws Exception {
        Snake snake = new Snake (true);


        int expectedTopSpeed = 5;
        int actualTopSpeed = snake.getTopSpeed();

        assertEquals(expectedTopSpeed, actualTopSpeed);
    }

}
