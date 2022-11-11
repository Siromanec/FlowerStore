package flower.store;

import flower.store.flower.Flower;
import flower.store.flower.FlowerSpec;

import java.util.ArrayList;

import java.util.List;

/**
 * flower inventory. here we store our flowers
 */
public class FlowerInventory {
    private final List<Flower> inventory = new ArrayList<>();


    /**
     * constructor for flower inventory
     * currently has only three flowers
     */
    public FlowerInventory() {




    }

    /**
     * adds flowers to inventory
     * @param flower flower user wants to add
     */
    public void addFlower(Flower flower) {
        inventory.add(flower);
    }
    /**
     * search tool to find flowers in the inventory
     * @param searchSpec - is the specification for search
     * @return a list of flowers which fit the specification
     * */
    public List<Flower> search(FlowerSpec searchSpec) {

        List<Flower> matchingFlowers = new ArrayList<>();
        for (Flower flower : inventory) {
            FlowerSpec flowerSpec = flower.getSpec();
            if (searchSpec.getColor() != flowerSpec.getColor()) {
                continue;
            }
            if (searchSpec.getSepalLength() != flowerSpec.getSepalLength()) {
                continue;
            }
            matchingFlowers.add(flower);
        }
        return matchingFlowers;
    }
}

