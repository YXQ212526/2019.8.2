package FactoryDemo;

public class Main {

  public static void main(String[] args) {

    FruitFactory fruitFactory = new FruitFactory();
    Fruit apple = fruitFactory.getFruit("apple");
    apple.miss();

    ExAbstractFactory exAbstractFactory = new ExAbstractFactory();
    AbstractFactort colorFactory = exAbstractFactory.getFactory("color");
    Color color = colorFactory.getColor("red");
    color.what();
  }
}
