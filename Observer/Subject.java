public abstract Subject{
    List observers = new ArrayList<>();

    public void add(Observer o){
        observers.add(o);
    }

    public void remove(Observer o){
        observers.remove(o);
    }

    public void notify(){
        Iterator it = observers.iterator();
        while(it.hasNext()){
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }
}
