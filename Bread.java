

public class Bread extends Food {
    String flour;

    Bread(String name, Integer price, Integer quantity, String mesure, String bbDate, String flour) {
        super(name, price, quantity, mesure, bbDate);
        this.flour = flour;
    }

    @Override
    public String toString() {
        String description = super.toString() + String.format("Тип муки: %s", this.flour);
        return description;
    }
}
