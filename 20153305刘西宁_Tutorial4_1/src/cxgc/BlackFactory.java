package cxgc;

import java.util.*;

/**
 * 
 */
public class BlackFactory implements PFactory {

    /**
     * Default constructor
     */
    public BlackFactory() {
    }


    /**
     * @return
     */
    public Man productMan() {
    	return new BlackMan();
    }

    /**
     * @return
     */
    public Woman productWoman() {
    	return new BlackWoman();
    }

}