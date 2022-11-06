package teoria_22_23.decorator;

public abstract class BaseDecoratorSong implements Song {

    private Song obj;

    public BaseDecoratorSong(Song s) {
        this.obj = s;
    }

    @Override
    public void play() {
        this.obj.play();
    }

    @Override
    public String getName() {
        return this.obj.getName();
    }

}
