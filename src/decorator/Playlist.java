package decorator;

import java.util.ArrayList;

public class Playlist implements SongComponent {

    public String playlistName;
    public ArrayList<SongComponent> playlist = new ArrayList<>();

    public Playlist(String name) {
        this.playlistName = name;
    }

    public void add(SongComponent obj) {
        playlist.add(obj);
    }

    public void remove(SongComponent obj) {
        playlist.remove(obj);
    }

    @Override
    public void play() {
        for (SongComponent obj : playlist) {
            System.out.println("-----" + getName() + "-----");
            obj.play();
        }
    }

    @Override
    public String getName() {
        return this.playlistName;
    }
}
