public class KidsGood extends Product {
    Integer minAge;
    Boolean hypoalergenic;

    KidsGood(String name, Integer price, Integer quantity, String mesure, Integer minAge, boolean hypoalergenic) {
        super(name, price, quantity, mesure);
        this.minAge = minAge;
        this.hypoalergenic = hypoalergenic;
    }

    @Override
    public String toString() {
        String description = super.toString() + String.format("Минимальный возраст: %d, Гипоаллергенность: %s",
                this.minAge, this.hypoalergenic ? "Да" : "Нет");
        return description;
    }
}
