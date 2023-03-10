public class Eggs extends Food {
    Integer pcs;

    Eggs(String name, Integer price, Integer quantity, String mesure, String bbDate, Integer pcs) {
        super(name, price, quantity, mesure, bbDate);
        this.pcs = pcs;
    }

    @Override
    public String toString() {
        String description = super.toString() + String.format("Количество в упаковке: %d", this.pcs);
        return description;
    }
}
