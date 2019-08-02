package FactoryDemo;

public class ExAbstractFactory {

  public AbstractFactort getFactory(String choice){
    if (choice.equalsIgnoreCase("fruit")) {
      return new FruitFactory1();
    }
    if (choice.equalsIgnoreCase("color")) {
      return new ColorFactory();
    }
    return null;
  }
}
