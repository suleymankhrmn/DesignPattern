package builder;

public class Main {
    public static void main(String[] args){
        Pizza.PizzaBuilder myPizzaBuilder = new Pizza.PizzaBuilder(15,"Italiano");
        myPizzaBuilder.withOptionalBacon(true);
        myPizzaBuilder.withOptionalMozarella(true);
        Pizza myFavoritePizza = myPizzaBuilder.buildPizza();
        System.out.println(myFavoritePizza.getName());
    }
}
