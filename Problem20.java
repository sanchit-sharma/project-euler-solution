/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.math.BigInteger;

/**
 *
 * @author sanchit
 */
public class ProjectEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigInteger fact = factorial(100);
        BigInteger sum = BigInteger.ZERO;
        BigInteger i = fact;
        while(i.compareTo(BigInteger.ZERO)==1)
        {
            BigInteger rem = i.mod(BigInteger.valueOf(10));
            sum = sum.add(rem);
            i = i.divide(BigInteger.valueOf(10));
        }
        System.out.println(sum);
    }

    private static BigInteger factorial(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(i==1 )
            return BigInteger.ONE;
        else
            return BigInteger.valueOf(i).multiply(factorial(i-1));
                    
    }
    
}
