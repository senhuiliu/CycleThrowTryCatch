/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class Cycle {
    
  
   private double numberOfWheels;
   private double weight;

   Cycle(double numberOfWheels, double weight){
      
       this.numberOfWheels = numberOfWheels;
       this.weight = weight;
      
       try {
           if(numberOfWheels<=0 || weight<=0) {
               throw new Exception("Number of Wheels or Weight can not be less than zero");
           }
       } catch(Exception e) {
           System.out.println(e);
       }
   }

   public void print() {
       System.out.println("Number Of wheels :" + numberOfWheels);
       System.out.println("Weight " + weight);
   }
}
