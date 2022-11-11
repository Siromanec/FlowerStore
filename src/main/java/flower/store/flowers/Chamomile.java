package flower.store.flowers;

import flower.store.flower.Flower;
import flower.store.flower.FlowerColor;
import flower.store.flower.FlowerType;

/**
 * the chamomile
 */
public class Chamomile extends Flower {
    /**
     * creates a white chamomile
     */
    public Chamomile() {
        super();
        setColor(FlowerColor.WHITE);
        setFlowerType(FlowerType.CHAMOMILE);
    }
}
