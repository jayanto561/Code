interface Burger {
String getDescription();
double getCost();
}

// Base Component/ Concrete component
class PlainBurger implements Burger {
@Override
public String getDescription() {
return "Plain Burger";
}

@Override
public double getCost() {
return 5.0;
}
}

// Abstract Decorator/interface
abstract class BurgerDecorator implements Burger {
protected Burger decoratedBurger;

public BurgerDecorator(Burger decoratedBurger) {
this.decoratedBurger = decoratedBurger;

}

@Override
public String getDescription() {
return decoratedBurger.getDescription();
}

@Override
public double getCost() {
return decoratedBurger.getCost();
}
}

// Concrete Decorator
class CheeseDecorator extends BurgerDecorator {
public CheeseDecorator(Burger decoratedBurger) {
super(decoratedBurger);
}

@Override
public String getDescription() {
return decoratedBurger.getDescription() + ", Cheese";
}

@Override
public double getCost() {

return decoratedBurger.getCost() + 1.0;
}
}

// Test class
public class Main {
public static void main(String[] args) {
// Plain Burger
Burger burger = new PlainBurger();
System.out.println("Description: " + burger.getDescription());
System.out.println("Cost: $" + burger.getCost());

// Burger with Cheese
Burger cheeseBurger = new CheeseDecorator(new PlainBurger());
System.out.println("\nDescription: " + cheeseBurger.getDescription());
System.out.println("Cost: $" + cheeseBurger.getCost());
}
}