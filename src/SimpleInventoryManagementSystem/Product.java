/**
 * The type Product.
 */
public class Product {

    private int id;
    private double price;
    private int quantity;

    /**
     * Instantiates a new Product.
     *
     * @param id       the id
     * @param price    the price
     * @param quantity the quantity
     */
    public Product(int id, double price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Gets product ID.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets product price.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets product quantity.
     *
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Increases product price.
     *
     * @param amountToIncreaseBy the amount to increase by
     */
    public void increasePrice(double amountToIncreaseBy) {
        this.price += amountToIncreaseBy;
    }

    /**
     * Decreases product price.
     *
     * @param amountToDecreaseBy the amount to decrease by
     */
    public void decreasePrice(double amountToDecreaseBy) {
        this.price -= amountToDecreaseBy;
    }

    /**
     * Increases product quantity.
     *
     * @param amountToIncreaseBy the amount to increase by
     */
    public void increaseQuantity(int amountToIncreaseBy) {
        this.quantity += amountToIncreaseBy;
    }

    /**
     * Decreases product quantity.
     *
     * @param amountToDecreaseBy the amount to decrease by
     */
    public void decreaseQuantity(int amountToDecreaseBy) {
        this.quantity -= amountToDecreaseBy;
    }

    /**
     * Gets total value of stock.
     *
     * @return the value of stock
     */
    public double getValueOfStock() {
        return this.price * this.quantity;
    }

}