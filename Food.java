import java.time.LocalDate;

public class Food extends Product {
    LocalDate bbDate;

    Food(String name, Integer price, Integer quantity, String mesure, String date) {
        super(name, price, quantity, mesure);
        this.bbDate = LocalDate.parse(date);
    }
    @Override
    public String toString() {
        String description = super.toString()+String.format("Срок годности: %s%n", this.bbDate);
        return description;
    }
}