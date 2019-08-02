package FactoryDemo;

public class FruitFactory1 extends AbstractFactort {

  @Override
  public Fruit getFruit(String fruit) {
    if (fruit.equalsIgnoreCase("apple")) {
      return new Apple();
    }
    if (fruit.equalsIgnoreCase("banana")) {
      return new Banana();
    }
    return null;
  }

  @Override
  Color getColor(String color) {
    return null;
  }
}
