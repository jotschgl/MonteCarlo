/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.fhv.montecarlo;

import java.math.BigInteger;


/**
 *
 * @author Johannes
 */
public class MonteCarlo {

   


    private MonteCarlo( ) {
    }

    public static double computePI(long randoms) {
        double inside = 0;
        double all = 0;
        for (long i = 0; i < randoms; i++) {
            double x = Math.random();
            double y = Math.random();
            all++;
            if ((y * y + x * x) < 1) {
                inside++;
            }
        }
        return inside /all* 4.0;
    }
}
