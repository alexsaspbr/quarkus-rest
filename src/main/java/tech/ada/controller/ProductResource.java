package tech.ada.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import tech.ada.model.Product;
import tech.ada.service.ProductService;

@Path("/products")
public class ProductResource {

    private final ProductService productService;

    public ProductResource(ProductService productService) {
        this.productService = productService;
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response allProducts() {
        return Response.ok(this.productService.allProducts()).build();
    }

    @GET
    @Path("/{sku}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findBySku(Long sku) {
        return Response.ok(this.productService.findBySku(sku)).build();

    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Product product) {
        return Response.ok(this.productService.create(product)).build();
    }

    //DELETE

}
