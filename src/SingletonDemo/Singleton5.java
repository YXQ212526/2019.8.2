package SingletonDemo;

//5.懒汉 线程安全
public class Singleton5 {

  private static class inter {

    private static final Singleton5 singleton5 = new Singleton5();
  }

  private Singleton5() {}


  public static final Singleton5 getInstance() {
    return inter.singleton5;
  }

}
