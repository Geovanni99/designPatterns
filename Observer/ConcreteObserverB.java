
public class ConcreteObserverB implements Observer{

    public void update(Observable o){
        ObservableData data = (ObservableData) o;
        data.getData();
    }
}
