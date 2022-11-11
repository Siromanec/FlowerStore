package flower.store.flower;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * stores general data about a flower
 */

@Getter @Setter @ToString
public class FlowerSpec {
    private FlowerColor color;
    private double sepalLength;
    /**
     * constructor
     */
    public FlowerSpec() { }
    /**
     * handles input
     * @param clr color of the flower
     */
    public void setColor(FlowerColor clr) {
        color = clr;
    }

    /**
     * handles input
     * @param clr color of the flower
     */
    public void setColor(String clr) {
        if (clr.equalsIgnoreCase("red")) {
            color = FlowerColor.RED;
        }
        else if (clr.equalsIgnoreCase("blue")) {
            color = FlowerColor.BLUE;
        }
        else if (clr.equalsIgnoreCase("white")) {
            color = FlowerColor.WHITE;
        }
    }



}
