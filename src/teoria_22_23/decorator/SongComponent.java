package teoria_22_23.decorator;

public class SongComponent implements Song {

    public String name;
    public String artist;

    public SongComponent(String name, String artist) {
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
