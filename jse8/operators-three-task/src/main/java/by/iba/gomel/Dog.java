package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Dog.
 */
public class Dog {

    private static final Logger LOGGER = LoggerFactory.getLogger(Dog.class);
    private String              name;

    private String              says;

    /**
     * Instantiates a new dog.
     *
     * @param name
     *            the name
     * @param says
     *            the says
     */
    public Dog(final String name, final String says) {
        this.name = name;
        this.says = says;
    }

    public String getName() {
        return this.name;
    }

    public String getSays() {
        return this.says;
    }

    /**
     * Method prints dog's name and what they said
     */
    public void printdog() {
        Dog.LOGGER.info("Dog's name {}. Dog says {} \n", this.getName(), this.getSays());
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setSays(final String says) {
        this.says = says;
    }

}
