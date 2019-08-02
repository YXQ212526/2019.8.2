package SingletonDemo;

//1.懒汉 线程不安全
public class Singleton1 {

  static Singleton1 instance;

  private Singleton1() {}

  public static Singleton1 getInstance() {
    if (instance == null) {
      instance = new Singleton1();
    }
    return instance;
  }
}
