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
public class Problem30 {
    public static void main(String[] args) {
        int totalSum=0;
        for(int i=2; i<355000;i++)//since pow(9,5)*7 is still a 6 digit number so we take pow(9,6)*6 as upperbound
        {
            int sum=0;
            for(int j=i; j>0; j=j/10)
            {
                int rem = j%10;
                
                sum+=Math.pow(rem, 5);
                if(sum>i)
                    break;
            }
            
            if(sum==i)
                totalSum+=i;
        }
        System.out.print(totalSum);
        
    }
}
