/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author sanchit
 */
public class Problem27 {

   
    public static void main(String[] args) {
    int nMax = 0;
    int aMax = 0;
    int bMax = 0;
    for(int a=-1000; a<1000;a++)
    {
        for(int b = -1000; b<1000; b++)
        {
            int n = 0;
            while(isPrime(Math.abs(n*n + a*n + b)))
                n++;
            if(n>nMax)
            {
                nMax = n;
                aMax = a;
                bMax = b;

            }
        }   
    }
    System.out.println(aMax*bMax);
    }

    private static boolean isPrime(int abs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(abs == 0 || abs ==1 || abs%2==0)
            return false;
        for(int i = 2; i<Math.sqrt(abs); i++)
        {
            if(abs%i==0)
                return false;
        }
        return true;
    }
}
