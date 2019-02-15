/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author sanchit
 */
public class Problem19 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * 
     */
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int d=6,m=1,y=1901;
        int count =1;
        while(y<2000)
        {
            d=d+7;
            switch(m){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    if(d>31){
                        d =d-31;
                        m++;
                        }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if(d>30){
                        d = d-30;
                        m++;
                    }
                    break;
                case 2:
                    if(leapYear(y))
                    {
                        if(d>29)
                        {
                        d = d-29;
                        m++;
                        }
                    }
                    else{
                        if(d>28)
                        {
                        d = d-28;
                        m++;
                        }
                    }
                    break;
                case 12:
                    if(d>31)
                    {
                        d = d-31;
                        m=1;
                        y++;
                    }
            }
            if(d==1)
                 count++;
}
        System.out.println(count);
}   

    private static boolean leapYear(int y) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(y%4 == 0)
        {
            if(y%100==0)
            {
                return y%400 == 0;
            }
            return true;
        }
        return false;
    }
}