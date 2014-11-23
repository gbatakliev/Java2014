/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upr2;

/**
 *
 * @author fmi
 */
public class Upr2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Задача 14;
       int m[] = { 5, -6, -8, 30, 0, 45, -4, 17 };
       int сума = 0;
       for (int i = 0; i < m.length; i++) {
       if (m[i] <= 0) {
       сума += m[i];
       continue;
       }
            System.out.println("m[" + i + "] = " + m[i]);
            }
            System.out.println("Сумата на отрицателните числа е "+ сума);
       
        
       //задача 15;
        for (int i = 1; i <= 6; i++) 
        {
        for(int j = 1; j <= i; j++) 
            System.out.print('A');
            System.out.println();
        }
    
    }
    
}
