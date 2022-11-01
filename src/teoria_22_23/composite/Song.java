package teoria_22_23.composite;

public class Song implements Component {

    private final String name;
    private final String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Escuchando..." + getName() + " " + getArtist());
    }

    @Override
    public String getName() {
        return name;
    }

    private String getArtist() {
        return "BY " + artist;
    }

}
