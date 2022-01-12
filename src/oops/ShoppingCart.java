package oops;

import java.math.BigDecimal;

public class ShoppingCart {
    private int numberOfProducts = 0;
    private Product product;
    public void setNumberOfProducts(int numberOfProducts) {
        if(numberOfProducts>=0)
        {
            this.numberOfProducts = numberOfProducts;
        }
        else
        {
            System.out.println("Enter the number of product value as positive.");
            this.numberOfProducts=0;
        }

    }
    public int getNumberOfProducts() {
        return numberOfProducts;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Product getProduct() {
        return product;
    }
    public void addProducts(Product product, int numberOfProducts) {
        this.setNumberOfProducts(numberOfProducts);
        this.setProduct(product);
    }
    public BigDecimal calculateTotalPrice() {
        return (getProduct().getPrice().multiply(BigDecimal.valueOf(getNumberOfProducts())).setScale(2, BigDecimal.ROUND_HALF_UP)) ;
    }
}
