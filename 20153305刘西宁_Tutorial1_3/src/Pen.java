
import java.util.*;

/**
 * 
 */
public abstract class Pen {

    /**
     * Default constructor
     */
    public Pen() {
    }

    /**
     * 
     */
    protected Color color;


    /**
     * @param color 
     * @return
     */
    public void setColor(Color color) {
    	this.color = color;
    }

    /**
     * @param name 
     * @return
     */
    public void draw(String name) {
    }

}