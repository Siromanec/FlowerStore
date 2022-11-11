package flower.store.flowers;

import flower.store.flower.Flower;
import flower.store.flower.FlowerColor;
import flower.store.flower.FlowerType;

/**
 * A red pretty tulip
 */
public class Tulip extends Flower {
    /**
     *  creates a beautiful tulip
     */
    public Tulip() {
        super();
        setColor(FlowerColor.RED);
        setFlowerType(FlowerType.TULIP);
    }
}
