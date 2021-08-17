package by.iba.gomel.test;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Statements;

public class StatementsTest {

    public static char[][] arrayOfChars() {
        final char[][] twoDimArray = new char[3][];
        twoDimArray[0] = new char[] {'a', 'b', 'a'};
        twoDimArray[1] = new char[] {'b', 'a', 'a'};
        twoDimArray[2] = new char[] {'b', 'a', 'z'};
        return twoDimArray;
    }

    public static char[][] arrayOfCharsPol() {
        final char[][] twoDimArrayNeg = new char[3][];
        twoDimArrayNeg[0] = new char[] {'b', 'b', 'b'};
        twoDimArrayNeg[1] = new char[] {'b', 'b', 'a'};
        twoDimArrayNeg[2] = new char[] {'b', 'b', 'b'};
        return twoDimArrayNeg;
    }

    @Test
    public void testCheckColumns() {
        final char[][] twoDim = StatementsTest.arrayOfChars();
        final boolean actual = Statements.checkColumns(twoDim);
        final boolean expected = false;
        Assert.assertEquals("As a result of checking the columns the result is false", expected,
                actual);
    }

    @Test
    public void testCheckColumnsPol() {
        final char[][] twoDiz = StatementsTest.arrayOfCharsPol();
        final boolean actual = Statements.checkColumns(twoDiz);
        final boolean expected = true;
        Assert.assertEquals("As a result of checking the columns the result is true", expected,
                actual);
    }

    @Test
    public void testCheckMajorDiagonal() {
        final char[][] twoD = StatementsTest.arrayOfChars();
        final boolean actual = Statements.checkDiagonal(twoD);
        final boolean expected = false;
        Assert.assertEquals("As a result of checking the diagonal the result is false", expected,
                actual);
    }

    @Test
    public void testCheckMajorDiagonalPol() {
        final char[][] twoDR = StatementsTest.arrayOfCharsPol();
        final boolean actual = Statements.checkDiagonal(twoDR);
        final boolean expected = true;
        Assert.assertEquals("As a result of checking the diagonal the result is true", expected,
                actual);
    }

    @Test
    public void testCheckRow() {
        final char[][] DD = StatementsTest.arrayOfChars();
        final boolean actual = Statements.checkRow(DD);
        final boolean expected = false;
        Assert.assertEquals("As a result of checking the rows the result is false", expected,
                actual);
    }

    @Test
    public void testCheckRowPol() {
        final char[][] DDD = StatementsTest.arrayOfCharsPol();
        final boolean actual = Statements.checkRow(DDD);
        final boolean expected = true;
        Assert.assertEquals("As a result of checking the rows the result is true", expected,
                actual);
    }
}
