//package observer.other;
//
//import observer.Observer;
//import observer.Subject;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ConcreteSubject implements Subject {
//
//    List<Observer> observers = new ArrayList<>();
//
//    @Override
//    public void registerObserver(Observer observer) {
//        observers.add(observer);
//    }
//
//    @Override
//    public void removeObserver(Observer observer) {
//        observers.remove(observer);
//    }
//
//    @Override
//    public void notifyObservers() {
//        for(Observer observer : observers){
//            observer.updateData();
//        }
//    }
//}
