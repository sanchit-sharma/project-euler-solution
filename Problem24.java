/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sanchit
 */
public class Problem24 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    static List<String> list = new ArrayList<>();
    void heapPermutation(int a[], int size, int n) 
    { 
        
        if (size == 1) 
        {
            String[] str = new String[a.length];
            
            for(int i = 0; i< a.length; i++)
            {
                str[i] = String.valueOf(a[i]);
            }
            list.add(Arrays.toString(str));
        }
  
        for (int i=0; i<size; i++) 
        { 
            heapPermutation(a, size-1, n); 
  
            
            if (size % 2 == 1) 
            { 
                int temp = a[0]; 
                a[0] = a[size-1]; 
                a[size-1] = temp; 
            } 
  
            
            else
            { 
                int temp = a[i]; 
                a[i] = a[size-1]; 
                a[size-1] = temp; 
            } 
        } 
    }
    public static void main(String[] args) throws Exception {
        
        Problem24 obj = new Problem24();
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        obj.heapPermutation(arr, arr.length, arr.length);
        Collections.sort(list);
        System.out.print(list.get(999999));
        
    }
}
