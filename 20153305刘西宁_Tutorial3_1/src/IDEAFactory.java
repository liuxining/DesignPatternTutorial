
import java.util.*;

/**
 * 
 */
public class IDEAFactory implements Factory {

    /**
     * Default constructor
     */
    public IDEAFactory() {
    }

    /**
     * @return
     */
    public Encipherment createEncipherment() {
        return new IDEA();
    }

}