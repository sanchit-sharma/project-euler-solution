/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author sanchit
 */
public class Problem20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        int answer = 0;
        for(int i =1;i<=10000;i++)
        {
            int sum = sumOfPD(i);
            if(sum==i)
                continue;
            map.put(i, sum);
            if(map.containsKey(sum))
            {
                if(map.get(sum)==i)
                {
                    if(!arr.contains(i))
                        arr.add(i);
                    if(!arr.contains(sum))
                        arr.add(sum);
                }
            }
        }
        for(int item: arr)
            answer+=item;
        System.out.print(answer);
                    
    }

    private static int sumOfPD(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int sum = 1;
        for(int j=2;j<Math.sqrt(i);j++)
        {
            
            if(i%j==0)
                sum = sum+j+i/j;
        }
        return sum;
    }
    
}
