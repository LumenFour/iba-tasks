package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Mp4 player class.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Mp4Player.class);

    @Override
    public final void playMp4(final String filename) {
        Mp4Player.LOGGER.info("\nPlaying format: mp4, file: {}", filename);
    }

    @Override
    public final void playVlc(final String filename) {
        // this method is empty, because this class plays mp4 format only
    }

}
