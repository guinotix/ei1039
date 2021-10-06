package knifeFactory;

public class EuropeKnifeStore extends KnifeStore {

    @Override
    Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new EuropeChefKnife();
        }
        if (type.equals("steak")) {
            return new EuropeSteakKnife();
        }
        return null;
    }
}
