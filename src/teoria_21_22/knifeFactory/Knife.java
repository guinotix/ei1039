package teoria_21_22.knifeFactory;

public abstract class Knife {

    String name;

    public void sharpen() {
        System.out.println("sharpen");
    }

    public void polish() {
        System.out.println("polish");
    }

    public void wrapp() {
        System.out.println("wrapp");
    }

    public String getName() {
        return name;
    }

}