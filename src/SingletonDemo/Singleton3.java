package SingletonDemo;

//3.懒汉，线程安全
public class Singleton3 {


  static Singleton3 instance;

  private Singleton3() {}

  public static synchronized Singleton3 getInstance() {
    if (instance == null) {
      instance = new Singleton3();
    }
    return instance;
  }
}
