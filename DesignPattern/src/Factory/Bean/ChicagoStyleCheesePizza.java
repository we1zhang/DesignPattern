package Factory.Bean;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style Deep Dish Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";//大蒜番茄酱
        toppings.add("Grated Reggiano Cheese");//意大利高级干酪
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
