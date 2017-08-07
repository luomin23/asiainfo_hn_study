package com.asiainfo.chapter1.luomin.container;


import com.google.common.base.Objects;

import java.util.List;

/**
 * @author Luoo
 * @create 2017-07-31 10:39
 */

public class Beer {
    private String brand;
    private String type;
    private int degrees;
    private double alcoholPercentage;
    private List<String> ingredients;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Beer)) return false;
        Beer beer = (Beer) o;
        return degrees == beer.degrees &&
                Double.compare(beer.alcoholPercentage, alcoholPercentage) == 0 &&
                Objects.equal(brand, beer.brand) &&
                Objects.equal(type, beer.type) &&
                Objects.equal(ingredients, beer.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brand, type, degrees, alcoholPercentage, ingredients);
    }
}
