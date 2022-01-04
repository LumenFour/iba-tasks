package by.iba.gomel.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

import org.junit.Test;

import by.iba.gomel.ListOfNumbers;

public class ListOfNumbersTest {

    @Test(expected = NoSuchFileException.class)
    public void testComputeInitials() throws IOException {
        final ListOfNumbers actual = new ListOfNumbers();
        actual.writeList();
        actual.readList();

        final Path tmpDir = Files.createTempDirectory("tmp");
        tmpDir.toFile().delete();
        Files.createTempFile(tmpDir, "info", ".txt");

    }
}
