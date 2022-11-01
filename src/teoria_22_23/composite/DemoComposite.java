package teoria_22_23.composite;

public class DemoComposite {

    public static void main(String[] args) {

        Playlist sabina = new Playlist("Sabina's hits");
        sabina.add(new Song("Princesa", "Joaquín Sabina"));
        sabina.add(new Song("Calle melancolía", "Joaquín Sabina"));

        Playlist garcia = new Playlist("Manolo Garcia's hits");
        garcia.add(new Song("Pájaros de barro", "Manolo García"));
        garcia.add(new Song("Zapatero", "Manolo García"));
        garcia.add(new Song("A San Fernando, un ratito a pie y otro caminando", "Manolo García"));

        Playlist mySongs = new Playlist("My Songs");
        mySongs.add(sabina);
        mySongs.add(garcia);
        mySongs.add(new Song("Penso positivo", "Lorenzo Jovanotti"));

        mySongs.play();

    }
}
