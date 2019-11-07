package coffee;

import dagger.Lazy;

import javax.inject.Singleton;

public class CoffeeApp {
    @Singleton
    public interface CoffeeShop {
        CoffeeMaker maker();
    }

    static class Shop implements CoffeeShop {

        @Override
        public CoffeeMaker maker() {
            ElectricHeater heater = new ElectricHeater();
            Thermosiphon pump = new Thermosiphon(heater);
            return new CoffeeMaker(() -> heater, pump);
        }
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = new Shop();

        coffeeShop.maker().brew();
    }
}
