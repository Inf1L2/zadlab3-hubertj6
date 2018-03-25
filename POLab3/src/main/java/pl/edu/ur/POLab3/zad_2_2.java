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
public class zad_2_2 { 
    public static void main(String[] args)
    {
        String s= new String("to jeszcze wiem");
        String s1= new String("to tego już mniej rozumiem");
        String s2= new String("Tego nie rozumiem");
        String s3= new String("czarna magia");
        System.out.println(s.toCharArray());//String zmieniany jest na tablice znaków
        System.out.println(s.getBytes());// Koduje ten ciąg do sekwencji bajtów za pomocą nazwanego zestawu znaków, przechowując wynik w nowej tablicy bajtów
        System.out.println(s.equals(s2));//porównanie 2 stringów
        System.out.println(s.equalsIgnoreCase(s3));//porównanie 2 stringów bez wzgledu na wielkość liter
        System.out.println(s.compareTo(s2));//Porównuje leksykograficznie dwa ciągi, ignorując różnice wielkości liter.
        System.out.println(s.compareToIgnoreCase(s2));//
        System.out.println(s.indexOf('e')); //Indeks podanego char - pierwsze wystąpienie
        System.out.println(s.lastIndexOf('o'));//Indeks podanego char - ostatnie wystąpienie
        System.out.println(s.substring(6));//podział stringów na substringi zadczynając od podanego indeks
        System.out.println(s.substring(0,6));//podział od do podanego indekxu
        System.out.println(s.replace('a','u'));//zamiania litery w stringu
        System.out.println(s3.trim());//przycięcie stringa o nadmiarowe poprzedzające i nadmiarowe białe zanaki
        System.out.println(s.toLowerCase());//zmiana liter na małe
        System.out.println(s.toUpperCase());//zmiana liter na duże
        String[] sPodzial = s.split("szc");
        String cze1 = sPodzial[0];
        String cze2 = sPodzial[1];
        System.out.println(cze1);
        System.out.println(cze2);
    }
    }
    
    
    
    
    
    

    


