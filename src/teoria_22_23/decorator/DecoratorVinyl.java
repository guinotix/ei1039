package teoria_22_23.decorator;

public class DecoratorVinyl extends BaseDecoratorSong {

    public DecoratorVinyl(Song s) {
        super(s);
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
