import java.util.HashMap;
import java.util.Map;

/**
 * The type Inventory.
 */
public class Inventory {

    private Map<Integer, Product> inv;

    /**
     * Instantiates a new Inventory.
     */
    public Inventory() {
        inv = new HashMap<Integer, Product>();
    }

    /**
     * Add product.
     *
     * @param product the product
     * @return the boolean true if added false if not
     */
    public boolean addProduct(Product product) {
        if (this.inv.containsKey(product.getId()))
            return false;
        // add product to Map
        inv.put(product.getId(), product);
        return true;
    }

    /**
     * Remove product.
     *
     * @param id the product id
     */
    public void removeProduct(int id) {
        inv.remove(id);
    }

    /**
     * Increase product price.
     *
     * @param id     the product id
     * @param amount the amount
     */
    public void increaseProductPrice(int id, double amount) {
        this.inv.get(id).increasePrice(amount);
    }

    /**
     * Decrease product price.
     *
     * @param id     the product id
     * @param amount the amount
     */
    public void decreaseProductPrice(int id, double amount) {
        this.inv.get(id).decreasePrice(amount);
    }

    /**
     * Increase product quantity.
     *
     * @param id     the product id
     * @param amount the amount
     */
    public void increaseProductQuantity(int id, int amount) {
        this.inv.get(id).increaseQuantity(amount);
    }

    /**
     * Decrease product quantity.
     *
     * @param id     the product id
     * @param amount the amount
     */
    public void decreaseProductQuantity(int id, int amount) {
        this.inv.get(id).decreaseQuantity(amount);
    }

    /**
     * Print inventory.
     */
    public void printInventory() {
        System.out.println();
        for (Product product : this.inv.values()) {
            System.out.println(
                    "ID: " + product.getId() +
                    "; Price: " + product.getPrice() +
                    "; Quantity: " + product.getQuantity() +
                    ". Total value of this products stock is: " + product.getValueOfStock()
            );
        }
    }

}