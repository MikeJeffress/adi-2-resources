package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by michaeljeffress on 7/11/16.
 */
public class LionTest {

    @Test
    public void testIsAlpha () throws Exception {
        Lion lion = new Lion (true);

        boolean expectedIsAlpha = true;
        boolean actualIsAlpha = lion.isAlpha();

        assertEquals(expectedIsAlpha, actualIsAlpha);
    }

    @Test
    public void testMakeNoise () throws Exception {
        Lion lion = new Lion (true);


        String expectedMakeNoiseRoar = "Roar!!!";
        String actualMakeNoiseRoar = lion.makeNoise();

        assertEquals(expectedMakeNoiseRoar, actualMakeNoiseRoar);
    }

    @Test
    public void testTopSpeed () throws Exception {
        Lion lion = new Lion (true);


        int expectedTopSpeed = 50;
        int actualTopSpeed = lion.getTopSpeed();

        assertEquals(expectedTopSpeed, actualTopSpeed);
    }

}
