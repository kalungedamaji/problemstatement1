package oops;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;

    public void setPrice(BigDecimal price) {
        this.price=price;
    }

    public void setName(String name) {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public BigDecimal getPrice()
    {
        return price;
    }
    
}
