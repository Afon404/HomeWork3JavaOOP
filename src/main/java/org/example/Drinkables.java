package org.example;

import java.math.BigDecimal;

public class Drinkables extends Product {
    private Double volume;

    public Drinkables(String name, BigDecimal price, Double volume) {
        super(name, price);
        this.volume = volume;
    }


    public Double getVolume() {
        return volume;
    }


    @Override
    public String toString() {
        return super.toString() + "объем = " + volume + " ";
    }



}