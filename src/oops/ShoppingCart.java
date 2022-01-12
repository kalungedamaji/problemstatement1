package oops;

import java.math.BigDecimal;

public class ShoppingCart {
    private int numberOfProducts = 0;
    private Product product;

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public Product getProduct() {
        return product;
    }

    public void addProducts(Product product, int numberOfProducts) {
        setNumberOfProducts(numberOfProducts);
        setProduct(product);
    }

    public BigDecimal calculateTotalPrice() {
        return (getProduct().getPrice().multiply(BigDecimal.valueOf(getNumberOfProducts())).setScale(2, BigDecimal.ROUND_HALF_UP)) ;
    }
}
