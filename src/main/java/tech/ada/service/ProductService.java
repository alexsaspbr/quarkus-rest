package tech.ada.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import tech.ada.model.Product;
import tech.ada.repository.ProductRepository;

import java.util.List;

@ApplicationScoped
public class ProductService {

    private final ProductRepository productRepository;

    @Inject
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> allProducts() {
        return this.productRepository.findAll();
    }

    public Product findBySku(Long sku) {
        return this.productRepository.findBySku(sku);
    }

    public Product create(Product product) {
        return this.productRepository.save(product);
    }

    public String delete(Long sku) {
        return this.productRepository.remove(sku);
    }
}
