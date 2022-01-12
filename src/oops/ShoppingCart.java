package oops;

import java.math.BigDecimal;

public class ShoppingCart {
    private int numberOfProducts = 0;
    private Product product;
    private static final int TWO_DIGIT_PRECISION =2;

    public void addProducts(Product product, int numberOfProducts) {
        this.setNumberOfProducts(numberOfProducts);
        this.setProduct(product);
    }

    public BigDecimal calculateTotalPrice() {
        return getProduct().getPrice().multiply(BigDecimal.valueOf(getNumberOfProducts())).setScale(TWO_DIGIT_PRECISION, BigDecimal.ROUND_HALF_UP);
    }

    public void setNumberOfProducts(int numberOfProducts) {
        if(numberOfProducts>=0){
            this.numberOfProducts = numberOfProducts;
        }
        else{
            this.numberOfProducts=0;
        }
        //this.numberOfProducts = numberOfProducts;
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
}
