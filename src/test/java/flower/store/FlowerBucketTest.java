package flower.store;

import flower.store.bucket.FlowerBucket;
import flower.store.flower.Flower;
import flower.store.flowerpack.FlowerPack;
import flower.store.flowers.Rose;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

/**
 * tests for flowerbucket
 * @hidden
 */

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    /**
     * setup
     */
    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    /**
     * test price
     *
     */
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }
}
