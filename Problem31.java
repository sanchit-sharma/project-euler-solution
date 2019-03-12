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
public class Problem31 {
    public static void main(String[] args) {
        int[] coins={1,2,5,10,20,50,100,200};
        int[] total = new int[201];
        
        
        total[0]=1;
        
        
        for(int i=0;i<8;i++)
        {
            for(int j= coins[i];j<201;j++)
                total[j]+=total[j-coins[i]];
        }
        
        
        System.out.print(total[200]);
        
    }
}
