// Priyanshu Shekhar
// Professor Sun 
// CS 3560 
// 13 December 2022

public interface Subject {

  void register(Observer o);

  void unregister(Observer o);

  void notifyObservers();

  String getUpdate(Observer o);
}
