package teoria_21_22.decorator;

public class DecoratorSong implements SongComponent {

    private SongComponent obj;

    public DecoratorSong(SongComponent obj) {
        this.obj = obj;
    }

    @Override
    public void play() {
        obj.play();
    }

    @Override
    public String getName() {
        return obj.getName();
    }
}
