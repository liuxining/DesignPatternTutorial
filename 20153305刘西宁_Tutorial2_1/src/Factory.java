
import java.util.*;

/**
 * 
 */
public class Factory {

    /**
     * Default constructor
     */
    public Factory() {
    }

    /**
     * @param args 
     * @return
     */
    public static People factoryMathod(String args) {
    	if("M".equalsIgnoreCase(args)){
    		return new Man();
    	}
    	else if("W".equalsIgnoreCase(args)){
    		return new Woman();
    	}
    	else if("R".equalsIgnoreCase(args)){
    		return new Robot();
    	}
    	else{
    		return null;
    	}
    }

}