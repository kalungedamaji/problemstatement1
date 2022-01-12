package oops;

import java.math.BigDecimal;

public class ShoppingCart {
     private int numberOfProducts = 0;
     private Product product;

        public void setAddProducts (Product product, int numberOfProducts){
            this.product = product;
            this.numberOfProducts = numberOfProducts;
        }

        public void setNumberOfProducts(int numberOfProducts) {
            if(numberOfProducts >= 0) {
                this.numberOfProducts = numberOfProducts;
            }
            else {
                this.numberOfProducts = 0;
            }
        }

        public Product getProduct() {
            return this.product;
        }


        public int getNumberOfProducts() {
            return this.numberOfProducts;
        }


        public BigDecimal calculateTotalPrice () {
            return getProduct().getPrice().multiply(BigDecimal.valueOf(getNumberOfProducts())).setScale(2, BigDecimal.ROUND_HALF_UP);
        }


}

