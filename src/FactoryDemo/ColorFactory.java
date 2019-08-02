package FactoryDemo;

public class ColorFactory extends  AbstractFactort{
  @Override
  public Color getColor(String color) {
    if (color.equalsIgnoreCase("red")) {
      return new Red();
    }
    if (color.equalsIgnoreCase("black")) {
      return new Black();
    }
    return null;
  }
  @Override
  public Fruit getFruit(String fruit){
    return null;
  }
}
