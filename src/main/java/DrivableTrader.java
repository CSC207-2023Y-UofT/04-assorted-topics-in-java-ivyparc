/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */
import java.util.List;

class DrivableTrader extends Trader<Drivable> {

    /**
     * Construct a DrivableTrader, giving them the given money.
     *
     * @param money     The Trader's money
     */
    public DrivableTrader(int money) {
        super(money);
    }

    @Override
    public int getSellingPrice(Drivable obj) {
        if (obj instanceof Tradable) {
            return ((Tradable) obj).getPrice() + obj.getMaxSpeed();
        } else {
            return Tradable.MISSING_PRICE;
        }
    }

}