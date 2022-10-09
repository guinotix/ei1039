package teoria_22_23.factory;

public class USKnifeStore extends KnifeStore {

    @Override
    public Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new ChefKnife();
        } else if (type.equals("steak")) {
            return new SteakKnife();
        }
        return null;
    }
}
