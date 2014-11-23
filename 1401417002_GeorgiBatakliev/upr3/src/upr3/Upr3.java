/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upr3;
import java.util.Scanner;
public class Upr3 {
        // TODO code application logic here
     public static int max(int i1, int i2) {
        return i1>i2?i1:i2;
        }

    public static void srednoaritmetichno(double m[]) {
        double sum = 0;
        for (int i = 0; i < m.length; i++)
        sum += m[i]; 
        double result = sum / m.length;
        System.out.println("Средно аритметичната сума е: " + result);

    }
    public static void main(String[] args) {
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
            System.out.println(max(i1, i2));
        //задача 1;
        
        double m[] = { 85, -25, 25, -1, 4 };
            srednoaritmetichno(m);
            //задача 2;
       
        double sum = 0;
        for (int i = 0; i < m.length; i++)
        if (m[i] > 0)
            sum += m[i];
            System.out.println("Сумата на положителните елементи: " + sum);
            //задача 3;
            
        for (int i = 0; i < m.length; i++)
        sum += Math.pow(m[i], 2);
        double result = Math.sqrt(sum);
            System.out.println("Средно квадратично: " + result);
            //задача 4;
        
        for (int i = 0; i < m.length; i++)
        if (m[i] > 3)
        sum += Math.pow(m[i], 2);
            System.out.println("Сумата от квадратите > 3: " + sum);
            //задача 5;
        
        for (int i = 0; i < m.length; i++)
        sum += Math.abs(m[i]);
            System.out.println("Сумата от абсолютните стойности: " + sum);
            //задача 6;
        
        double maxElement = m[0]; 
        for (int i = 1; i < m.length; i++)
        if (maxElement < m[i]) 
        maxElement = m[i]; 
            System.out.println("Максимален елемент: " + maxElement);
            //задача 7;
        
        double minElement = m[0];
        for (int i = 1; i < m.length; i++)
        if (minElement > m[i])
        minElement = m[i];
            System.out.println("Минимален елемент: " + minElement);
            //задача 8;
        
        for (int i = 0; i < m.length; i++)
        if (i % 2 == 0)
        sum += m[i];
            System.out.println("Сума от числата на четна позиция: " + sum);
            //задача 9;
        
        Scanner object = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = object.nextInt();
        String zeros = "";
        String newNumber = "";
        String lastZero = "";
        String in = "";
        String zeroBuffer = "";
        boolean check = true;
        while (check == true) {
        int WholePart = number / 2;
        int Rest = number % 2;  
            number = WholePart; 
        if (WholePart != 0) { 
        if (Rest != 0) {
            in = 1 + zeros + newNumber;
            newNumber = in;
            }
        else
            {              
            zeroBuffer = "0" + zeros; 
            }
            }
        else        
        {
        System.out.println(lastZero + zeroBuffer + newNumber);
        check = false;
        }
        }
        object.close();
        //задача 10;
        
        
    }        
}

 
