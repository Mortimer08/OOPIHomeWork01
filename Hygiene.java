public class Hygiene extends Product {
    Integer pcs;
    Hygiene(String name, Integer price, Integer quantity, String mesure, Integer pcs){
        super(name, price, quantity, mesure);
        this.pcs = pcs;
    }
    @Override
    public String toString() {
        String description = super.toString()+String.format("Штук в упаковке: %d", pcs);
        return description;
    }
}
