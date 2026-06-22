public class SearchDemo {

    static int linearSearch(Product[] products, String key) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(key)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Mouse", "Accessories"),
                new Product(3, "Keyboard", "Accessories")
        };

        int result = linearSearch(products, "Mouse");

        if (result != -1) {
            System.out.println("Product Found at index " + result);
        } else {
            System.out.println("Product Not Found");
        }
    }
}