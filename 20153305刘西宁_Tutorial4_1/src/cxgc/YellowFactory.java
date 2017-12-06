package cxgc;

import java.util.*;

/**
 * 
 */
public class YellowFactory implements PFactory {

    /**
     * Default constructor
     */
    public YellowFactory() {
    }


    /**
     * @return
     */
    public Man productMan() {
    	return new YellowMan();
    }

    /**
     * @return
     */
    public Woman productWoman() {
    	return new YellowWoman();
    }

}