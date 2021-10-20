package decorator;

public class DecoratorVinyl extends DecoratorSong {

    public DecoratorVinyl(SongComponent obj) {
        super(obj);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("ON Vinyl");
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
