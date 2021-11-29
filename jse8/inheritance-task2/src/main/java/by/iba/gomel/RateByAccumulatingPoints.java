package by.iba.gomel;

/**
 * public interface
 */
public interface RateByAccumulatingPoints {
    /**
     * method addPoints
     *
     * @param playerId
     *            input parameter
     * @param points
     *            input parameter
     */
    void addPoints(int playerId, int points);

    /**
     * method KO
     *
     * @param playerId
     *            input parameter
     */
    void knockout(int playerId);

}
