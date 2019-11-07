package coffee;

public class CoffeeApp {
    public static void main(String[] args) {
        ElectricHeater heater = new ElectricHeater();
        Thermosiphon pump = new Thermosiphon(heater);
        CoffeeMaker maker = new CoffeeMaker(heater, pump);

        maker.brew();
    }
}
