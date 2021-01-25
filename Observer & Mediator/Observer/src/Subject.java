import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private String state = "Operational";
    private String server = "ABC";

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for(Observer observer : observers) {
            observer.commonupdate();
            break;
        }
    }
}
