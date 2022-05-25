/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addition;
 import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number1;
       int number2;
       
       System.out.print("Enter First integer: ");
       number1 = input.nextInt();
        System.out.print("Enter Second integer: ");
       number2 = input.nextInt();
        
     System.out.println(number1 + "=" + number2 + ": " + (number1==number2));
      System.out.println(number1 + "<" + number2 + ": " + (number1<number2));
      System.out.println(number1 + ">" + number2 + ": " + (number1>number2));
    }
    
}
