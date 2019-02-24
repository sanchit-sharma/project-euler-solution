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
public class Problem28 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1;
        int sum = 1;
        int p =1;
        while(i<1002001)
        {
            int i1 = i +(2*p) ;
            int i2 = i1 +2*p;
            int i3 = i2+2*p;
            int i4 = i3+2*p;
            sum = sum + i1+i2+i3+i4;
            i=i4;
            p++;
            
        }
        System.out.println(sum);
    }
}
