package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Dog;

public class DogTest {

    static void compare(final Dog spot, final Dog scruffy) {

        spot.equals(scruffy);
        spot.getName().equals(scruffy.getName());
        spot.getSays().equals(scruffy.getSays());
    }

    @Test
    public void testDogCompare() {

        final Dog spot = new Dog(null, null);
        final Dog scruffy = new Dog(null, null);
        final Dog richard = spot;

        spot.setName("Spot");
        spot.setSays("Ruff!");
        spot.printdog();

        scruffy.setName("Scruffy");
        scruffy.setSays("Wurf!");
        scruffy.printdog();

        richard.setName("Richard");
        richard.setSays("Woof!");
        richard.printdog();

        DogTest.compare(spot, scruffy);
        Assert.assertNotEquals("Dog's objects aren't equals", spot, scruffy);
        DogTest.compare(spot, richard);
        Assert.assertEquals("Dog's objects are equals", spot, richard);

    }
}
