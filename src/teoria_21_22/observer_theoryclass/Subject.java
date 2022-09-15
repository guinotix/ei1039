package teoria_21_22.observer_theoryclass;

public interface Subject {

    public void registerObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObservers();

}
