package FactoryDemo;

public class FruitFactory {

  public Fruit getFruit(String fruit) {
    if (fruit.equalsIgnoreCase("apple")) {
      return new Apple();
    }
    if (fruit.equalsIgnoreCase("banana")) {
      return new Banana();
    }
    return null;
  }

}


