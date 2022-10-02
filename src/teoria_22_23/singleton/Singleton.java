package teoria_22_23.singleton;

public class Singleton {

    private static Object objetoUnico;

    private Singleton() {
        objetoUnico = new Object();
    }

    public static synchronized Object getInstance() {
        if (objetoUnico == null) {
            objetoUnico = new Object();
        }
        return objetoUnico;
    }

    public int getHash() {
        return objetoUnico.hashCode();
    }
}
