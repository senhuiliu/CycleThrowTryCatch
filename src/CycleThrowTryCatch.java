
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class CycleThrowTryCatch {
  
   public static void main(String args[]) {
  
       double numberOfWheels;
       double weight;
      
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number of Wheels of Cycle:");
       numberOfWheels = sc.nextDouble();
      
       System.out.println("Enter Weight of Cycle :");
       weight = sc.nextDouble();
      
       Cycle C1 = new Cycle(numberOfWheels,weight);
       C1.print();
   }
}