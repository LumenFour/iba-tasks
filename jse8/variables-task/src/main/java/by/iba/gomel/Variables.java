package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Variables.
 */
public final class Variables {

    private static final Logger LOGGER   = LoggerFactory.getLogger(Variables.class);

    public static final int     CHANGEAGE   = 27;

    public static final String  EMPLOYEE = "Kubinski";

    private final double        salary;

    private int                 age;

    Variables(final int salary) {
        this.salary = salary;
    }

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final Variables emp = new Variables(0);
        emp.setAge(Variables.CHANGEAGE);
        emp.printEmp();
    }

    /**
     * Prints the emp.
     */
    public void printEmp() {
        Variables.LOGGER.info("Name: {}. Age : {}. Salary: {} ", Variables.EMPLOYEE, this.age,
                this.salary);
    }

    public void setAge(final int empag) {
        this.age = empag;
    }

}
