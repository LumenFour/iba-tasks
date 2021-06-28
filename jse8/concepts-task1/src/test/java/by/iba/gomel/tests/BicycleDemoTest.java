package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.BicycleDemo;

public class BicycleDemoTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testMain() {
        BicycleDemo.main(new String[] {});
        Assert.assertEquals("Features must meet the requirements",
                "Cadence set to 21. Speed set to 20. Weight set to 5. Brackes set to 2. Frame set to 2. Block set to 3. Amount of people set to 2. Speed set to 19. ",
                this.log.getLog());
    }
}
