package teoria_21_22.observer_theoryclass;

import java.util.ArrayList;

public class YouTubeChannel implements Subject {

    private String status;
    private String channelName;
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public YouTubeChannel(String n, String s) {
        status = s;
        channelName = n;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getChannelName() {
        return channelName;
    }

    @Override
    public void registerObserver(Observer obs) {
        this.observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        this.observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update(this.status);
        }
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }
}
