package commandPattern;

public class MusicPlayer {
    private int volume = 5;

    public String playPlaylist() {
        return "Music Player started playing favorite playlist at volume " + volume + ".";
    }

    public String stop() {
        return "Music Player stopped playing.";
    }

    public String decreaseVolume() {
        if (volume > 0) volume--;
        return "Music Player volume decreased to " + volume + ".";
    }
}