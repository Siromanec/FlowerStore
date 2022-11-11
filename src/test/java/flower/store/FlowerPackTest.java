package flower.store;

import flower.store.flower.Flower;
import flower.store.flowerpack.FlowerPack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * test for flowers
 * @hidden
 */
public class FlowerPackTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int MAX_COUNT = 100;

    private Flower flower;

    /**
     * setup
     */
    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    /**
     * test price
     */
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int count = RANDOM_GENERATOR.nextInt(MAX_COUNT);
        flower.setPrice(price);
        FlowerPack pack = new FlowerPack(flower, count);


        Assertions.assertEquals(price * count, pack.getPrice());
    }


}