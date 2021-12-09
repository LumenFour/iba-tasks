package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.AudioPlayer;

public class PlayersTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testMain() {
        final AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc", "rain.vlc");
        audioPlayer.play("mp3", "ozzy osbourne - diary of a madman.mp3");
        audioPlayer.play("mp4", "dune.mp4");
        audioPlayer.play("mkv", "gadzilla.mkv");

        final String first = "Playing format: vlc, file: rain.vlc\n"
                + "Playing format: mp3, file: ozzy osbourne - diary of a madman.mp3\n"
                + "Playing format: mp4, file: dune.mp4\n"
                + "Playing format: mkv is not supported, file: gadzilla.mkv";
        Assert.assertEquals("test", first, this.log.getLog());
    }

}
