/**
 * The SimpleInventoryManagementSystem program implements an application that
 * manages an inventory of products. Storing id, price and quantity for each
 * product and allowing simple operations to be performed on them.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-11
 */
public class Application {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Inventory inv = new Inventory();

        Product product1 = new Product(1,2,3);
        Product product2 = new Product(2,3.11,5);
        Product product3 = new Product(3,432.30,7);
        Product product4 = new Product(4,0.20,9);
        Product product5 = new Product(5,1,11);
        Product product6 = new Product(1,0.11,3000);

        inv.addProduct(product1);
        inv.addProduct(product2);
        inv.addProduct(product3);
        inv.addProduct(product4);
        inv.addProduct(product5);
        inv.addProduct(product6); // shouldn't be added as has matching ID

        inv.printInventory();

        inv.removeProduct(product4.getId());
        inv.increaseProductPrice(product3.getId(), 20.11);
        inv.decreaseProductPrice(product5.getId(), 0.10);
        inv.increaseProductQuantity(product2.getId(), 100);
        inv.decreaseProductQuantity(product1.getId(), 2);

        inv.printInventory();

    }

}
