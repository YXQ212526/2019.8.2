public class Student {

  private String name;
  private int age;
  private boolean isGirl;
  private String phone;

  Student(String name, int age, boolean isGirl, String phone) {
    this.age = age;
    this.name = name;
    this.isGirl = isGirl;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public boolean getSex() {
    return isGirl;
  }

  public String getPhone() {
    return phone;
  }
}
