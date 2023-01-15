
public class Product {
    private String name;
    private int price;
    private int quantity;
    private String category;


    public Product(String getName, int getPrice, int getQuantity, String getCategory) {
        name = getName;
        price = getPrice;
        quantity = getQuantity;
        category = getCategory;

    }

    public boolean hasStock() {
        if (quantity > 0) {
            return true;
        } else return false;
    }

    public boolean isCategory(String givenCategory) {

        if (givenCategory.equals(category)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "My product has name %s and price %s and quantity %s and his category is %s . ".formatted(this.name, this.price, this.quantity, this.category);
    }
}