package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by michaeljeffress on 7/11/16.
 */
public class ZooTest {


    @Test
    public void addTest() throws Exception {

        Zoo zoo = Zoo.getInstance();

        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(new Snake(true));

        assertTrue(zoo.getAnimals().size() == 8);
    }


    @Test
    public void removeTest() throws Exception {

        Zoo zoo = Zoo.getInstance();

        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(new Snake(true));


        Snake snake = new Snake(true);
        zoo.addAnimal(snake);

        assertTrue(zoo.getAnimals().size() == 9);

//        zoo.removeAnimal(snake);
//
//        assertTrue(zoo.getAnimals().size() == 8);
    }

}