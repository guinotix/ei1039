package teoria_21_22.observer_theoryclass;

public class YouTubeFollower implements Observer, Playable {

    public String followerName;
    public YouTubeChannel channel;

    public YouTubeFollower(YouTubeChannel c, String f) {
        channel = c;
        followerName = f;
        c.registerObserver(this);

    }

    @Override
    public void update(String s) {

        if (s.equals("on")) {
            System.out.print("Update! The channel is on now and ");
            play();
        } else {
            System.out.println("Update! The channel is down again");
        }

    }

    @Override
    public void play() {
        System.out.println(followerName + " is watching the channel");

    }
}
