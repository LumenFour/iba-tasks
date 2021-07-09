package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runners.MethodSorters;

import by.iba.gomel.ArraysTask;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArraysTaskTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testAssignedArray() {
        ArraysTask.assignedarray();
        Assert.assertEquals("Array must meet the requirements", "Assigned array: 000230100000",
                this.log.getLog());
    }

    @Test
    public void testAssignedArrayOfChars() {
        ArraysTask.assignedarrayofchars();
        Assert.assertEquals("Array must meet the requirements",
                "\nAssigned array of chars: decaatgs", this.log.getLog());
    }

    @Test
    public void testDeclaredArray() {
        ArraysTask.declaredarray();
        Assert.assertEquals("Array must meet the requirements", "\nDeclared array: 000230100000",
                this.log.getLog());
    }

    @Test
    public void testDeclaredArrayOfChars() {
        ArraysTask.declaredarrayofchars();
        Assert.assertEquals("Array must meet the requirements",
                "\nDeclared array of chars: decaatgi", this.log.getLog());
    }

}
