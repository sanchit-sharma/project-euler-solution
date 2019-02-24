/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.HashSet;

/**
 *
 * @author sanchit
 */
public class Problem29 {
    public static void main(String[] args) {
    // TODO code application logic here
    
    HashSet list = new HashSet<>();
    for(int a=2; a<=100; a++)
    {
        for(int b = 2; b<=100; b++)
        {
            list.add(Math.pow(a, b));
        }
    }
    System.out.print(list.size());
        
    }
}
