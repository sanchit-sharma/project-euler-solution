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
public class Problem26 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int max = Integer.MIN_VALUE;
        int i=2;
        int answer = 0;
        while(i<1000)
        {
            int value = getValue(i);
            if(value>max)
            {
                max=value;
                answer=i;
            }
            if(max>i)
                break;
            i++;
        }

        System.out.println(answer);

       }   

       private static int getValue(int i) {

           int[] arr = new int[i];
           int dividend = 1;
           int count = 0;
           while(true)
           {
               int rem = dividend%i;
               if(arr[rem]==1)
                   break;
               arr[rem] = 1;
               dividend=rem*10;
               count++;

           }
           return count;
       }
}
