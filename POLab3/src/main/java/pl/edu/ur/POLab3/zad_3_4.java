/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author wlasciciel
 */
public class zad_3_4 {

    public static void main(String[] args) {
    double tab[] = new double[20];
    tab[1]=1;
    tab[0]=1;
    for (int i=2; i<20; i++)
        tab[i]=tab[i-2]+tab[i-1];
   
    for (int i=0; i<20; i++) 
        System.out.println(i+1 + " liczba = " + tab[i]);
}
}
    

