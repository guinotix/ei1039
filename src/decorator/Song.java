package decorator;

public class Song implements SongComponent {

    public String name;
    public String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void play() {
        System.out.println("Escuchando..." + getName() + " BY " + getArtist());
    }

    public String getArtist() {
        return this.artist;
    }
}
