package teoria_22_23.composite;

import java.util.LinkedList;

public class Playlist implements Component {

    private final String name;
    private final LinkedList<Component> children;

    public Playlist(String name) {
        this.name = name;
        this.children = new LinkedList<>();
    }

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void play() {
        for (Component c: children) {
            System.out.println(getName());
            c.play();
        }
    }

    @Override
    public String getName() {
        return "-----" + name + "-----";
    }
}
