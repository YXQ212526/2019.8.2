package SingletonDemo;

//2.饿汉 线程安全
public class Singleton2 {

  static Singleton2 instance = new Singleton2();

  private Singleton2() {}

  public static Singleton2 getInstance() {

    return instance;
  }
}
