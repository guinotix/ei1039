package teoria_22_23.command;

import java.util.LinkedList;

public class Receiver {

    public LinkedList<Character> myFunctions;

    public Receiver() {
        this.myFunctions = new LinkedList<>();
    }

    public void operation(String params) {
        for (int i=0; i<params.length(); i++) {
            myFunctions.add(params.charAt(i));
        }
    }
}
