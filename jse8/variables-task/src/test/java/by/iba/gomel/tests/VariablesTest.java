package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.Variables;

public class VariablesTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testMain() {
        Variables.main(new String[] {});
        Assert.assertEquals("The employee's parameters must correspond to the specified",
                "Name: Kubinski. Age : 27. Salary: 0.0 ", this.log.getLog());
    }

}
