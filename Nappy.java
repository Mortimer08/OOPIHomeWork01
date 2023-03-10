public class Nappy extends KidsGood {
    Integer size;
    Integer minWheight;
    Integer maxWheight;
    String type;

    Nappy(String name, Integer price, Integer quantity, String mesure, Integer minAge, boolean hypoalergenic,
            Integer size, Integer minWheight, Integer maxWheight, String type) {
        super(name, price, quantity, mesure, minAge, hypoalergenic);
        this.size = size;
        this.minWheight = minWheight;
        this.maxWheight = maxWheight;
        this.type = type;
    }

    @Override
    public String toString() {
        String description = super.toString() + String.format("Размер: %d, Вес ребёнка, от %d до %d, тип: %s",
                this.size, this.minWheight, this.maxWheight, this.type);
        return description;
    }
}
