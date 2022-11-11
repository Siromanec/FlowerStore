package flower.store.flowers;

import flower.store.flower.Flower;
import flower.store.flower.FlowerColor;
import flower.store.flower.FlowerType;

/**
 * the rose flower
 */
public class Rose extends Flower {
    /**
     * creates a red rose
     */
    public Rose() {
        super();
        setColor(FlowerColor.RED);
        setFlowerType(FlowerType.ROSE);
    }
}
