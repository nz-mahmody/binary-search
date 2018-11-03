/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author pasargad
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner d=new Scanner(System.in);
        int a=d.nextInt();
        int []b=new int [a];
        int t;
        for(int i=0;i<b.length;i++)
        {
            b[i]=d.nextInt();
        }
         int j,i;
        for(j=0;j<b.length;j++)
        {
            for(i=0;i<b.length-j-1;i++)
            {
                if(b[i]>b[i+1])
                {
                    t=b[i];
                    b[i]=b[i+1];
                    b[i+1]=t;
                }
            }
        }
        int s=0;
        int e=b.length-1;
        int f=d.nextInt();
        int m;
        while(s!=e+1)
        {
            m=(s+e)/2;
            if(b[m]<f)
                s=m+1;
            if(b[m]>f)
                e=m-1;
           if(b[m]==f)
               System.out.print(m);
            else
               System.out.print(-1);
                
        }
    }
    
}
