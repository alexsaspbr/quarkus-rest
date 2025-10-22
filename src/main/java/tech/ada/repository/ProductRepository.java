package tech.ada.repository;

import jakarta.enterprise.context.ApplicationScoped;
import tech.ada.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApplicationScoped
public class ProductRepository {

    private List<Product> products = null;

    public ProductRepository(){
        this.products = new ArrayList<>();
        this.products.add(new Product(100L, "TV Smart 55`"));
        this.products.add(new Product(101L, "Kindle"));
        this.products.add(new Product(102L, "Alexa"));
        this.products.add(new Product(103L, "IPhone 17"));
        this.products.add(new Product(104L, "PlayStation 5"));
    }

    public List<Product> findAll() {
        return this.products;
    }


    public Product findBySku(Long sku) {
        return this.products.stream()
                .filter(product -> product.getSku().equals(sku)).findFirst().orElse(null);
    }

    public Product save(Product product) {
        this.products.add(product);
        return product;
    }

    public String remove(Long sku) {
        Product productBySku = findBySku(sku);
        if(Objects.nonNull(productBySku)){
            this.products.remove(productBySku);
            return "Produto removido";
        } else {
            return "Produto nao encontrado";
        }
    }


}
