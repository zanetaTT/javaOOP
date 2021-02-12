public abstract class Product implements ProductPricingService{
    private String id;
    private double value;

    public Product(String id, Double value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public double getValue() {
        return value;
    }
}
