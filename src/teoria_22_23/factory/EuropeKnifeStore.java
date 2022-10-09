package teoria_22_23.factory;

public class EuropeKnifeStore extends KnifeStore {

    @Override
    public Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new EuropeChefKnife();
        } else if (type.equals("steak")) {
            return new EuropeSteakKnife();
        }
        return null;
    }
}
