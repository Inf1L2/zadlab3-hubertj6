
package pl.edu.ur.POLab3;

import java.util.Scanner;

public class zad_1_4 {

    public static void main(String[] args){
       
        int a,b,c;
        System.out.print("Klasa pokazujaca zastosowanie presunięcia lewo(>>)  i prawo(<<) stornnego oraz lewostronnego bez znaku(>>>): \n");
        Scanner scan = new Scanner(System.in);
        System.out.print("podaj liczbe na ktorej bedziemy pracować ");
        c=scan.nextInt();
        System.out.print("po pierwsze: przesuniecie w lewo ze znakiem.\n Podaj o ile chcesz przesunąć bitów");
        a=scan.nextInt();
        b=c>>a;
        System.out.print("wynik to "+b+"\n");
        System.out.print("po drugie: przesuniecie w lewo ze znakiem.\n Podaj o ile chcesz przesunąć bitów");
        a=scan.nextInt();
        b=c<<a;
        System.out.print("wynik to "+b+"\n");
        System.out.print("po trzecie: przesuniecie w lewo ze znakiem.\n Podaj o ile chcesz przesunąć bitów");
        a=scan.nextInt();
        b=c>>>a;
        System.out.print("wynik to "+b+"\n");
    
    
    
    }

   
}
