package teoria_21_22.command;

import java.util.LinkedList;

public class Receiver {



    void operation(String params) {
        LinkedList<Character> l = new LinkedList<>();

        for (int i=0; i<params.length(); i++) {
            l.add(params.charAt(i));
        }



    }

}
