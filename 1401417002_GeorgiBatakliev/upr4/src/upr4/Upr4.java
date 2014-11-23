/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upr4;

public class Upr4 {

    public static void main(String[] args) {
        String Names[] = {"Iva", "Mariq", "Georgi", "Ivan", "Petar", "Marin"};
        nizoveZapochvashtiS(Names, "Iv");
        nizoveSadarjashtiI(Names, "i");
        nizoveZavarshvashtiNaIn(Names, "in");
       
    }
    
    public static void nizoveZapochvashtiS(String n[], String Search) {
        System.out.println("nizoveZapochavashtiS" + Search + ":");
        for(int i=0; i<n.length; i++)
        if(n[i].startsWith(Search))
        System.out.println(n[i]);  
    }
        //zadacha 1;
        
    public static void nizoveSadarjashtiI(String m[], String Search) {
        System.out.println("nizoveSadarjashtiI" + Search + ":");
        for(int i=0; i<m.length; i++)
        if(m[i].toLowerCase().contains(Search.toLowerCase()))
        System.out.println(m[i]);
    }
        //zadacha 2;    
    
    public static void nizoveZavarshvashtiNaIn(String l[], String Search) {
        System.out.println("nizoveZavarshvashtiNaIn" + Search + ":");
        for(int i=0; i<l.length; i++)
        if(l[i].endsWith(Search))    
        System.out.println(l[i]);
        //zadacha 3;    
    }
}
