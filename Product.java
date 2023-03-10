

public class Product {
    String name;
    Integer price;
    Integer quantity;
    String mesure;

    protected Product(String name, Integer price, Integer quantity, String mesure) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.mesure = mesure;
    }

    @Override
    public String toString() {
        return String.format("Наименование товара: %s, цена: %d, количество: %d, единица изменения: %s%n", this.name,
                this.price, this.quantity, this.mesure);
    }
}
