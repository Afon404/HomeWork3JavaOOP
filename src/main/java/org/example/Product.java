package org.example;

import java.math.BigDecimal;

public class Product implements Comparable<Product>  {
    private String name;
    private BigDecimal price;

    public Product() {
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "\"" + name + "\" стоит: " + price + " рулей. ";
    }



/////compare
    @Override
    public int compareTo(Product o ) {
        return price.compareTo(o.getPrice());

    }





}
