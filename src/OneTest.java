import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class OneTest {

  @Test
  public void test() {
   //Assert.fail("some error");
    String string = "bye";
    int i = 5;
    int j = 9;
    List<String> list = new LinkedList<>();
    Assert.assertSame(string, "bye");
    Assert.assertTrue(i < j);
    try {
      list.get(0);
      Assert.fail("some error");
    } catch (Exception e) {
      System.out.println("catch");
    }
  }

}
