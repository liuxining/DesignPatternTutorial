package cxgc;

import java.util.*;

/**
 * 
 */
public class WhiteFactory implements PFactory {

    /**
     * Default constructor
     */
    public WhiteFactory() {
    }


    /**
     * @return
     */
    public Man productMan() {
    	return new WhiteMan();
    }

    /**
     * @return
     */
    public Woman productWoman() {
    	return new WhiteWoman();
    }

}