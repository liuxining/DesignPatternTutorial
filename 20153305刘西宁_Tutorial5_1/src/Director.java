
import java.util.*;

/**
 * 
 */
public class Director {

    /**
     * Default constructor
     */
    public Director() {
    }

    /**
     * 
     */
    private ComputerBuilder cb;


    /**
     * @return
     */
    public Computer construct() {
    	cb.buildCPU();
    	cb.buildDisk();
    	cb.buildMemory();
    	cb.buildHost();
    	return cb.getComputer();
    }

    /**
     * @param cb 
     * @return
     */
    public void setComputerBuilder(ComputerBuilder cb) {
    	this.cb = cb;
    }

}