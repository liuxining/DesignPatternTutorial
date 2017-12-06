
import java.util.*;

/**
 * 
 */
public class SmallPen extends Pen {

    /**
     * Default constructor
     */
    public SmallPen() {
    }

    /**
     * @param name 
     * @return
     */
    public void draw(String name) {
    	String penType = "小号毛笔绘制";
    	this.color.bepaint(penType, name);
    }

}