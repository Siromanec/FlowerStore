package flower.store.flower;

/**
 * flower factory
 */
public class FlowerFactory {
    /**
     * constructor
     */
    public FlowerFactory() { }
    /**
     * creates flowers
     * @param price price of the flower
     * @param color color of the flower
     * @param sepalLength sepalLength of the flower
     * @return a new flower
     */
    public static Flower createFlower(final double price,
                                      final FlowerColor color,
                                      final double sepalLength) {
        Flower flower = new Flower();
        flower.setPrice(price);
        flower.setColor(color);
        flower.setSepalLength(sepalLength);
        return flower;
    }
}
