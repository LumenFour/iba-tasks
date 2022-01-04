package by.iba.gomel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ListOfNumbers.
 */
public class ListOfNumbers {

    private static final Logger      LOGGER = LoggerFactory.getLogger(ListOfNumbers.class);

    private static final int         SIZE   = 10;
    private final ArrayList<Integer> nmb;

    /**
     * Instantiates a new list of numbers.
     */
    public ListOfNumbers() {
        this.nmb = new ArrayList<>(ListOfNumbers.SIZE);
        for (int i = 0; i < ListOfNumbers.SIZE; i++) {
            this.nmb.add(i);
        }
    }

    /**
     * Read list.
     */
    public final void readList() {
        final Path file = Paths.get("info.txt");
        try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            ListOfNumbers.LOGGER.info("Start of reading:\n");
            this.nmb.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                final int number = Integer.parseInt(line);
                ListOfNumbers.LOGGER.info("Integer value was read: {}\n", number);
                if (this.nmb.size() == ListOfNumbers.SIZE) {
                    throw new ArrayIndexOutOfBoundsException();
                } else {
                    this.nmb.add(number);
                }
            }
        } catch (final FileNotFoundException e) {
            ListOfNumbers.LOGGER.error("Caught FileNotFoundException.", e);
        } catch (final NumberFormatException e) {
            ListOfNumbers.LOGGER.error("Caught NumberFormatException.", e);
        } catch (final ArrayIndexOutOfBoundsException e) {
            ListOfNumbers.LOGGER.error("Caught ArrayIndexOutOfBoundsException.", e);
        } catch (final IOException e) {
            ListOfNumbers.LOGGER.error("Caught IOException.", e);
        } finally {
            ListOfNumbers.LOGGER.info("End of reading.\nScanner was closed or not opened\n");
        }
    }

    /**
     * Write list.
     */
    public final void writeList() {
        final Path file = Paths.get("info.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE)) {
            ListOfNumbers.LOGGER.info("Start of writing:\n");
            for (int i = 0; i < ListOfNumbers.SIZE; i++) {
                writer.write(String.format("%s%n", i));
                ListOfNumbers.LOGGER.info("Value at: {} = {} \n", i, this.nmb.get(i));
            }
        } catch (final ArrayIndexOutOfBoundsException e) {
            ListOfNumbers.LOGGER.error("Caught ArrayIndexOutOfBoundsException.", e);
        } catch (final IOException e) {
            ListOfNumbers.LOGGER.error("Caught IOException.", e);
        } finally {
            ListOfNumbers.LOGGER.info("End of writing.\nWriter was closed or not opened.\n");
        }
    }
}
