/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author sanchit
 */
public class Problem21 {

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
            if(sum==i)//if sum of pd is equal to the no. then it is not amicable no.
                continue;//therefore continue;
            map.put(i, sum);//put no. as key and sum of its pd as value
            if(map.containsKey(sum))
            {
                if(map.get(sum)==i)//if sum of pd is equal to some no. already in map
                {
                    if(!arr.contains(i))//we don't want same no. twice
                        arr.add(i);//so we check 
                    if(!arr.contains(sum))//for both numbers
                        arr.add(sum);//in the arraylist of amicable numbers
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
