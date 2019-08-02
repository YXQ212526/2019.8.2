import org.junit.Assert;
import org.junit.Test;


public class TestStudent {

  Student student = new Student("ming", 13, false, null);

  @Test
  public void myTest() {
    Assert.assertEquals("ming", student.getName());
    Assert.assertFalse(student.getSex());
    Assert.assertNull(student.getPhone());
  }


}
