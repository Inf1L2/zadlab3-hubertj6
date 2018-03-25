/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author wlasciciel
 */
public class zad_3_3 {
    public static void iterac()
    {
        int a,b,c=1;
        Scanner od =new Scanner(System.in);
     System.out.print("potegowanie iteracyjnie\n");
     System.out.print("Podaj podstawe ");
     a=od.nextInt();
     System.out.print("podaj potęge ");
     b=od.nextInt();
     if(a==1 || b==0) c=1;
     else
     {
     for(int i=0; i<b;i++)
     {c=c*a;
     }
    }
     System.out.print(c);
    }
    public static int rek(int a, int b)
    { 
        int x;
        if (b==0) return 1;
        if(b%2!=0) return x=rek(a,(b-1));
        else  a=rek(a,b/2);
        return a^2;
         
    
    
    }
    
    
    
    public static void main(String[] args)
    {
        zad_3_3.iterac();
        int x,y;
         Scanner od =new Scanner(System.in);
     System.out.print("potegowanie iteracyjnie\n");
     System.out.print("Podaj podstawe ");
     x=od.nextInt();
     System.out.print("podaj potęge ");
     y=od.nextInt();
        zad_3_3.rek(x,y);
        }
}
    

