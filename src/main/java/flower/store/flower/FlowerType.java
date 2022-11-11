package flower.store.flower;

/**
 * lists all possible flowers
 */
public enum FlowerType {
    /**
     * chamomile
     */
    CHAMOMILE("chamomile"),
    /**
     * rose
     */
    ROSE("rose"),
    /**
     * tulip
     */
    TULIP("tulip");
    private final String stringRepresentation;

    /**
     * sets all enum values
     * @param stringRepresentation string representation of the type
     */
    FlowerType(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    /**
     * to string
     * @return stringRepresentation of the type
     */
    @Override
    public String toString() {
        return stringRepresentation;
    }
}
