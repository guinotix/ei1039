package decorator;

public class DecoratorMP4 extends DecoratorSong {

    public DecoratorMP4(SongComponent obj) {
        super(obj);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("ON MP4");
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
