/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author sanchit
 */
public class Problem22 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader reader  = new BufferedReader(new FileReader("C:\\Users\\sanchit\\desktop\\test.txt"));
        
        String line ;
        String[] words = null;
        int i=0;
        int answer = 0;
        while((line = reader.readLine())!=null)
        {
             words = line.split(",");
        }
        Arrays.sort(words);
        for(String item:words){
            int j=0;
            i++;
            int sum =0;
            while(j<item.length())
            {
                if(item.charAt(j)!='"')
                    sum = sum+item.charAt(j)-'A'+1;
                j++;
            }
            answer += i*sum;
        }
        System.out.print(answer);
    }
}
