/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.Scanner;

/**
 *
 * @author sanchit
 */
public class Problem28constantTime {

   
    
    public static void main(String[] args) {
    // TODO code application logic here
    Scanner scan = new Scanner(System.in);

    int i=scan.nextInt();
    int sum = 1;
    int p =1;
    int answer = fun((i-1)/2);
    System.out.println(answer+1);
    }

    private static int fun(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int j = (int) Math.pow(i, 3);
        int k = (int) Math.pow(i, 2);
        return (16*j)/3 + 10*k + (26*i)/3;
        
    }
}
