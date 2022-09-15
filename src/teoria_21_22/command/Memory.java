package teoria_21_22.command;

import java.util.ArrayList;

public class Memory {

    public ArrayList<Character> memory;

    public Memory() {
        memory = new ArrayList<>();
    }

    void removeLast() {
        memory.remove(memory.size()-1);
    }
}
