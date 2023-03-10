public class ToiletPaper extends Hygiene {
    Integer layers;

    ToiletPaper(String name, Integer price, Integer quantity, String mesure, Integer laysers) {
        super(name, price, quantity, mesure, laysers);
        this.layers = laysers;
    }

    @Override
    public String toString() {
        String description = super.toString() + String.format("Слоёв: %d", this.layers);
        return description;
    }
}
