package teoria_22_23.decorator;

import teoria_21_22.decorator.SongComponent;

import java.util.ArrayList;

public class Playlist implements Song {

    public String playlistName;
    public ArrayList<Song> playlist = new ArrayList<>();

    public Playlist(String name) {
        this.playlistName = name;
    }

    public void add(Song obj) {
        playlist.add(obj);
    }

    public void remove(Song obj) {
        playlist.remove(obj);
    }

    @Override
    public void play() {
        for (Song obj : playlist) {
            System.out.println("-----" + getName() + "-----");
            obj.play();
        }
    }

    @Override
    public String getName() {
        return this.playlistName;
    }
}
