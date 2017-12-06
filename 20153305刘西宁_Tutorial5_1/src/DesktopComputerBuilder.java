
import java.util.*;

/**
 * 
 */
public class DesktopComputerBuilder extends ComputerBuilder {

    /**
     * Default constructor
     */
    public DesktopComputerBuilder() {
    }

    /**
     * @return
     */
    public void buildCPU() {
    	computer.setCpu("台式机cpu");
    }

    /**
     * @return
     */
    public void buildMemory() {
    	computer.setMemory("台式机内存");
    }

    /**
     * @return
     */
    public void buildDisk() {
    	computer.setDisk("台式机硬盘");
    }

    /**
     * @return
     */
    public void buildHost() {
    	computer.setHost("台式机主机");
    }

}