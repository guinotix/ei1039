package teoria_21_22.knifeFactory;

public abstract class KnifeStore {

    public Knife orderKnife(String type) {
        Knife knife = null;
        knife = createKnife(type);
        knife.sharpen();
        knife.polish();
        knife.wrapp();
        return knife;
    }

    abstract Knife createKnife(String type);

}