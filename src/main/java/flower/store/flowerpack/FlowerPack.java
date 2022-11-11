package flower.store.flowerpack;

import flower.store.flower.Flower;
import lombok.Getter;
import lombok.Setter;

/**
 * flower pack
 */
@Getter @Setter
public class FlowerPack {

    private final Flower flower;
    private int quantity;
    /**
     *  flowerpack constructor
     * @param flower flower type the user wants to make a pack of
     * @param quantity amount of the flowers in a pack
     * @param <T> is any subtype of Flower
     */
    public <T extends Flower> FlowerPack(final T flower,
                                         final int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    /**
     * get price for all flowers in a pack
     * @return the price of this amount of flowers
     */

    public double getPrice() {
        return flower.getPrice() * quantity;
    }


}
