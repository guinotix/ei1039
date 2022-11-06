package teoria_22_23.decorator;

public class DecoratorMP4 extends BaseDecoratorSong {

    public DecoratorMP4(Song s) {
        super(s);
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
