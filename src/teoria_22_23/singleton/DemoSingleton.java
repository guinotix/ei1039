package teoria_22_23.singleton;

public class DemoSingleton {

    public static void main(String[] args) {

        long ti1 = System.nanoTime();
        Object instancia1 = Singleton.getInstance();
        long tf1 = System.nanoTime();
        double tt1 = ( (double) (tf1 - ti1) ) / 1.0e9;

        long ti2 = System.nanoTime();
        Object instancia2 = Singleton.getInstance();
        long tf2 = System.nanoTime();
        double tt2 = ( (double) (tf2 - ti2) ) / 1.0e9;

        System.out.println(tt1);
        System.out.println(tt2);

    }
}
