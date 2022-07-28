package com.provectus.collections.homeTasks;

import java.util.Comparator;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class Product implements Comparable<Product> {
    private String name;
    private double price;
    private Integer quantity;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.price > o.price) return 1;
        if (this.price < o.price) return -1;
        return 0;
    }

    class comparatorByName implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

//    @Override public int compareToNamePrice(Product o) {
//        if (this.name.compareTo(o.name) > 0) return 1;
//        if (this.name.compareTo(o.name) < 0) return -1;
//        if (this.name.compareTo(o.name) == 0) {
//        return this.price > o.price ? 1 : -1;
//        }
//        return 0;
//    }
}
