public class Drink extends Product {
    Double volume;

    Drink(String name, Integer price, Integer quantity, String mesure, Double volume) {
        super(name, price, quantity, mesure);
        this.volume = volume;
    }
    @Override
    public String toString() {
        String description = super.toString()+String.format("Объём: %.1f%n", this.volume);
        return description;
    }
}
