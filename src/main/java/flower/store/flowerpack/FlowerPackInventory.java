package flower.store.flowerpack;

import flower.store.flower.Flower;

/**
 * Is used to group and manage flower packs
 */
public class FlowerPackInventory extends FlowerPack {
    /**
     *  flowerpack inventory constructor
     * @param flower flower type the user wants to make a pack of
     * @param quantity amount of the flowers in a pack
     * @param <T> is any subtype of Flower
     */
    public <T extends Flower> FlowerPackInventory(T flower, int quantity) {
        super(flower, quantity);
    }

    /**
     * takes flowers from flower pack
     * @param newPackSize the amount of flowers user wants
     *                    to take away from the inventory
     * @return a new flower pack inventory with given amount of flowers
     */
    public FlowerPack splitFLowerPack(int newPackSize) {
        if (newPackSize <= getQuantity()) {
            setQuantity(getQuantity() - newPackSize);
            return new FlowerPack(getFlower(), newPackSize);
        }
        return null;

    }

    /**
     * adds flowers to pack
     * @param amount amount of flowers user wants to add to inventory
     */
    public void addFLowers(int amount) {
        setQuantity(getQuantity() + amount);
    }
}
