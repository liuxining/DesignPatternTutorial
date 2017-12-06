
import java.util.*;

/**
 * 
 */
public abstract class ComputerBuilder {

    /**
     * Default constructor
     */
    public ComputerBuilder() {
    }

    /**
     * 
     */
    protected Computer computer = new Computer();



    /**
     * @return
     */
    public abstract void buildCPU();

    /**
     * @return
     */
    public abstract void buildMemory();

    /**
     * @return
     */
    public abstract void buildDisk();

    /**
     * @return
     */
    public abstract void buildHost();

    /**
     * @return
     */
    public Computer getComputer() {
    	return computer;
    }

}