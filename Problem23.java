/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sanchit
 */
public class Problem23 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        List<Integer> abundantNumbers = new ArrayList<>();
        
        int[] isSumOf2Abundants = new int[28124];
        
        int sum = 0;
        
        for(int i=1; i<=28123; i++)
        {
            if(abundant(i))
                abundantNumbers.add(i);
        }
        
        for(int i = 0; i<abundantNumbers.size()-1; i++)
        {
            for(int j = i; j<abundantNumbers.size(); j++)//j=i is important as 12+12 is also sum of abundant numbers
            {
                Integer a = abundantNumbers.get(i);
                Integer b = abundantNumbers.get(j);
                int sum1 = a+b;
                if(sum1>28123)
                {
                    break;
                }
                else
                    isSumOf2Abundants[sum1] = 1;
            }
        }
        for(int i = 0; i<=28123; i++)
        {
            if(isSumOf2Abundants[i]!=1)
                sum+=i;
        }
        System.out.println(sum);
    }
    
    private static boolean abundant(int i) {
        
        int sum = 1;
        for(int j = 2; j<=Math.sqrt(i); j++)
        {
            if(i%j==0)
            {
                if(j!=(i/j))
                    sum+=j+(i/j);
                else
                    sum+=j;
            }
        }
        return sum>i;
    }
}
