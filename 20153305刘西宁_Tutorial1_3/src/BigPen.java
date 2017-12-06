
import java.util.*;

/**
 * 
 */
public class BigPen extends Pen {

    /**
     * Default constructor
     */
    public BigPen() {
    }

    /**
     * @param name 
     * @return
     */
    public void draw(String name) {
    	String penType = "大号毛笔绘制";
    	this.color.bepaint(penType, name);
    }

}