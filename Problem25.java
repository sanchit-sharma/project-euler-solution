/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sanchit
 */
public class Problem25 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    
    public static void main(String[] args) throws Exception {
        
        List<BigInteger> list = new ArrayList();
        list.add(BigInteger.ZERO);
        list.add(BigInteger.ONE);
        int i = 2;
        boolean flag = true;
        while(flag == true)
        {
            BigInteger n = list.get(i-1).add(list.get(i-2));
            String str = String.valueOf(n);
            if(str.length()==1000)
                flag = false;
            i++;
            list.add(n);
        }
        System.out.println(i-1);
        
    }
}
