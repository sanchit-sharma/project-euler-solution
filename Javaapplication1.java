/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

//import java.math.BigInteger;



public final class Javaapplication1  {
	
    /**
     *
     * @param args
     */
    public static void main(String[] args) 
        {
            int sum = 11;
            for(int i = 1; i<1000; i++)
            {
                
                if(i/100==0)
                    sum = sum + lessThanHundred(i);
                else 
                    sum = lessThanThousand(i, sum);
                
            }
            System.out.println(sum);
            
            
            
        }
        
        
        static int lessThanTwenty(int i)
        {
            switch(i){
                case 1:
                case 2:
                case 6:
                case 10: return 3;
                case 3:
                case 7:
                case 8: return 5;
                case 4:
                case 5:
                case 9: return 4;
                case 11: 
                case 12: return 6;
                case 15:
                case 16: return 7;
                case 13:
                case 14:
                case 18:
                case 19: return 8;
                case 17: return 9;
                default: return 0;//for zero
            
        }
        }
        static int lessThanHundred(int i){
            if(i<20)
                return lessThanTwenty(i);
            int temp =i;
            int div = temp/10;
            switch(div){
                case 9:
                case 2:
                case 3:
                case 8: return 6 + lessThanTwenty(temp%10);
                case 4:
                case 5:
                case 6: return 5 + lessThanTwenty(temp%10);
                case 7: return 7 + lessThanTwenty(temp%10);
                default : return 0; 
            }
        
        }
        
        static int lessThanThousand(int i,int sum)
        {
            int temp = i;
            int div = temp/100;
            sum = sum + 7 + lessThanTwenty(div);
            int rem = temp%100;
            if(rem!=0)//not equal to 200,300,400...900
                sum = sum + 3 + lessThanHundred(rem);
            return sum;
            
        }
        
        
                
    

    
	
}
	
