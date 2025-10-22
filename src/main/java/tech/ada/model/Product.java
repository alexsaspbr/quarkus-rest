package tech.ada.model;

public class Product {

    private Long sku;
    private String description;

    public Product(){}

    public Product(Long sku, String description) {
        this.sku = sku;
        this.description = description;
    }

    public Long getSku() {
        return sku;
    }

    public void setSku(Long sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
