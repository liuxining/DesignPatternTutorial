
import java.util.*;

/**
 * 
 */
public class DESFactory implements Factory {

    /**
     * Default constructor
     */
    public DESFactory() {
    }

    /**
     * @return
     */
    public Encipherment createEncipherment() {
        return new DES();
    }

}