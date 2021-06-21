package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.Name;

public class NameTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testMain() {
        Name.main(new String[] {});
        Assert.assertEquals("Anton Marozau! string should be in system out", "Anton Marozau",
                this.log.getLog());

    }
}
