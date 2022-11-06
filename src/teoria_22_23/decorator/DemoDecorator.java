package teoria_22_23.decorator;

public class DemoDecorator {

    public static void main(String[] args) {

        Playlist sabinaPlaylist = new Playlist("Sabina's hits");

        sabinaPlaylist.add(new DecoratorVinyl(new SongComponent("Princesa", "Joaquín Sabina")));
        sabinaPlaylist.add(new SongComponent("Calle melancolía", "Joaquín Sabina"));

        Playlist garciaPlaylist = new Playlist("Manolo Garcia's hits");
        garciaPlaylist.add(new DecoratorMP4(new SongComponent("Pájaros de barro", "Manolo García")));

        Playlist mySongs = new Playlist("My Songs");
        mySongs.add(sabinaPlaylist);
        mySongs.add(garciaPlaylist);

        mySongs.play();

    }
}
