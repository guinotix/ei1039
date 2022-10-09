package teoria_22_23.factory;

public abstract class KnifeStore {

    public Knife orderKnife(String type) {
        Knife knife;

        knife = createKnife(type);

        knife.sharpen();
        knife.polish();
        knife.wrapp();

        return knife;
    }

    public abstract Knife createKnife(String type);

}
