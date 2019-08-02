package testStaticClass;

public class test {

  public static class Inter {

   public static final  Long time= System.currentTimeMillis();

  }

  public static void main(String[] args) {
    int i = 0;
    System.out.println(System.currentTimeMillis());
    String s="hello";
    String s1="girl";
    System.out.println(System.currentTimeMillis());
    System.out.println(Inter.time);



  }
}
