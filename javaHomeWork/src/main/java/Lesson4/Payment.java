package Lesson4;

public class Payment {

    private Product[] products;
    private double generalPrice;

    public Payment(Product[] products) {
        this.products = products;
        for (Product product : products) {
            generalPrice += product.getProductPrice();
        }
    }

    public void process() {
        if (products == null || products.length == 0) {
            System.err.println("No products for processing");
        } else {
            System.out.print("Products: ");
            for (Product product : products) {
                System.out.print(product.name + "; ");
            }
            System.out.println("Total price: " + generalPrice);
        }
    }

    public static class Product {

        private final double productPrice;
        private final String name;

        public Product(double productPrice, String name) {
            this.productPrice = productPrice;
            this.name = name;
        }

        public double getProductPrice() {
            return productPrice;
        }
    }
}

