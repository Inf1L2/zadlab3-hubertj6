/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;
import static jdk.nashorn.internal.parser.TokenType.NOT;

/**
 *
 * @author wlasciciel
 */
public class zad_1_7 {
    public static void main(String[] args)
    {
        int a,b;
    System.out.print("NOT i XOR działanie i zastosowanie\n");
    Scanner ojak = new Scanner(System.in);
    System.out.print("podaj pierwszą licze ");
    a=ojak.nextInt();
    System.out.print("podaj drugą liczbe ");
    b=ojak.nextInt();
    System.out.print("Operacja Not dal podanych liczb:\n");
    if (a != b){System.out.print("Są różne:\n");   
    }
    else System.out.print("Są takie same: ");
    System.out.print("Operacja Xor dal podanych liczb\n");
    if (a==1 ^ b==1){System.out.print("jedna z tych liczb to 1:\n");   
    }
    else System.out.print("Żadna lub obie z tych liczb to 1:\n");
    
    }
}
