package knifeFactory;

public class USKnifeStore extends KnifeStore {

    @Override
    Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new ChefKnife();
        }
        if (type.equals("steak")) {
            return new SteakKnife();
        }
        return null;
    }
}
