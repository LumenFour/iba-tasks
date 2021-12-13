package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Audio player class that uses MediaAdapter and plays mp3 format by default.
 */
public class AudioPlayer implements MediaPlayer {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AudioPlayer.class);

    /**
     * MediaAdapter object.
     */
    private MediaAdapter        mediaAdapter;

    /**
     * Instantiates a new audio player.
     *
     * @param mediaAdapter
     *            the media adapter
     */
    public AudioPlayer() {
        // empty
    }

    /**
     * Getter for mediaAdapter.
     *
     * @return this.mediaAdapter MediaAdapter type.
     */
    public final MediaAdapter getMediaAdapter() {
        return this.mediaAdapter;
    }

    @Override
    public final void play(final String audioType, final String filename) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            AudioPlayer.LOGGER.info("\nPlaying format: {}, file: {}", audioType, filename);
        } else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            this.mediaAdapter = new MediaAdapter(audioType);
            this.mediaAdapter.play(audioType, filename);
        } else {
            AudioPlayer.LOGGER.info("\nPlaying format: {} is not supported, file: {}", audioType,
                    filename);
        }
    }
}
