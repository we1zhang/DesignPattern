package Factory;

import Factory.Bean.CheesePizza;
import Factory.Bean.GreekPizza;
import Factory.Bean.PepperoniPizza;
import Factory.Bean.Pizza;

public class PizzaStore {

    Pizza orderPizza(){
        Pizza pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    Pizza orderPizza(String type){
        Pizza pizza  = null;
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("greek")){
            pizza = new GreekPizza();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza2(String type){
        Pizza pizza  = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    class SimplePizzaFactory{
        public Pizza createPizza(String type){
            Pizza pizza  = null;
            if (type.equals("cheese")){
                pizza = new CheesePizza();
            }else if (type.equals("greek")){
                pizza = new GreekPizza();
            }else if (type.equals("pepperoni")){
                pizza = new PepperoniPizza();
            }
            return pizza;
        }
    }
}
