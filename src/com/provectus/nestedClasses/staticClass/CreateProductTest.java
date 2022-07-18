package com.provectus.nestedClasses.staticClass;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class CreateProductTest {
    public void testProduct() {
        //prod1
        Product p1 = new Product();
        p1.name = "prod1";
        createProduct(p1);
        //prod2
        Product p2 = new Product();
        p2.name = "prod2";
        createProduct(p2);
        //prod3
        Product p3 = new Product();
        p3.name = "prod3";
        createProduct(null);
    }

    private void createProduct(Product product) {
        System.out.println(product.name);
    }

    public static class Product {
        String name, id, desc;
        double prices;
    }
}
