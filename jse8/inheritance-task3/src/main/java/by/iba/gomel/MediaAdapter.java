package by.iba.gomel;

/**
 * MediaAdapter class that uses AdvancedMediaPlayer objects to play different types.
 */
public class MediaAdapter implements MediaPlayer {

    /**
     * AdvancedMediaPlayer object.
     */
    private AdvancedMediaPlayer advancedMediaPlayer;

    /**
     * Public constructor.
     * 
     * @param audioType
     *            String type.
     */
    public MediaAdapter(final String audioType) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            this.advancedMediaPlayer = new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            this.advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public final void play(final String audioType, final String filename) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            this.advancedMediaPlayer.playVlc(filename);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            this.advancedMediaPlayer.playMp4(filename);
        }
    }
}
