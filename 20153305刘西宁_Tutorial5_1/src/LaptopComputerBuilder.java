
import java.util.*;

/**
 * 
 */
public class LaptopComputerBuilder extends ComputerBuilder {

    /**
     * Default constructor
     */
    public LaptopComputerBuilder() {
    }

    /**
     * @return
     */
    public void buildCPU() {
    	computer.setCpu("笔记本cpu");
    }

    /**
     * @return
     */
    public void buildMemory() {
    	computer.setMemory("笔记本内存");
    }

    /**
     * @return
     */
    public void buildDisk() {
    	computer.setDisk("笔记本硬盘");
    }

    /**
     * @return
     */
    public void buildHost() {
    	computer.setHost("笔记本主机");
    }

}