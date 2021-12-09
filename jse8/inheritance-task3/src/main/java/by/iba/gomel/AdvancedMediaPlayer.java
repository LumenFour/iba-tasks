package by.iba.gomel;

/**
 * Interface for advanced media player.
 */
public interface AdvancedMediaPlayer {
    /**
     * Plays mp4 format.
     * 
     * @param filename
     *            String type.
     */
    void playMp4(String filename);

    /**
     * Plays vlc format.
     * 
     * @param filename
     *            String type.
     */
    void playVlc(String filename);
}
