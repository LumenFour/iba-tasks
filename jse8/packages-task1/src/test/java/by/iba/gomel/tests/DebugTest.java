package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.debug.Debug;

public class DebugTest {

    Debug                       dbg = new Debug();
    by.iba.gomel.debugoff.Debug bug = new by.iba.gomel.debugoff.Debug();

    @Test
    public void testDebug() {
        final String b1 = "InfoError";
        Assert.assertEquals("Error", b1, this.dbg.debug(new String("Error")));
    }

    @Test
    public void testDebugOff() {
        final String b2 = "WarningError";
        Assert.assertEquals("Error", b2, this.bug.debug(new String("Error")));
    }

}
