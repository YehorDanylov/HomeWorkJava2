package com.example.shop;
public class ShopApp {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        Product product1 = new Product("Apple", 0.50);
        Product product2 = new Product("Banana", 0.30);

        productService.addProduct(product1);
        productService.addProduct(product2);

        productService.getAllProducts().forEach(product -> {
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
        });
    }
}
