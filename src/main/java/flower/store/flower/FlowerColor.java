package flower.store.flower;

/**
 * all possible flower colors
 */
public enum FlowerColor {
    /**
     * red
     */
    RED("red"), //("#FF0000"),
    /**
     * blue
     */

    BLUE("blue"), //("#0000FF"),
    /**
     * white
     */
    WHITE("white"); //("#000000");
    private final String stringRepresentation;

    /**
     * sets all enum values
     * @param stringRepresentation string representation of the color
     */
    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    /**
     * to string
     * @return stringRepresentation of the color
     */
    @Override
    public String toString() {
        return stringRepresentation;
    }
}
