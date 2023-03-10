import java.time.LocalDate;

public class Milk extends Drink {
    Double fat;
    LocalDate bbDate;

    Milk(String name, Integer price, Integer quantity, String mesure, Double volume, Double fat, String date) {
        super(name, price, quantity, mesure, volume);
        this.fat = fat;
        this.bbDate = LocalDate.parse(date);
    }

    @Override
    public String toString() {
        String description = super.toString() + String.format("Содержание жира: %.1f, Срок кодности: %s",
                this.fat, this.bbDate);
        return description;
    }
}
