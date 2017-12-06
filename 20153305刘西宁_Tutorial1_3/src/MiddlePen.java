
import java.util.*;

/**
 * 
 */
public class MiddlePen extends Pen {

    /**
     * Default constructor
     */
    public MiddlePen() {
    }

    /**
     * @param name 
     * @return
     */
    public void draw(String name) {
    	String penType = "中号毛笔绘制";
    	this.color.bepaint(penType, name);
    }

}